package com.domain;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_cars")
public class Car {

  @Id
  @Column(name = "id", nullable = false)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;  

  @Column(name = "model", nullable = false)
  private String model;

  private Brand brand;

  private List<Accessory> accessories;

  public Car(String model, Brand brand, List<Accessory> accessories) {
    this.model = model;
    this.brand = brand;
    this.accessories = accessories;
  }

  public Long getId() {
    return id;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public Brand getBrand() {
    return brand;
  }

  public void setBrand(Brand brand) {
    this.brand = brand;
  }

  public List<Accessory> getAccessories() {
    return accessories;
  }

  public void setAccessories(List<Accessory> accessory) {
    this.accessories = accessory;
  }

}
