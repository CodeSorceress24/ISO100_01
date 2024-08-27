package visao;

import controle.Controle;
import javax.swing.JOptionPane;

public class Visao {

    public static void main(String[] args) {
        Controle controle = new Controle();
        
        String texto = JOptionPane.showInputDialog("Digite o texto a ser dividido (use ';' como delimitador):");
        
        if (texto != null && !texto.isEmpty()) {
            int quantidade = controle.contarPartes(texto);
            
            JOptionPane.showMessageDialog(null, "O texto possui " + quantidade + " partes.");
        } else {
            JOptionPane.showMessageDialog(null, "Texto inválido. Por favor, insira um texto válido.");
        }
    }
}