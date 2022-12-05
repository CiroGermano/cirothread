package com.example.demo;

import java.util.ArrayList;

public class Animal {
	public String sigla;
    public String nome;
    public ArrayList<Link> links;
    
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<Link> getLink() {
		return links;
	}
	public void setLink(ArrayList<Link> link) {
		this.links = link;
	}
    
    @Override
    public String toString() {
    	return this.sigla + this.nome + this.links.stream().map(item -> item.toString());
    }
}
