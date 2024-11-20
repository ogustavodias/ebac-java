package domain;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_customers")
public class Customer {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false)
  private String name;

  @OneToMany(mappedBy = "customer")
  private List<Sale> sales;

  public Customer(String name) {
    this.name = name;
  }

  public Customer() {

  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public List<Sale> getSales() {
    return sales;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setSales(List<Sale> sales) {
    this.sales = sales;
  }

}
