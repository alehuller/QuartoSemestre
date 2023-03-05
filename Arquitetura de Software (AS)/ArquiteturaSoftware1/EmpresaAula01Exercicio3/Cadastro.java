package EmpresaAula01Exercicio3;

import FuncionariosAula01Exercicio3.*;

public class Cadastro {
	public static void main(String[] args) {
		Funcionario f = new Funcionario();
		System.out.println(f.getSalario());
		Gerente g = new Gerente();
		g.setSalFuncionario(4000, f);
		System.out.println(f.getSalario());
	}
}
