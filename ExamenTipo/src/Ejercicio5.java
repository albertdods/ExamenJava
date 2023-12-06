import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Operacion a realizar suma(+) multiplicacion(x)?");
		char operacion = in.nextLine().charAt(0);
		if (operacion=='+') {
			System.out.println("Numero para la tabla de sumar");
			int numero = in.nextInt(); 
			imprimirTabla(operacion, numero);
		}else if(operacion=='x') {
			System.out.println("Numero para la tabla de multiplicar");
			int numero = in.nextInt(); 
			imprimirTabla(operacion, numero);
		}else {
			System.out.println("Operación no deseada");
		}
	
	}

	public static void imprimirTabla(char operacion, int numero) {
		if (operacion=='+') {
			for (int i=1;i<=10;i++) {
				System.out.println("-> "+ i+" + "+numero+" = "+(i+numero));
			}
		}else if (operacion=='x') {
			for (int i=1;i<=10;i++) {
				System.out.println("-> "+ i+" + "+numero+" = "+(i*numero));
			}
		}
	}
	
}
