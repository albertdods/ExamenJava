import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		int numeroMayorCien=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Numero ");
		int numero = in.nextInt();
		int numeroMenor = numero;
		int vecesRepite = 1;
		double suma=numero;
		int contador=1;
		do {
			System.out.println("Numero ");
			numero = in.nextInt();
			if (numero !=0) {
				suma += numero;
				contador ++;
				if (numero<numeroMenor) {
					numeroMenor = numero;
					vecesRepite=1;
				}else if (numero==numeroMenor) {
					vecesRepite++;
				}
				if (numero>=100) {
					numeroMayorCien++;
				}
			}
			
			
		}while (numero!=0);
		double media = suma/contador; 
		System.out.println("El numero menor de la serie es "+numeroMenor);
		System.out.println("Se repite "+vecesRepite+" veces");
		System.out.printf("La media de los numeros es %.4f",media);
		if (numeroMayorCien>=1) {
			System.out.println("\nSi hubo, al menos un numero mayor que 100");
		}

	}

}
