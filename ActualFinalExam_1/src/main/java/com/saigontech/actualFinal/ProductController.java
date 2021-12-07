  package com.saigontech.actualFinal;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@CrossOrigin
@RestController
public class ProductController {
	@Autowired
	private ProductDAO productDao;

	public ProductController() {
		// TODO Auto-generated constructor stub
	}

	@RequestMapping(value = "/products", method = RequestMethod.GET)
	public List<Products> getProductsList() {
		List<Products> productList = productDao.getProductsList();
//		System.out.println("Show Controller");
//		ModelAndView model = new ModelAndView("index");
//		model.addObject("listProduct", productList);
//		model.setViewName("index");
		return  productList;
	}
}
