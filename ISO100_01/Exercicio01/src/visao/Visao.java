package visao;

import controle.Controle;

public class Visao {

    public static void main(String[] args) {
        Controle controle = new Controle();
        
        int[] tamanhos = {1000, 10000, 100000};
        
        for (int tamanho : tamanhos) {
            long tempo = controle.medirTempoPercorrerVetor(tamanho);
            System.out.printf("Tempo para percorrer vetor de %d posições: %d segundos%n", tamanho, tempo);
        }
    }
}