package vetor;

public class SomaVetor {

	public static void main(String[] args) {
		int[] numeros = {1,2,3,4,5}; 
		int soma = somarVetorRecursivamente(numeros, 0);
		System.out.println("A soma dos elementos do vetor e: " + soma);

	}

	public static int somarVetorRecursivamente(int[] vetor, int index) {
		
		if (index >= vetor.length) {
		return 0;
	}
		return vetor[index] + somarVetorRecursivamente(vetor, index + 1);
	}
}
