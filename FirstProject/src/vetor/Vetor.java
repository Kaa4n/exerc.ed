package vetor;

public class Vetor {

	public static void main(String[] args) {
		int[] numeros = {1,2,3,4,5};
		imprimirVetorRecursivamente(numeros, 0);

	}

	public static void imprimirVetorRecursivamente(int[] vetor, int index) {
		
		if (index >= vetor.length) {
			return;
		}
		
		System.out.println(vetor[index]);
		
		imprimirVetorRecursivamente(vetor, index + 1);
	}

}
