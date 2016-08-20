package com.vc.tools.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vc.tools.store.model.ShoppingList;
import com.vc.tools.store.model.Store;
import com.vc.tools.store.repository.ShoppingListRepository;
import com.vc.tools.store.repository.StoreRepository;

@Controller
public class StoreController {

  @Autowired
  private ShoppingListRepository listRepository;
  // @Autowired
  // private ProductRepository productRepository;
  @Autowired
  private StoreRepository storeRepository;

  @RequestMapping("/")
  public String getStore() {
    return "index";
  }

  @ModelAttribute("stores")
  public Iterable<Store> getAllStores() {
    return storeRepository.findAll();
  }

  @ModelAttribute("lists")
  public Iterable<ShoppingList> getAllLists() {
    return listRepository.findAll();
  }

}
