package com.vc.tools.store.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity(name = "PRODUCT_TO_BUY")
public class ProductToBuy {

  @Id
  @Column(name = "ID", nullable = false)
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  @ManyToOne
  @JoinColumn(name = "SHOPPINGLIST_ID", referencedColumnName = "ID")
  private ShoppingList listId;
  @OneToOne
  @JoinColumn(name = "PRODUCT_ID", referencedColumnName = "ID")
  private Product productId;
  @Column(name = "QUANTITY")
  private int quantity;

  public ShoppingList getListId() {
    return listId;
  }

  public void setListId(ShoppingList listId) {
    this.listId = listId;
  }

  public Product getProductId() {
    return productId;
  }

  public void setProductId(Product productId) {
    this.productId = productId;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

}
