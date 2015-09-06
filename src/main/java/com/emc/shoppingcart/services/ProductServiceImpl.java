package com.emc.shoppingcart.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.emc.shoppingcart.dao.ProductDao;
import com.emc.shoppingcart.model.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDao productDao;

	@Transactional
	public String addProduct(Product product) {

		try {
			productDao.addProduct(product);
			// productDao.addproductToFile(product);
			return "SUCCESSFULL_UPDATE";
		} catch (Exception e) {
			return "UPDATE_FAILED";
		}
	
	}

	@Override
	public String RemoveProduct(long productId) {

		return productDao.deleteProduct(productId);
		
	}

	@Override
	public List<Product> getProducts() {

		return productDao.getProducts();
	}

	@Override
	public String UpdateProduct(Product product) {
		
		return productDao.UpdateProduct(product);
	}

}
