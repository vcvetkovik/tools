package com.vc.tools.store.repository;

import org.springframework.data.repository.CrudRepository;

import com.vc.tools.store.model.ShoppingList;

public interface ShoppingListRepository extends CrudRepository<ShoppingList, Long> {

}
