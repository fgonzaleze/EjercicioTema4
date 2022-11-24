package funciones;

import java.util.Scanner;

public class Ejercicio01 {
	
	static void eco(int n) {
		for (int i = 1; i <= n; i++)
			System.out.println("Eco");
	}

	public static void main(String[] args) {
		// Diseña la función eco() a la que se le pasa como parámetro de entrada un número n, 
		// y muestra por pantalla n veces el mensaje “Eco…”. Desde el método main() lee un número
		// introducido por el usuario por teclado y pasa este número como parámetro en la llamada a la función.

		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el número de veces para hacer eco: ");				//Imprimimos para poder obtener el número deseado
		num = sc.nextInt();	
		eco(num);
		sc.close();
	}

}
