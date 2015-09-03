package com.emc.shoppingcart.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.emc.shoppingcart.model.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void addProduct(Product product) {

		String sql = "insert into product(p_name,price,category,image_name)values(?,?,?,?) ";
		jdbcTemplate.update(sql, product.getpName(), product.getPrice(), product.getCategory(), product.getImageName
				());
	}

	@Override
	public List<Product> getProducts() {

		String sql = "select * from product";

		List<Product> productList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Product>(Product.class));

		return productList;
	}

	@Override
	public void deleteProduct(long productId) {

		String sql = "delete from product where p_id=?";
		jdbcTemplate.update(sql,productId);
	}

	@Override
	public void UpdateProduct(Product product) {
		// TODO Auto-generated method stub

	}

	@Override
	public Product getProductById(int productId) {
		String sql="select * from product where p_id=?";
		Product product=jdbcTemplate.queryForObject(sql, new Object[]{productId}, new BeanPropertyRowMapper<Product>(Product.class));
		return product;
	}

	@Override
	public void addproductToFile(Product product) {
		try {
			ObjectOutputStream writer=new ObjectOutputStream(new FileOutputStream("product_objects.txt"));
			writer.writeObject(product);
			System.out.println("wrote to file");
			writer.close();
			ObjectInputStream reader=new ObjectInputStream(new FileInputStream("product_objects.txt"));
			Product product1=(Product) reader.readObject();
			System.out.println(product.getpName());
			//throw new FileNotFoundException();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
