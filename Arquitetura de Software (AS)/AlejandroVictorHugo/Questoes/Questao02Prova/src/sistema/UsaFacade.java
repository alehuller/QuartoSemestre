package sistema;

import java.util.ArrayList;
import java.util.List;

import Facade.Facade;
import subsistema.Cliente;
import subsistema.Endereco;
import subsistema.Produto;

public class UsaFacade {
	public static void main(String[] args) {
		Endereco endereco = new Endereco("Rua Sócrates", 14);
		Facade facade = new Facade();
		facade.adicionarProdutos("Celular", "Eletronico", 1500.00);
		facade.adicionarProdutos("Ipad", "Eletronico", 1200.00);
		facade.adicionarProdutos("Teclado", "Periferico", 20.00);
		facade.cadastrar("Alejandro", endereco.getRua(), endereco.getNumero());
		facade.cadastrar("Victor", endereco.getRua(), endereco.getNumero());
		facade.cadastrar("Micha", endereco.getRua(), endereco.getNumero());
		facade.cadastrar("camilly", endereco.getRua(), endereco.getNumero());
		facade.gerarCupomFiscal(2); //gerarCupomFiscal tambem realiza o pedido do cliente com o id passado, por isso so o gerarCupomFiscal esta sendo usado na main
	}
}