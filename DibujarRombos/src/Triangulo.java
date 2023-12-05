import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Altura del triángulo");
		int altura = in.nextInt();
		System.out.println("Triangulo de altura "+altura);
		for (int i=1;i<=altura;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
