
public class Rombo {
	//atributos
	private int lado;
	private char [] caracteres = new char[4];
	
	public Rombo(int lado) {
		this.lado=lado;
		this.caracteres[0]= '@';
		this.caracteres[1]= '.';
		this.caracteres[2]= 'o';
		this.caracteres[3]= '.';
	}
	//metodo dibujar rombo
	public void dibujarRombo() {
		//dibujar rombo superior
		for (int i=1;i<=lado;i++) {
			//dibujar espacios
			dibujarEspacios(i);
			//dibujar triangulo izquierda
			trianguloIzquierda(i);
			//dibujar triangulo derecha
			trianguloDerecha(i);
			
		}
		//dibujar rombo inferior
		for (int i=lado-1;i>0;i--) {
			//dibujar espacios
			dibujarEspacios(i);
			//dibujar triangulo izquierda
			trianguloIzquierda(i);
			//dibujar triangulo derecha
			trianguloDerecha(i);
			
		}
		
	}
	//dibujar espacios
	public void dibujarEspacios(int indice) {
		for (int j=0;j<lado-indice;j++) {
			System.out.print(" ");
		}
	}
	//dibujar triangulo izquierda
	public void trianguloIzquierda(int indice) {
		for (int j=0;j<indice;j++) {
			System.out.print(caracteres[j%4]);
		}
	}
	//dibujar triangulo derecha
	public void trianguloDerecha(int indice) {
		for (int j=indice-2;j>=0;j--) {
			System.out.print(caracteres[j%4]);
		}
		//salto de linea
		System.out.println();
	}
}
