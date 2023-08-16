package Classes;

public interface Observavel {

    public void notificar(String mensagem, Observador Usuario);
    public void adicionar(Observador observer);
    public void remover(Observador observer);
}