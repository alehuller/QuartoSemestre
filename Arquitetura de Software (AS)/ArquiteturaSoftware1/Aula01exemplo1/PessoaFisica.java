package Aula01exemplo1;

public class PessoaFisica extends Pessoa{
	public long cpf;

	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, long cpf) {
		super(nome);
		this.cpf = cpf;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "PessoaFisica [Nome= " + this.getNome() + "cpf=" + cpf + "]";
	}
}
