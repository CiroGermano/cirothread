package com.example.demo.thread;

import java.util.ArrayList;
import java.util.List;

public class Pessoa extends Thread{

	private String nome;
	private List<Pessoa> filhos;
	private List<Pessoa> todos;
	
	public Pessoa() {
		this.filhos = new ArrayList<Pessoa>();
		this.todos = new ArrayList<Pessoa>();
	}
	
	public Pessoa(String nome) {
		this.nome = nome;
		this.filhos = new ArrayList<Pessoa>();
		this.todos = new ArrayList<Pessoa>();

	}
	
	public Pessoa(String nome, List<Pessoa> filhos) {
		super();
		this.nome = nome;
		this.filhos = filhos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Pessoa> getFilhos() {
		return filhos;
	}

	public void setFilhos(List<Pessoa> filhos) {
		this.filhos = filhos;
	}

	public void addFilho(Pessoa filho) {
		this.filhos.add(filho);
	}
	
	public void showFilhos() {
		this.filhos.forEach(filho -> System.out.println(" " + filho.nome));
	}
	
	public List<Pessoa> getTodos() {
		return todos;
	}

	public void setTodos(List<Pessoa> todos) {
		this.todos = todos;
	}
	
	public List<Pessoa> getDescendentes(Pessoa pessoa){
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		if(pessoa.getFilhos() == null || pessoa.getFilhos().isEmpty()) {
			return new ArrayList<Pessoa>();
		}
		
		List<Pessoa> retorno = new ArrayList<>();
		
		pessoa.getFilhos().forEach(filho -> {
			retorno.add(filho);
			retorno.addAll(getDescendentes(filho));
		});
		
		return retorno;
	}
	
	public void run() {
		this.todos.add(this);
		this.filhos.forEach(filho -> {
			this.todos.add(filho);
			this.todos.addAll(filho.getDescendentes(filho));
		});
	}
	
}
