package com.vc.tools.store.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "SHOPPING_LIST")
public class ShoppingList {

  @Id
  @Column(name = "ID", nullable = false)
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  @Column(name = "NAME", nullable = false)
  private String name;
  @OneToMany
  private List<ProductToBuy> products;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<ProductToBuy> getProducts() {
    return products;
  }

  public void setProducts(List<ProductToBuy> products) {
    this.products = products;
  }

}
