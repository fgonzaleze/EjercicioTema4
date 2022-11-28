package funciones;

public class Ejercicio07 {
	public static int numDivisoresPrimos (int num) {
		int contador = 0;
		for (int i=2; i <= num; i++) {
			if (num%i == 0 && esPrimo (i)) {
				contador++;
			}
		}
		return contador;
	}

	public static void main(String[] args) {
		/*
		 * Escribe una función a la que se le pase como parámetro un número entero y 
		 * devuelva el número de divisores primos que tiene. Utiliza para ello la función que 
		 * definiste en el ejercicio anterior, esPrimo(). Diseña un método main() que pruebe 
		 * el funcionamiento de dicha función.
		 */

	}

}
