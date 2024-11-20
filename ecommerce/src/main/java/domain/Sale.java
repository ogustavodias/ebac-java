package domain;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_sales")
public class Sale {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(unique = true, nullable = false)
  private String code;

  @ManyToOne(cascade = CascadeType.ALL)
  private Customer customer;

  @ManyToMany(cascade = CascadeType.ALL)
  private List<Product> products;

  public Sale(String code, Customer customer, List<Product> products) {
    this.code = code;
    this.customer = customer;
    this.products = products;
  }

  public Sale() {

  }

  public Long getId() {
    return id;
  }

  public String getCode() {
    return code;
  }

  public Customer getCustomer() {
    return customer;
  }

  public List<Product> getProducts() {
    return products;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  public void setProducts(List<Product> products) {
    this.products = products;
  }

}
