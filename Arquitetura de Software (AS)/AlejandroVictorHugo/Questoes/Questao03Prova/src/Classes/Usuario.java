package Classes;

public class Usuario implements Observador {

    private String nome;
    private int id;

    public Usuario() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario(String nome, int id, Observavel servidor) {
        this.nome = nome;
        this.id = id;
        servidor.adicionar(this);

    }

    @Override
    public void atualizar(Observador observer, String mensagem) {
        System.out.println(observer + " " + mensagem);
    }

    @Override
    public void escrever(String mensagem, Observavel servidor) {
        System.out.println(nome + " disse: " + mensagem);
        servidor.notificar(mensagem, this);
    }

    @Override
    public String toString() {
        return nome + " vê:";
    }

    

}
