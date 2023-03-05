package Aula01Exercicio1;

public class AeronaveDeAsasRotativas extends Aeronave{
	private boolean rotorDeCalda;

	public AeronaveDeAsasRotativas() {
	}

	public AeronaveDeAsasRotativas(int numeroOcupantes, float capacidadeCargo, boolean rotorDeCalda) {
		super(numeroOcupantes, capacidadeCargo);
		this.rotorDeCalda = rotorDeCalda;
	}
}
