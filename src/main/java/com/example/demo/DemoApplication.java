package com.example.demo;

import java.util.List;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.thread.PessoaProgram;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SuppressWarnings("unused")
@SpringBootApplication
public class DemoApplication {
	
	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		SpringApplication.run(DemoApplication.class, args);
		
		long t0 = System.currentTimeMillis();
		PessoaProgram.start();
		long t1 = System.currentTimeMillis();
		
		System.out.println("Tempo decorrido: " + (t1 - t0)/1000 + "s");
		
//		String jsonAnimalArray = "{\n"
//				+ "    \"animal\" : [ {\n"
//				+ "        \"sigla\" : \"a\",\n"
//				+ "        \"nome\" : \"abelha\",\n"
//				+ "	  	\"link\" : [{\n"
//				+ "			\"href\" : \"http://abelha\"\n"
//				+ "		  }]\n"
//				+ "    },\n"
//				+ "    {\n"
//				+ "        \"sigla\" : \"b\",\n"
//				+ "        \"nome\" : \"babuino\",\n"
//				+ "	  	\"link\" : [{\n"
//				+ "			\"href\" : \"http://babuino\"\n"
//				+ "		  }]\n"
//				+ "    }]\n"
//				+ "}";
//		
//		ObjectMapper om = new ObjectMapper();
//		Root root = om.readValue(jsonAnimalArray, Root.class);
//		List<Animal> animals = root.getAnimal();
//		animals.forEach(i -> System.out.println(i.toString()));		
//		Animal animal = animals.get(animals.size()-1);
//		
//		Map<String, String> mapFromFile = Migracao.HashMapFromTextFile();
//		
//		for (Map.Entry<String, String> entry :
//	        mapFromFile.entrySet()) {
//	       System.out.println(entry.getKey() + " : "
//	                          + entry.getValue());
//	    };
//	    
//	    System.out.println("Iguais: " + Migracao.estruturasOrganizacionaisParaMigrar.equals(mapFromFile));
//	    
//	    System.out.println("A \nB \nC");
	}

}

//{
//    "animal" : [ {
//        "sigla" : "a",
//        "nome" : "abelha",
//	  	"link" : [{
//			"href" : "http://abelha"
//		  }]
//    },
//    {
//        "sigla" : "b",
//        "nome" : "babuino",
//	  	"link" : [{
//			"href" : "http://babuino"
//		  }]
//    }]
//}

