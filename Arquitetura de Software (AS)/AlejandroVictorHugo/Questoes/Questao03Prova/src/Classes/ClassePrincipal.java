package Classes;
public class ClassePrincipal {

    public static void main(String[] args) {
        Observavel servidor = new Servidor();
        Observador usuario1 = new Usuario("Gerson", 12, servidor);

        Observador usuario3 = new Usuario("Anna", 142, servidor);
        usuario3.escrever("Bom dia!", servidor);

        Observador usuario2 = new Usuario("Sandra", 2, servidor);
        usuario3.escrever("Olá!", servidor);
    }
}
