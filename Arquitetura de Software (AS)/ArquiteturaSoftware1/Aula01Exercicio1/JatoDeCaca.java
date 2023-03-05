package Aula01Exercicio1;

public class JatoDeCaca extends Aeronave{
	private String armamento;

	public JatoDeCaca() {
	}

	public JatoDeCaca(int numeroOcupantes, float capacidadeCargo, String armamento) {
		super(numeroOcupantes, capacidadeCargo);
		this.armamento = armamento;
	}
}
