import java.util.Scanner;

public class TestRombo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int lado;
		do {
			System.out.println("Lado rombo 0 para salir");
			lado = in.nextInt();
			Rombo r = new Rombo(lado);
			r.dibujarRombo();
		}while (lado >0);
		System.out.println("Fin del programa");
		in.close();
	}

}
