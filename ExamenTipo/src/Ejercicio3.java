import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numero;
		int totalNumeros=0;
		do {
			System.out.println("Introducir numero");
			numero = in.nextInt();
			if (numero <0) {
				System.out.println("Numero negativo no válido");
			}else if (esMultiploTres(numero) && numero !=0) {
				totalNumeros++;
				System.out.printf("El numero %d es multiplo de 3",numero);
				System.out.println();
			}
		}while (numero != 0);
		System.out.printf("Has introducido %d numero multiplos de 3", totalNumeros);
	}

	//funcion para indicar si un numero es multiplo de 3
	public static boolean esMultiploTres(int n) {
		return n%3==0;
	}
}
