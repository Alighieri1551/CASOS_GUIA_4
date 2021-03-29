package com.senati.eti;

public class Caso1 {

	public static void main(String[] args) {
		String[] nombre = new String[4];
		
		nombre[0] = "Joe Castillo";
		nombre[1] = "Rosa Flores";
		nombre[2] = "Ricardo Montas";
		nombre[3] = "Viviana Figueroa";
		
		for (int i = 0; i < nombre.length; i++)
			System.out.println("Nombre: " + (i + 1) + ": " + nombre[i]);
			
	}

}