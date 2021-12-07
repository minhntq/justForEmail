package com.saigontech.actualFinal;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class ProductDAOImpl implements ProductDAO {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public ProductDAOImpl() {
		// TODO Auto-generated constructor stub
	}

//	@Override
//	public void addStudent(Student student) {
//		sessionFactory.getCurrentSession().saveOrUpdate(student);
//		// TODO Auto-generated method stub
//
//	}

	
//	public ArrayList<Products> getProductsList() {
//		ArrayList<Products> list = (ArrayList<Products>)sessionFactory.
//				getCurrentSession().createQuery("FROM Products").
//				list();
//				ArrayList<Products> productsList = 
//						list;
//				return productsList;
//	}
	@Override
	public List<Products> getProductsList() {
		return jdbcTemplate.query("SELECT * FROM products", new BeanPropertyRowMapper<Products>(Products.class));
	}
	

}
