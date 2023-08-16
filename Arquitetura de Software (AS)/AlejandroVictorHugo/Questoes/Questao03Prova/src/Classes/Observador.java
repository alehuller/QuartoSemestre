package Classes;

public interface Observador {

    public void atualizar(Observador observer, String mensagem);

    public void escrever(String mensagem, Observavel servidor);


}
