package com.example.demo.thread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PessoaProgram {

	public static void start() {
		Pessoa refino = new Pessoa("REFINO"); // Topo
			Pessoa recap = new Pessoa("RECAP");
				Pessoa recapOt = new Pessoa("RECAP/OT");
					Pessoa recapOtPp = new Pessoa("RECAP/OT/PP");
					Pessoa recapOtEp = new Pessoa("RECAP/OT/EP");
				Pessoa recapIe = new Pessoa("RECAP/IE");
			Pessoa reman = new Pessoa("REMAN");
				Pessoa remanMa = new Pessoa("REMAN/MA");
					Pessoa remanMaEed = new Pessoa("REMAN/MA/EED");
				Pessoa remanOp = new Pessoa("REMAN/OP");
		
		refino.setFilhos(Arrays.asList(recap, reman));
		recap.setFilhos(Arrays.asList(recapOt, recapIe));
		recapOt.setFilhos(Arrays.asList(recapOtPp, recapOtEp));
		reman.setFilhos(Arrays.asList(remanMa, remanOp));
		remanMa.addFilho(remanMaEed);
		
		
		refino.getFilhos().forEach(filho -> {
			filho.start();
		});
		
		refino.getFilhos().forEach(filho -> {
			try {
				filho.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		
		refino.getFilhos().forEach(filho -> {
			refino.getTodos().addAll(filho.getTodos());
		});
		
		refino.getTodos().forEach(d -> System.out.println(d.getNome()));
		
//		refino.setTodos(refino.getDescendentes(refino));
//		refino.getTodos().forEach(d -> System.out.println(d.getNome()));
		

	}

}