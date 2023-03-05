/*strategy eh usado para um metodo que eh parecido, so q usado de maneira diferente para cada situacao*/
package strategy;

import cliente.Distancia;

public interface Frete {
	public double calcFrete(Distancia distancia);
}
