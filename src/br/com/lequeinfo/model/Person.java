package br.com.lequeinfo.model;

public class Person {

    private String name;
    private int age;
    
  //gettersm setters, toString
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Person{Nome: "+this.name+", Idade: "+this.age+"}";
	}
    
}