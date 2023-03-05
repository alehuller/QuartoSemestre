package FuncionariosAula01Exercicio3;

public class Gerente {
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSalFuncionario(double salario, Funcionario f) {
		f.salario = salario;
	}
	
	
}
