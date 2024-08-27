package controle;

public class Controle {

    public long medirTempoPercorrerVetor(int tamanho) {
        int[] vetor = new int[tamanho];
        
        long tempoInicio = System.nanoTime();
        
        for (int i = 0; i < vetor.length; i++) {
        }
        
        long tempoFim = System.nanoTime();
        
        return (tempoFim - tempoInicio) / 1_000_000_000L;
    }
}