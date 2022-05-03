package LocadoraVeiculos;

import java.time.Year;

public class Carro {
	
	public String fabricante;
	public String modelo;
	public int ano;
	
	public void configuraDados(String carroFabricante, String carroModelo, int carroAno) {
		fabricante = carroFabricante;
		modelo = carroModelo;
		ano = carroAno;
	}
	
	public void exibirDados() {
		
		String comment = "";
		int currentYear = Year.now().getValue();
		
		// Display a funny comment depending on the year entered 
		if (ano < 1900) {
			comment = " Obs: Certeza que isso é um carro? Veio de um passado distante...";
		} else if (ano > currentYear) {
			comment = "Obs: O carro inserido veio do futuro! É um DeLorean?";
		}
		
		// Show data
		System.out.println("Carro: "+ fabricante +" "+ modelo +" "+ ano);
		if(!comment.isEmpty()) {
			System.out.println(comment);
		}
	}
	
}
