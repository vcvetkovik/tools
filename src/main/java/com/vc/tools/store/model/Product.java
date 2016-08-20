package com.vc.tools.store.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity(name = "PRODUCT")
public class Product {

  @Id
  @Column(name = "ID", nullable = false)
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  @Column(name = "NAME", nullable = false)
  private String name;
  @ManyToMany
  @JoinTable(name = "STORE_PRODUCT", joinColumns = @JoinColumn(name = "PRODUCT_ID", referencedColumnName = "ID"),
      inverseJoinColumns = @JoinColumn(name = "STORE_ID", referencedColumnName = "ID"))
  private List<Store> stores;

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

}
