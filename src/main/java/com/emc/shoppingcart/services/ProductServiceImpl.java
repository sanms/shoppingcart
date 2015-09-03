package com.emc.shoppingcart.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.emc.shoppingcart.dao.ProductDao;
import com.emc.shoppingcart.model.Product;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductDao productDao;	
	
	@Override
	@Transactional
	public void addProduct(Product product) {
		
		productDao.addProduct(product);
		productDao.addproductToFile(product);
	}

	@Override
	public void RemoveProduct(long productId) {
		
		productDao.deleteProduct(productId);
	}

}
