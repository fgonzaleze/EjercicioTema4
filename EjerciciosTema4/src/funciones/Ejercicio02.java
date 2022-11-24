package funciones;

import java.util.Scanner;

public class Ejercicio02 {
	static void numComprendidos(int x, int y) {
	
		for (int i = x + 1; i < y; i++) {
			System.out.print(" " + i + " ");
		}		
	}

	public static void main(String[] args) {
		int num1;
		int num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el primer número: ");					//Imprimimos para poder obtener el primer número deseado
		num1 = sc.nextInt();	
		System.out.println("Introduce el segundo número: ");				//Imprimimos para poder obtener el segudo número deseado
		num2 = sc.nextInt();
		if (num1<num2) {
			numComprendidos(num1, num2);
		} else {
			numComprendidos(num2, num1);
		}
		sc.close();
		}
		

	

}
