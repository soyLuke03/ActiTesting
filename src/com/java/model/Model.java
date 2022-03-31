package com.java.model;

public class Model {

	
	public static boolean capicua(int n1) {
		
		
		
		
		return false;
	}
	
	public static boolean capicua(double n1) {
		
		
		
		return false;
	}

	public static boolean capicua(String n1) {
	
		for (int i = 0;i<n1.length();i++) {
			
			
		}
		
		return false;
	}
	
	public static boolean anagrama(String cadena) {
		
		boolean esTrue = false;
		StringBuilder cadenaInv = new StringBuilder();
		
		for (int i = cadena.length()-1;i>=0;i--) {
			cadenaInv.append(cadena.charAt(i));
		}
		
		int contador = 0;
		int contadorInverso = cadena.length()-1;
		
		while (contador < cadena.length()) {
			if(cadena.indexOf(contador) == cadenaInv.toString().indexOf(contadorInverso)) {
				contador++;
				contadorInverso--;
				esTrue = true;
			}
			else {
				esTrue = false;
			}

		}
		
		return esTrue;
	}
	
}
