package com.emc.shoppingcart.dao;

import java.util.List;

import com.emc.shoppingcart.model.Product;

public interface ProductDao {

	public void addProduct(Product product);
	public List<Product> getProducts();
	public void deleteProduct(long productId);
	public void UpdateProduct(Product product);
	public Product getProductById(int productId);
	public void addproductToFile(Product product);
}
