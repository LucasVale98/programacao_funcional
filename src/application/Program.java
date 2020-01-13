package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Product;

public class Program {
	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.0));
		list.add(new Product("Notebook", 1200.0));
		list.add(new Product("Tablet", 450.0));
		list.add(new Product("Celular", 1900.0));

		//Comparator<Product> comparator = (p1, p2) -> p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
	
		
		list.sort((p1, p2) -> p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase()));

		for (Product product : list) {
			System.out.println(product);
		}

	}
}
