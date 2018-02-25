package mediana;

import java.util.Arrays;
import java.util.Scanner;

public class mediana {

	
	public static void main(String[] args) {
		//Inicializacion
		Scanner in = new Scanner(System.in);
		int[] numeros;
		int tamaño;
		double resultado;
		System.out.println("Ingresa la cantidad de numeros: ");
		tamaño = in.nextInt();
		numeros = new int[tamaño];
		
		System.out.print("Ingresa los numeros: ");
		for (int posicion = 0; posicion < numeros.length; posicion++) {
			numeros[posicion] = in.nextInt();
			
		}
		Arrays.sort(numeros);
		if (numeros.length % 2 == 0) {
			resultado = numeros[((numeros.length) + 1) / 2] + numeros[(numeros.length - 1) / 2];// Par
		} else {
			resultado = numeros[(numeros.length) / 2] * 2;// Impar
		
		}
		System.out.println(tamaño);
		System.out.print("La mediana es " + resultado);

	}
}
