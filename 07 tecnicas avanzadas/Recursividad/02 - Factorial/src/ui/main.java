package ui;

import java.util.Scanner;

public class main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		print("Digite un numero entero positivo");
        int number = scanner.nextInt();
        print("El factorial de " + number + " es: " + calculateFactorial(number));
    }

    private static int calculateFactorial(int n) {
            return (n == 0 || n == 1) ? 1 : n * calculateFactorial(n - 1);
    }
    
    private static void print(String mes) {
    	System.out.println(mes);
    }
}
