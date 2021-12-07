package com.saigontech.actualFinal;

import java.util.ArrayList;

public class ProductsList {

	private static ArrayList<Products> productsList;

	public static ArrayList<Products> getProductsList() {
		if ((productsList == null) || (productsList.size() == 0)) {
			productsList = new ArrayList<Products>();
		}
		System.out.println("Student List ---->" + productsList);
		return productsList;
	}

	public static void setStudentsList(ArrayList<Products> productsList) {
		ProductsList.productsList = productsList;
	}

	public static ArrayList<Products> addStudent(Products products) {
		getProductsList().add(products);
		return productsList;
	}

}
