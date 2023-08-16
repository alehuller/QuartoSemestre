package Classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cliente {

    private List<Funcionario> listaFunc = new ArrayList<>();

    public Cliente() {

    }

    public List<Funcionario> gerarFuncionarios() {
        listaFunc.add(new Funcionario("João", "Gerente", 5500));
        listaFunc.add(new Funcionario("Maria", "Vendedora", 4200));
        listaFunc.add(new Funcionario("José", "Coordenador", 4000));
        listaFunc.add(new Funcionario("Victor", "Desenvolvedor Senior", 6000));
        listaFunc.add(new Funcionario("Pedro", "Gerente", 5500));
        listaFunc.add(new Funcionario("Joana", "Analista Pleno", 4500));

        return listaFunc;

    }

    public void ordenarListaSalario() {
        Collections.sort(listaFunc, (funcionario1, funcionario2) -> funcionario1.compareTo(funcionario2));
    }

    public void imprimirFuncionarios() {
        for (Funcionario funcionario : listaFunc) {
            System.out.println(funcionario);
        }
    }

    public void buscaBinaria() {

        double objetivo = 4500;

        int indice = Collections.binarySearch(listaFunc, new Funcionario("", "", objetivo));

        if (indice >= 0) {
            System.out.println("O funcionário com o salário: " + objetivo + " está no índice " + indice);
        } else {
            System.out.println("Não há funcionários na lista com o salário indicado.");
        }

    }

}
