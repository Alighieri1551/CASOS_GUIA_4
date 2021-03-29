package com.senati.eti;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Caso3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		///declarar el arreglo
		Integer[] numero = new Integer[5];
				
		System.out.println("INGRESO DE NÚMEROS");
		System.out.println("-----------------" );
				
		//leer los datos parte el arreglo
		for (int x = 0; x < numero.length; x++) {
		System.out.print("Numero " + (x + 1) + ": ");
		numero[x] = sc.nextInt();
		}

		//ordenar de forma ascendente
		Arrays.sort(numero);
	
		System.out.println("Números ordenados ascendentemente");
		System.out.println("---------------------------------" );
		for (int x = 0; x < numero.length; x++) 
			System.out.println("Numero " + (x + 1) + ": " + numero[x]);
		
		Arrays.sort(numero, Collections.reverseOrder());
		
		System.out.println("Numeros ordenados descendentemente");
		System.out.println("---------------------------------" );
		for (int x = 0; x < numero.length; x++) 
			System.out.println("Numero " + (x + 1) + ": " + numero[x]);
			
	}

}