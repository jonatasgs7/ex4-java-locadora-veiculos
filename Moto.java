package LocadoraVeiculos;

public class Moto {
	public String marca;
	public String modelo;
	public String cilindradas;
	
	public void atribuirValores(String motoMarca, String motoModelo, String motoCilindradas) {
		marca = motoMarca;
		modelo = motoModelo;
		cilindradas = motoCilindradas;
	}
	
	public void retornarValores() {
		System.out.println("Moto: "+marca+" "+modelo+" "+cilindradas+"cc");
	}
	
}
