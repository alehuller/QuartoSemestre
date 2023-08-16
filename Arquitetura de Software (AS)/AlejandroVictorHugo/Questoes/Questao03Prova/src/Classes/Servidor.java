package Classes;

import java.util.ArrayList;
import java.util.List;

public class Servidor implements Observavel {

    private List<Observador> listaPessoas = new ArrayList<>();

    @Override
    public void notificar(String mensagem, Observador usuario) {

        remover(usuario);

        for (Observador observador : listaPessoas) {
            observador.atualizar(observador, mensagem);

        }
    }

    @Override
    public void adicionar(Observador observer) {
        listaPessoas.add(observer);
    }

    @Override
    public void remover(Observador observer) {
        listaPessoas.remove(observer);
    }

}
