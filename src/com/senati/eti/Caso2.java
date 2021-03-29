package com.senati.eti;

import java.util.Scanner;

public class Caso2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		///Declarar el arreglo
		int[] numero = new int[5];
		
		System.out.println("INGRESO DE NÚMEROS");
		System.out.println("-----------------" );
		
		int num_mayor = 0, num_menor = 0, sumatoria =  0;
		
		//leer los datos parte el arreglo
		for (int x = 0; x < numero.length; x++) {
			System.out.print("Numero " + (x + 1) + ": ");
			numero[x] = sc.nextInt();
			
			if (x ==0) {
				num_mayor = numero[0];
				num_menor = numero[0];
			}
			
			if (numero[x] > num_mayor) num_mayor = numero [x];
			
			if (numero[x] < num_menor) num_menor = numero [x];
			
			sumatoria += numero[x];
		}
		
		System.out.println("---RESULTADOS---");
		System.out.println("Número mayor: " + num_mayor);
		System.out.println("Número menor: " + num_menor);
		System.out.println("Sumatoria...: " + sumatoria);
	}

}