import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Numero 1");
		int a = in.nextInt();
		System.out.println("Numero 2 > Numero 1");
		int b = in.nextInt();
		
		//intercambiar variables
		if (a>b) {
			int aux = a;
			a= b;
			b = aux;
		}
		int sumaPares=0, sumaImpares=0;
		for (int i=a;i<=b;i++) {
			if (i%2==0)
				sumaPares++;
			else
				sumaImpares++;
		}
		//imprimir
		System.out.printf("La suma de los numeros pares desde %d a %d es = %d",a,b,sumaPares);
		System.out.printf("\nLa suma de los numeros impares desde %d a %d es = %d",a,b,sumaImpares);
		in.close();

	}

}
