import java.util.ArrayList;

public class Principal {
	public static void main(String[] args) {
		ArrayList<Integer> listaNumeros = new ArrayList<>();
		listaNumeros.add(50);
		listaNumeros.add(15);
		listaNumeros.add(5);
		listaNumeros.add(0);
		listaNumeros.add(47);
		listaNumeros.add(33);
		listaNumeros.add(26);
		listaNumeros.add(8);
		listaNumeros.add(11);
		listaNumeros.add(5);
		
		InterfaceFuncional funcional = (v) -> {
			v.sort((x, y) -> x.compareTo(y));
		};
	
		funcional.exibir(listaNumeros);
	}
}
