package strategy;

import cliente.Distancia;

public class Cba implements Frete{

	@Override
	public double calcFrete(Distancia distancia) {
		return distancia.getPercurso() * 0.2;
	}
}