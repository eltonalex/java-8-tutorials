package br.com.lequeinfo.model;

import java.math.BigDecimal;

public class Developer {
private Long id;
private String nome;
private BigDecimal salario;
private int idade;



public Developer( String nome, BigDecimal salario, Integer idade) {
	super();
	this.nome = nome;
	this.salario = salario;
	this.idade = idade;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public BigDecimal getSalario() {
	return salario;
}

public void setSalario(BigDecimal salario) {
	this.salario = salario;
}

public Integer getIdade() {
	return idade;
}

public void setIdade(Integer idade) {
	this.idade = idade;
}

@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Developer [nome="+this.nome+", salario="+this.salario+", idade="+this.idade+"]";
}


}
