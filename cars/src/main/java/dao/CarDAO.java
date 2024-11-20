package dao;

import domain.Car;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class CarDAO {

  private EntityManagerFactory ETMFactory;
  private EntityManager ETM;

  public CarDAO() {
    this.ETMFactory = Persistence.createEntityManagerFactory("Cars");
    this.ETM = ETMFactory.createEntityManager();
  }

  public Long register(Car car) {
    ETM.getTransaction().begin();
    ETM.persist(car);
    ETM.getTransaction().commit();
    closeAll();
    return car.getId();
  }

  private void closeAll() {
    ETM.close();
    ETMFactory.close();
  }
}