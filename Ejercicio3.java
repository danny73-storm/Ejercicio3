import java.util.*;

public class Ejercicio3{
	public static void main (String[] args){

		Scanner leer = new Scanner(System.in);

		//pedir el valor N 
		System.out.println("\nIngrese el numero que desea concer su factorial: ");
		int N = leer.nextInt();


		int factorial = 1;
		for (int i=1; i<= N ; i++) {
			factorial= factorial*i;
		}
		System.out.println("El factorial de "+N+" es: "+factorial);

	}
}	