package br.com.lequeinfo.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TestExtra {

	public static void main(String[] args) {
		
		System.out.println("-----------------------------------------");
		System.out.println("Estrutura utilizada antes do Java 8");
		System.out.println("-----------------------------------------\n");
		
		System.out.println("Alfabeto Utilizado:");
		String alfabeto1 = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz";
		System.out.println(alfabeto1+"\n");
		
		System.out.println("Manipulação da String:");
		List<Character> listA = new ArrayList<Character>();
		Set<Character> setA = new HashSet<Character>();
		
		for (Character character : alfabeto1.toCharArray()) {
			listA.add(character);
			setA.add(character);
		}
		
		System.out.println("Usando List:");
		System.out.println(listA);
		
		System.out.println("Usando Set:");
		System.out.println(setA+"\n");
		
		System.out.println("Alfabeto criado utilizando Arrays.asList:");
		System.out.println("É usado para retornar uma lista de tamanho fixo apoiada pela matriz especificada.\n");
		

        // creating Arrays of String type 
        String a[] = new String[] {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		List<String> alfabeto2 = Arrays.asList(a);
		
		System.out.println(alfabeto2);
		
		System.out.println("-----------------------------------------");
		System.out.println("Estrutura utilizada no Java 8");
		System.out.println("-----------------------------------------\n");
		
		System.out.println("Usando List:");
		List<Character> listA8 = alfabeto1.chars().mapToObj(e->(char)e).collect(Collectors.toList());
		System.out.println(listA8);
		
		System.out.println("Usando Set:");
		Set<Character> setA8 = alfabeto1.chars().mapToObj(c->(char)c).collect(Collectors.toSet());
		System.out.println(setA8);
		
	}

}
