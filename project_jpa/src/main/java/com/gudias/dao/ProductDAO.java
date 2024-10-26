package com.gudias.dao;

import com.gudias.domain.Product;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ProductDAO implements IProductDAO {

  private EntityManagerFactory entityManagerFactory;
  private EntityManager entityManager;

  public ProductDAO() {
    this.entityManagerFactory = Persistence.createEntityManagerFactory("TarefaJPA");
    this.entityManager = this.entityManagerFactory.createEntityManager();
  }

  @Override
  public Product register(Product product) {
    entityManager.getTransaction().begin();
    entityManager.persist(product);
    entityManager.getTransaction().commit();
    entityManager.close();
    entityManagerFactory.close();
    return product;
  }
}
