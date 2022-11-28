package sobrecarga;

import java.util.Scanner;

public class Ejercicio01 {
	public static int suma(int a, int b) {
		return a+b;
	}
	public static double suma(double a, double b) {
		return a+b;
	}

	public static void main(String[] args) {
		/*
		 * Diseña dos funciones de nombre suma que hagan lo siguiente: La primera de las
		 * funciones recibirá dos argumentos de tipo entero y devolverá la suma de
		 * ambos. El valor a devolver también será entero. La segunda de las funciones
		 * recibirá dos argumentos de tipo double y devolverá la suma de ambos. El tipo
		 * a devolver debe ser también double.
		 * 
		 */
		int intnum1;
		int intnum2;
		double doublenum1;
		double doublenum2;
		int resultadoInt;
		double resultadoDouble;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el primer número entero: ");
		intnum1 = sc.nextInt();
		System.out.println("Introduce el segundo número entero: ");
		intnum2 = sc.nextInt();
		resultadoInt = suma(intnum1, intnum2);
		System.out.println("El resultado en enteros es: " + resultadoInt);
		System.out.println("Introduce el primer número con decimales: ");
		doublenum1 = sc.nextDouble();
		System.out.println("Introduce el segundo número con decimales: ");
		doublenum2 = sc.nextDouble();
		resultadoDouble = suma(doublenum1, doublenum2);
		System.out.println("El resultado con decimales es: " + resultadoDouble);
		sc.close();

	}

}
