package com.emc.shoppingcart.services;

import com.emc.shoppingcart.model.Product;

public interface ProductService {
public void addProduct(Product product);
public void RemoveProduct(long productId);
}
