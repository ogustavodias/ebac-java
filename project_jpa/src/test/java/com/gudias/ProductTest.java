package com.gudias;

import org.junit.Assert;
import org.junit.Test;

import com.gudias.dao.ProductDAO;
import com.gudias.domain.Product;

public class ProductTest {

  @Test
  public void register() {
    ProductDAO dao = new ProductDAO();
    Product product = new Product("Teste", "Testando JPA");
    Product dbReturn = dao.register(product);
    Assert.assertNotNull(dbReturn);
  }

}
