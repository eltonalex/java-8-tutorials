package br.com.lequeinfo.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.lequeinfo.model.Person;

public class TestStreamsFilterAndCollectBeforeJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("-----------------------------------------");
		System.out.println("Streams filter() and collect()");
		System.out.println("-----------------------------------------");
		
		List<String> lines = Arrays.asList("spring", "node", "mkyong");
		List<String> resultArr = getFilterOutput(lines, "mkyong");
		for (String temp : resultArr) {
			System.out.println(temp); // output : spring, node
		}
		
		System.out.println("-----------------------------------------");
		System.out.println("Streams filter(), findAny() and orElse()");
		System.out.println("-----------------------------------------");
		
		List<Person> persons = Arrays.asList(
                new Person("mkyong", 30),
                new Person("jack", 20),
                new Person("lawrence", 40)
        );

        Person result = getStudentByName(persons, "lawrence");
        System.out.println(result);

	}

	private static List<String> getFilterOutput(List<String> lines, String filter) {
		List<String> result = new ArrayList<>();
		for (String line : lines) {
			if (!filter.equals(line)) { // we dont like mkyong
				result.add(line);
			}
		}
		return result;
	}
	
	private static Person getStudentByName(List<Person> persons, String name) {

        Person result = null;
        for (Person temp : persons) {
            if (name.equals(temp.getName())) {
                result = temp;
            }
        }
        return result;
    }

}
