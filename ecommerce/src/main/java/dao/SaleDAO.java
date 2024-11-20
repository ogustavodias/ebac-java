package dao;

import java.util.Collection;
import java.util.List;

import domain.Sale;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

public class SaleDAO {

  @PersistenceContext
  private EntityManager ETM;

  public Long register(Sale sale) {
    ETM.persist(sale);
    return sale.getId();
  }

  public Sale search(String code) {
    Sale sale = ETM.find(Sale.class, code);
    return sale;
  }

  public Collection<Sale> searchAll() {
    List<Sale> list = ETM.createQuery(getSelectSQL(), Sale.class).getResultList();
    return list;
  }

  public void remove(Sale sale) {
    if (ETM.contains(sale)) {
      ETM.remove(sale);
    } else {
      Sale managedCustomer = ETM.find(Sale.class, sale.getId());
      if (managedCustomer != null) {
        ETM.remove(managedCustomer);
      }
    }
  }

  public Sale edit(Sale sale) {
    sale = ETM.merge(sale);
    return sale;
  }

  private String getSelectSQL() {
    StringBuilder sb = new StringBuilder();
    sb.append("SELECT obj FROM tb_sales");
    sb.append(" obj");
    return sb.toString();
  }

}
