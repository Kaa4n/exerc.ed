package fatorial;

public class Fatorial {

	    public static void main(String[] args) {
	    	
	        int numero = 5;
	        int resultado = fatorial(numero);
	        System.out.println("O fatorial de " + numero + " é " + resultado);
	    }

	    public static int fatorial(int n) {
	        if (n == 0 || n == 1) {
	            return 1;
	        } else {
	            return n * fatorial(n - 1);
	        }
	    		
	}

}
