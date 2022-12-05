package com.example.demo.thread;

import java.util.ArrayList;
import java.util.List;

public class Familia extends Thread{
	
	private List<Pessoa> filhos;
	private List<Pessoa> familia; // resultado
	
	public Familia(List<Pessoa> filhos) {
		this.filhos = filhos;
		this.familia = new ArrayList<Pessoa>();
	}
	
	public void run() {
		if(this.filhos.isEmpty() || this.filhos == null) {
			familia = new ArrayList<Pessoa>();
		} else {
			try {
				if(filhos.size() > 1) {
					
				}
				Familia f1 = new Familia
			}
			catch(InterruptedException e) {
				e.printStackTrace(System.out);
			}
		}
	}
}
