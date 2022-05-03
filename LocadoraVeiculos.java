package LocadoraVeiculos;

import java.util.Scanner;

public class LocadoraVeiculos {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Gostaria de inserir dados de Moto ou Carro? 'm' para Moto 'c' para Carro" );
		String tipo = leitura.nextLine();
		
		// 
		while (!tipo.equals("m") && !tipo.equals("c")) {
			
			System.out.println("Dados inv�lidos. Escreva 'm' para Moto 'c' para Carro");
			tipo = leitura.nextLine();
			
		}
		
		if (tipo.equals("m")) {
			
			Moto moto1 = new Moto();
			Moto moto2 = new Moto();

			System.out.println("Insira o fabricante do ve�culo 01");
			moto1.marca = leitura.nextLine();
			
			System.out.println("Insira o modelo do ve�culo 01");
			moto1.modelo = leitura.nextLine();
			
			System.out.println("Insira as cilindradas do ve�culo 01");
			moto1.cilindradas  = leitura.nextLine();
			
			System.out.println("Insira o fabricante do ve�culo 02");
			moto2.marca = leitura.nextLine();
			
			System.out.println("Insira o modelo do ve�culo 02");
			moto2.modelo = leitura.nextLine();
			
			System.out.println("Insira as cilindradas do ve�culo 02");
			moto2.cilindradas  = leitura.nextLine();
			
			moto1.atribuirValores(moto1.marca, moto1.modelo, moto1.cilindradas);
			moto2.atribuirValores(moto2.marca, moto2.modelo, moto2.cilindradas);
			
			moto1.retornarValores();
			moto2.retornarValores();
		
		} else {
		
			Carro carro1 = new Carro();
			
			System.out.println("Insira o fabricante do ve�culo");
			carro1.fabricante = leitura.nextLine();
			
			System.out.println("Insira o modelo do ve�culo");
			carro1.modelo = leitura.nextLine();
			
			System.out.println("Insira o ano do ve�culo - Ex.: 2022");
			carro1.ano = leitura.nextInt();
			
			// Validate Year 4 digits
			while(String.valueOf(carro1.ano).length() != 4) {
				System.out.println("Insira um ano v�lido de 4 d�gitos");
				carro1.ano = leitura.nextInt();
			}
			
			carro1.configuraDados(carro1.fabricante, carro1.modelo, carro1.ano);
			
			carro1.exibirDados();
			
		} 

	}

}
