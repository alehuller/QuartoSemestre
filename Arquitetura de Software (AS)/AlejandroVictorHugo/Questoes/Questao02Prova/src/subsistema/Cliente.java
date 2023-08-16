package subsistema;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private static int cont;
	private int id;
	private String nome;
	private Endereco endereco;
	private List<Produto> lista;
	
	
	public Cliente(String nome, String rua, int numero) {
		this.id = cont++;
		this.nome = nome;
		Endereco endereco = new Endereco(rua, numero);
		this.endereco = endereco;
	}

	/*public Cliente(String nome, Endereco endereco, List<Produto> lista) {
		cont = cont + 1;
		this.id = cont;
		this.nome = nome;
		this.endereco = endereco;
		this.lista = lista;
	}*/

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Produto> getLista() {
		return lista;
	}

	public void setLista(List<Produto> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", endereco=" + endereco + ", lista=" + lista + "]";
	}

	
}