package com.example.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class Migracao {
	
	final static String filePath = "/home/ciro/migracao.txt";
	
	public static final Map<String, String> estruturasOrganizacionaisParaMigrar;
	static
	 {
		estruturasOrganizacionaisParaMigrar = new HashMap<String, String>();
		estruturasOrganizacionaisParaMigrar.put("DRGN", "50001145");
		estruturasOrganizacionaisParaMigrar.put("INDUSTRIAL", "53315426"); // Só tem 1 industrial no dbftp e está obsoleto
		estruturasOrganizacionaisParaMigrar.put("REFINO", "53688152");
		estruturasOrganizacionaisParaMigrar.put("LUBNOR", "53150341");
		estruturasOrganizacionaisParaMigrar.put("RPBC", "50001618");
		estruturasOrganizacionaisParaMigrar.put("REGAP", "50001630");
		estruturasOrganizacionaisParaMigrar.put("REMAN", "53150004");
		// estruturasOrganizacionaisParaMigrar.put("FAFEN-BA", "");  Só tem inativo no bdftp?????
		estruturasOrganizacionaisParaMigrar.put("REDUC", "50001625");
		estruturasOrganizacionaisParaMigrar.put("REPAR", "50001648");
		estruturasOrganizacionaisParaMigrar.put("FAFEN-SE", "52921802");
		estruturasOrganizacionaisParaMigrar.put("RACAP", "53150356");
		estruturasOrganizacionaisParaMigrar.put("REPLAN", "50001639");
		estruturasOrganizacionaisParaMigrar.put("REVAP", "50001646");
		estruturasOrganizacionaisParaMigrar.put("SIX", "53151117");
		estruturasOrganizacionaisParaMigrar.put("RNEST", "53688234");
		estruturasOrganizacionaisParaMigrar.put("DDP", "50001110");
		estruturasOrganizacionaisParaMigrar.put("CENPES", "53335075");
		estruturasOrganizacionaisParaMigrar.put("CENPES/SMS", "53355796");
	};
	
	public static Map<String, String> HashMapFromTextFile() {

		Map<String, String> map = new HashMap<String, String>();
		BufferedReader br = null;

		try {
			File file = new File(filePath);

			br = new BufferedReader(new FileReader(file));

			String line = null;

			while ((line = br.readLine()) != null) {
				String[] partes = line.split(":");

				// primeira parte é o nome, segunda é o número sap
				String nome = partes[0].trim();
				String numeroSAP = partes[1].trim();

				if (!nome.equals("") && !numeroSAP.equals("")) {
					map.put(nome, numeroSAP);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (Exception e) {
				}
				;
			}
		}

		return map;
	}
	
}
