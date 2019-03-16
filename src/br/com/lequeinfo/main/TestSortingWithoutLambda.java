package br.com.lequeinfo.main;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.lequeinfo.model.Developer;

public class TestSortingWithoutLambda {

	public static void main(String[] args) {

		List<Developer> listDevs = getDevelopers();

		System.out.println("Before Sort");
		for (Developer developer : listDevs) {
			System.out.println(developer);
		}
		
		System.out.println("---------------");
		
		//sort by age
		Collections.sort(listDevs, new Comparator<Developer>() {
			@Override
			public int compare(Developer o1, Developer o2) {
				return o1.getIdade() - o2.getIdade();
			}
		});
	
		System.out.println("After Sort Idade");
		for (Developer developer : listDevs) {
			System.out.println(developer);
		}
		
		System.out.println("---------------");
		
		//sort by name
		Collections.sort(listDevs, new Comparator<Developer>() {
			@Override
			public int compare(Developer o1, Developer o2) {
				return o1.getNome().compareTo(o2.getNome());
			}
		});
		
		System.out.println("After Sort Nome");
		for (Developer developer : listDevs) {
			System.out.println(developer);
		}
		
		System.out.println("---------------");
		
		//sort by salary
		Collections.sort(listDevs, new Comparator<Developer>() {
			@Override
			public int compare(Developer o1, Developer o2) {
				return o1.getSalario().compareTo(o2.getSalario());
			}
		});		
		
		System.out.println("After Sort Salário");
		for (Developer developer : listDevs) {
			System.out.println(developer);
		}
		
		
	}

	private static List<Developer> getDevelopers() {

		List<Developer> result = new ArrayList<Developer>();

		result.add(new Developer("mkyong", new BigDecimal("70000"), 33));
		result.add(new Developer("alvin", new BigDecimal("80000"), 20));
		result.add(new Developer("jason", new BigDecimal("100000"), 10));
		result.add(new Developer("iris", new BigDecimal("170000"), 55));
		
		return result;

	}
	
}
