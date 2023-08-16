package Facade;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import subsistema.Cliente;
import subsistema.Endereco;
import subsistema.Produto;

public class Facade {
	private List<Cliente> listaClientes = new ArrayList();
	private List<Produto> listaProdutos = new ArrayList();	
	
	public void cadastrar(String nome, String rua, int numero) {
		listaClientes.add(new Cliente(nome, rua, numero));
	}
	
	public boolean realizarPedido(int id) {
		
		for(int i = 0; i < listaClientes.size(); i++) {
			if (listaClientes.get(id) == listaClientes.get(i)) {
				listaClientes.get(id).setLista(listaProdutos);
			}
		}
		
		if(listaProdutos.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//gerarCupomFiscal tambem realiza o pedido do cliente com o id passado, por isso so o gerarCupomFiscal esta sendo usado na main
	public void gerarCupomFiscal(int id) {
		if(realizarPedido(id) == false) {
			System.out.println(listaClientes.get(id));
		}
		else {
			System.out.print("Pedido não realizado");
		}
	}
	
	public void adicionarProdutos(String nome, String categoria, double preco) {
		listaProdutos.add(new Produto(nome, categoria, preco));
	}
}