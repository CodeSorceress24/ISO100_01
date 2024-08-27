package controle;

public class Controle {

    public int contarPartes(String texto) {
        String[] partes = texto.split(";");
        return partes.length;
    }
}