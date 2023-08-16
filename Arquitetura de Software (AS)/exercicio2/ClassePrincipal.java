import Classes.Cliente;

/**
 * 
 * Exercicio 2
 * - Elabore um projeto que contenha a classe Funcionario:
 * nome (String),
 * cargo (String),
 * salário (double).
 * 
 * Obs: Defina os recursos básicos para essa classe
 * 
 * Status: OK
 * 
 * Na classe cliente, faça uma lista de seis funcionários,
 * realize a pesquisa usando binarySearch() da classe Collections.
 * Status: OK
 * 
 * Você precisará de um Comparator, escreva-o através da expressão lambda.
 * Status: OK
 * 
 * 
 */

public class ClassePrincipal {

    public static void main(String[] args) {

        Cliente listaCliente = new Cliente();

        listaCliente.gerarFuncionarios();
        listaCliente.ordenarListaSalario();
        listaCliente.imprimirFuncionarios();
        listaCliente.buscaBinaria();

    }

}