package Classes;

public class Funcionario implements Comparable<Funcionario> {

    private String nome;
    private String cargo;
    private double salario;

    public Funcionario() {

    }

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public int compareTo(Funcionario segundoFunc) {
        return Double.compare(this.salario, segundoFunc.salario);
    }

    @Override
    public String toString() {
        return "Funcionario [nome= " + nome + ", cargo= " + cargo + ", salario= " + salario + "]";
    }

}
