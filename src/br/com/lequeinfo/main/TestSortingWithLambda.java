package br.com.lequeinfo.main;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.lequeinfo.model.Developer;

public class TestSortingWithLambda {
	public static void main(String[] args) {

		List<Developer> listDevs = getDevelopers();
		
		System.out.println("Before Sort:");
		for (Developer developer : listDevs) {
			System.out.println(developer);
		}
		
		System.out.println("---------------");
		
		System.out.println("After Sort Idade:");
		
		//Example lambda valid, parameter type is optional
		listDevs.sort((o1, o2)->o1.getIdade()-o2.getIdade());
		
		//lambda here!
		listDevs.sort((Developer o1, Developer o2)->o1.getIdade()-o2.getIdade());
	
		//java 8 only, lambda also, to print the List
		listDevs.forEach((developer)->System.out.println(developer));
		
		System.out.println("---------------");
		
		System.out.println("After Sort Nome:");
		
		//Example lambda valid, parameter type is optional
		listDevs.sort((o1, o2)->o1.getNome().compareTo(o2.getNome()));
		
		//lambda here!
		listDevs.sort((Developer o1, Developer o2)->o1.getNome().compareTo(o2.getNome()));
	
		//java 8 only, lambda also, to print the List
		listDevs.forEach((developer)->System.out.println(developer));
		
		System.out.println("---------------");
		
		System.out.println("After Sort Salário:");
		
		//Example lambda valid, parameter type is optional
		listDevs.sort((o1, o2)->o1.getSalario().compareTo(o2.getSalario()));
		
		//lambda here!
		listDevs.sort((Developer o1, Developer o2)->o1.getSalario().compareTo(o2.getSalario()));
	
		//java 8 only, lambda also, to print the List
		listDevs.forEach((developer)->System.out.println(developer));
		
		System.out.println("---------------");
		
		System.out.println("After Sort Salário Reverse:");
		
		Comparator<Developer> salaryComparator = (o1, o2)->o1.getSalario().compareTo(o2.getSalario());
		listDevs.sort(salaryComparator.reversed());
		
		//java 8 only, lambda also, to print the List
		listDevs.forEach((developer)->System.out.println(developer));
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
