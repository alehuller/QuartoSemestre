package strategy;

import cliente.Distancia;

public class Xpto implements Frete{
	@Override
	public double calcFrete(Distancia distancia) {
		return distancia.getPercurso() * 0.3;
	}
}
