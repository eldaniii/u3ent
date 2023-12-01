package u3ent;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean esPalindromo = true;
		int k = 0;
		int j = 0;
		
		System.out.println("Introduzca la cadena para comprobar si es un palindromo (no podrá contener tildes):");
		String cadena=sc.nextLine().toLowerCase();
		
		char[] a = new char[cadena.length()];
		char[] b = new char[cadena.length()];
		
		
		for (int i=0; i<cadena.length(); i++) {
			if (!(cadena.charAt(i)==' ')) {
				a[j] = cadena.charAt(i);
				j++;
			}
		}
		
		for (int i=cadena.length()-1; i>=0; i--) {
			if (!(cadena.charAt(i)==' ')) {
				b[k] = cadena.charAt(i);
				k++;
			}	
		}
		
		for (int i=0; i<cadena.length(); i++) {
			if (!(a[i]==b[i])) esPalindromo=false;
		}
		
		//Dabale arroz a la zorra el abad
		
		if (esPalindromo) System.out.println("La cadena introducida es un palindromo.");
		else System.out.println("La cadena introducida no es un palindromo");
	}
}
