package bubble.fatec.berto;

public class BubbleSort {

    public int[] bubbleSort(int[] vetor, int n) {
        if (n == 1) return vetor;

        for (int i = 0; i < n - 1; i++) {
            if (vetor[i] > vetor[i + 1]) {
                int aux = vetor[i];
                vetor[i] = vetor[i + 1];
                vetor[i + 1] = aux;
            }
        }

        return bubbleSort(vetor, n - 1);
    }
}
