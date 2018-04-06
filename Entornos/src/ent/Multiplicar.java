
		package ent;

		import java.util.*;

		public class Multiplicar {
			
			private int num1, num2,resultado;
			Scanner teclado = new Scanner(System.in);
			
			public void numeros(){
				System.out.println("Introduce un número");
				num1 = teclado.nextInt();
				System.out.println("Introduce un número");
				num2 = teclado.nextInt();
			}

			public void sumar(){
				resultado = num1*num2;
				System.out.println("El resultado de multiplicar " + num1 + " con " +num2 + " es: " + resultado );
			}
			
			public static void main (String[] arg){
				System.out.println("Esto es una prueba");
				Multiplicar obj = new Multiplicar();
				
				obj.numeros();
				obj.sumar();
				
			}
		

	}


