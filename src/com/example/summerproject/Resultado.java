package com.example.summerproject;

public class Resultado {
	
	String nome;
	String beg;
	
	public Resultado(String nome, String hrBeg){
		this.nome=nome;
		this.beg=hrBeg;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getBeg() {
		return beg;
	}

	public void setBeg(String hrBeg) {
		this.beg = hrBeg;
	}
}
