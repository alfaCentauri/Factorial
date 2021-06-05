package main;

public class Factorial {

	public static void main(String[] args) {
		int i, numero = 3, resultado = 1;
		System.out.println("Factorial de un número.");
		System.out.printf("El número entero: %d.\n", numero);
		for(i = numero; i >= 1; i--) {
			resultado *= i;
		}
		System.out.printf("El resultado es: %d.\n", resultado);
	}

}
