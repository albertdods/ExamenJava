public class Rombos {

	public static void main(String[] args) {
		int l=5;
		//imprimir mitad superior izquierda
		for (int i=0;i<=l;i++) {
			espacios(i, l);
			cadenaIzquierda(i);
			cadenaDerecha(i+1);
			System.out.println();
		}
		
		//imprimir mitad inferior izquierda
		for (int i=l-1;i>=0;i--) {
			espacios(i, l);
			cadenaIzquierda(i);
			cadenaDerecha(i+1);
			System.out.println();
		}
		
		

	}
	
	//dibujar espacios superiores
	public static void espacios(int indice,int l) {
		int fin = l-indice;
		for (int j=1;j<=fin;j++) {
			System.out.print(" ");
		}
	}
	
	//dibujar caracteres izquierda
	public static void cadenaIzquierda(int indice) {
		String [] caracteres= {"@",".","o","."};
		for (int j=0;j<=indice;j++) {
			int resto = j%4;
			System.out.print(caracteres[resto]);
		}
		
	}
	
	//dibujar caracteres derecha
		public static void cadenaDerecha(int indice) {
			String [] caracteres= {"@",".","o","."};
			for (int j=indice-2;j>=0;j--) {
				int resto = j%4;
				System.out.print(caracteres[resto]);
			}
			
		}
	

}
