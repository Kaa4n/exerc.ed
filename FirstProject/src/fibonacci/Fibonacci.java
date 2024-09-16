package fibonacci;


public class Fibonacci {

    public static void main(String[] args) {
    	System.out.print("Sequência de Fibonacci de 1 a 10: ");
        
        int i = 0;
        int fibonacciNum;
        while (true) {
            fibonacciNum = fibonacci(i);
            if (fibonacciNum > 210) break;
            if (fibonacciNum >= 1) System.out.print(fibonacciNum + " ");
            i++;
        }
    }

    	public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    	
    	}
    }


