package dao;

import domain.Sale;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class SaleDAO {

  private EntityManagerFactory ETMFactory;
  private EntityManager ETM;

  public SaleDAO() {
    this.ETMFactory = Persistence.createEntityManagerFactory("Ecommerce");
    this.ETM = ETMFactory.createEntityManager();
  }

  public Long register(Sale sale) {
    ETM.getTransaction().begin();
    ETM.persist(sale);
    ETM.getTransaction().commit();
    closeAll();
    return sale.getId();
  }

  private void closeAll() {
    ETM.close();
    ETMFactory.close();
  }

}
