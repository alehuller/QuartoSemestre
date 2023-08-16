package Classes;

/**
 * 
 * 
 *   4 - Uma classe interna pode ter modificador private? Mostre um exemplo prático. 
 * 
 * Responda às questões referentes à classe anônima. 
 *   a)	O que é uma classe anônima? 
 *   b)	Escreva um exemplo prático.
 * 
 * 
 * 
 */


public class ClasseExterna {

    private String nome = "Victor Hugo Pereira de Sousa";
    private String cargo = "Técnico Eletrônica Residente I";
    private int idade = 25;
    private int rg = 322711485;
    private double salario = 2500.00;    

    private class ClasseInterna {

        public void exibirInformacoes() {
            System.out.println("----- Informações do Funcionário -----");
            System.out.println("Nome: " + nome);
            System.out.println("Cargo: " + cargo);
            System.out.println("Idade: " + idade);
            System.out.println("RG: " + rg);
            System.out.printf("Salário: %.2f", salario);
        }
    }

    public static void main(String[] args) {
        ClasseExterna externa = new ClasseExterna();
        ClasseInterna interna = externa.new ClasseInterna();
        interna.exibirInformacoes();
    }

}
