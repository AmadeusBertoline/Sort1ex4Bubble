package bubble.fatec.berto;

import java.util.Arrays;

public class BubbleSort {

	public int[] Bubble(int[] vetor, int rodadas, int n) {
		if (n == 1) {
			return vetor; //
		}

		if (rodadas < n - 1) {
			// Se precisar trocar, faça a troca
			if (vetor[rodadas] > vetor[rodadas + 1]) {
				int aux = vetor[rodadas];
				vetor[rodadas] = vetor[rodadas + 1];
				vetor[rodadas + 1] = aux;
			}
			return Bubble(vetor, rodadas + 1, n);
		} else {
			return Bubble(vetor, 0, n - 1);
		}
	}

	public static void main(String[] args) {
		BubbleSort sorter = new BubbleSort();
		int[] vetor = { 5, 2, 9, 1, 5, 6 };

		vetor = sorter.Bubble(vetor, 0, vetor.length);

		System.out.println(Arrays.toString(vetor));
	}
}
