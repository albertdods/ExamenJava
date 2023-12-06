import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String hora ="";
		do {
			System.out.println("Hora entre 0 y 23");
			int h= in.nextInt();
			System.out.println("Minutos entre 0 y 59");
			int m= in.nextInt();
			System.out.println("Segundos entre 0 y 59");
			int s = in.nextInt();
			hora = horaCorrecta(h, m, s);
			System.out.println(hora);
			
		}while(hora.equals("error"));
		

	}
	public static String horaCorrecta(int h, int m, int s) {
		if (h<0 || h>23 || m<0 || m>59 || s<0 || s>59) {
			return "error";
		}else {
			return String.valueOf(h)+":"+String.valueOf(m)+":"+String.valueOf(s);
		}

	}

}
