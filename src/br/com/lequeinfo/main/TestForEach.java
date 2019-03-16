package br.com.lequeinfo.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestForEach {
	public static void main(String[] args) {
		System.out.println("---------------------");
		System.out.println("forEach and Map");
		System.out.println("---------------------");
		
		// Normal way to loop a Map.
		Map<Integer, String> items = new HashMap<>();
		items.put(1, "A");
		items.put(2, "B");
		items.put(3, "C");
		items.put(4, "D");
		items.put(5, "E");
		items.put(6, "F");

		for (Map.Entry<Integer, String> entry : items.entrySet()) {
			System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
		}
		
		System.out.println("---------------------");
		
		//In Java 8, you can loop a Map with forEach + lambda expression.
		Map<Integer, String> items2 = new HashMap<>();
		items2.put(1, "A");
		items2.put(2, "B");
		items2.put(3, "C");
		items2.put(4, "D");
		items2.put(5, "E");
		items2.put(6, "F");
		
		//Saída utilizando lambda expression;
		items2.forEach((k,v)->System.out.println("Key : " + k + " Value: " + v));
		
		System.out.println("Resultado:");
		
		//Ou ainda Saída utilizando lambda expression;
		items2.forEach((k,v)->{
			System.out.println("Key : " + k + " Value : " + v);
			if("E".equals(v)){
				System.out.println("Hello E");
			}
		});
		
		
		System.out.println("---------------------");
		System.out.println("forEach and List");
		System.out.println("---------------------");
		
		//Normal for-loop to loop a List.
		List<String> items3 = new ArrayList<>();
		items3.add("A");
		items3.add("B");
		items3.add("C");
		items3.add("D");
		items3.add("E");
		
		System.out.println("Resultado:");
		for(String item : items3){
			System.out.println(item);
		}
		
		// In Java 8, you can loop a List with forEach + lambda expression 
		// or method reference.
		List<String> items4 = new ArrayList<>();
		items4.add("A");
		items4.add("B");
		items4.add("C");
		items4.add("D");
		items4.add("E");
		
		System.out.println("Resultado:");
		//lambda
		//Output : A,B,C,D,E
		items4.forEach(item->System.out.println(item));
			
		//Output : C
		items4.forEach(item->{
			if("C".equals(item)){
				System.out.println(item);
			}
		});
			
		System.out.println("Resultado:");
		
		//method reference
		//Output : A,B,C,D,E
		items4.forEach(System.out::println);
		
		System.out.println("Resultado:");
		
		//Stream and filter
		//Output : B
		items4.stream()
			.filter(s->s.contains("B"))
			.forEach(System.out::println);
	}
}
