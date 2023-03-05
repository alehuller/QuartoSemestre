package strategy;

import cliente.Distancia;

public class Abc implements Frete{
	
	@Override
	public double calcFrete(Distancia distancia) {
		return distancia.getPercurso() * 0.1;
	}
}