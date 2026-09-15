package com.oops.basics;

public class Product {

	String[] showProducts() {
		// create an array of products and return it
		// String[] products = new String[] {"Laptop","Mouse","Mobile","Pen"};
		// return products;
		return new String[] { "Laptop", "Mouse", "Mobile", "Pen" };
	}

	// takes array as parameter
	void printCategories(String[] categories) {
       //iterate the array using foreach and print
		for (String cat : categories) {
			System.out.println(cat);
		}
	}

	String offerDetails() {
		return "Onam offers available";
	}

	public static void main(String[] args) {
		// create an object of product
		Product product = new Product();
		// call offerDetails
		String offers = product.offerDetails();
		System.out.println(offers);

		// call showProducts
		String[] all = product.showProducts();
		for (String prod : all)
			System.out.println(prod);

		// create an array of categories
		String[] categories = new String[] { "Electronics", "Books", "Toys" };
		// pass this as parameter
		product.printCategories(categories);
	}
}
