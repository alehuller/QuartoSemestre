import java.util.ArrayList;

@FunctionalInterface
public interface InterfaceFuncional {
	public void ordenar(ArrayList<Integer> v);
	
	default void exibir(ArrayList<Integer> v) {
		v.sort((x, y) -> x.compareTo(y));
		for(Integer numero : v) {
			System.out.print(numero + " ");
		}
	}
}
