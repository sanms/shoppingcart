package com.emc.shoppingcart.services;

import java.util.List;

import com.emc.shoppingcart.model.Product;

public interface ProductService {
public String addProduct(Product product);
public String RemoveProduct(long productId);
public String UpdateProduct(Product product);
public List<Product> getProducts();
}
