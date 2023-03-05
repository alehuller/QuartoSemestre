package cliente;

import strategy.*;

public class UsaStrategy {
	public static void main(String[] args) {
		Distancia distancia = new Distancia(100);
		System.out.print(calculoFrete(distancia, "XPTO"));
	}
	
	public static double calculoFrete(Distancia distancia, String empresa) {
		double valor = -1;
		Frete frete;
		if(empresa.equals("ABC")) {
			frete = new Abc();
			valor = frete.calcFrete(distancia);
		}
		else if (empresa.equals("CBA")){
			frete = new Cba();
			valor = frete.calcFrete(distancia);
		}
		else if (empresa.equals("XPTO")){
			frete = new Xpto();
			valor = frete.calcFrete(distancia);
		}
		return valor;
	}
}
