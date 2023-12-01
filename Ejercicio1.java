package u3ent;

import java.util.Scanner;

public class Ejercicio1 {
	public static int[] creaBomboNumeros(int numBolas) {
		int[] bomboGeneral = new int[numBolas];
		boolean repetido;
		for (int i=0; i<bomboGeneral.length; i++) {
			bomboGeneral[i] = (int) Math.round(Math.random()*numBolas);
			/*do {
				repetido = false;
				for (int k=0; k<bomboGeneral.length; k++) {
					if (bomboGeneral[i]==bomboGeneral[k]) repetido=true;
				}
				if (repetido) {
					bomboGeneral[i] = (int) Math.round(Math.random()*numBolas);
				}
			} while(repetido);*/
		}
		return bomboGeneral;
	}
	public static String[] creaBomboPremios(int numPremios) {
		String[] numPremiados = new String[numPremios];
		for (int i=0; i<numPremiados.length; i++) {
			if (i==0) numPremiados[i] = "gordo de navidad";
			else if(i==1) numPremiados[i] = "segundo";
			else if(i==2) numPremiados[i] = "tercero";
			else if(i>2 && i<5) numPremiados[i] = "cuarto";
			else if(i>=5 && i<=12) numPremiados[i] = "quinto";
			else numPremiados[i] = "pedrea";
		}
		return numPremiados;
	}
	public static int dameNumero(int[] bombo) {
		int num = bombo[(int) Math.round(Math.random()*bombo.length)];
		return num;
	}
	public static String damePremio(String[] bombo) {
		String premio = bombo[(int) Math.round(Math.random()*bombo.length)];
		return premio;
	}
	public static String decimoAgraciado(int decimo, String[][] lista) {
		String decimoString = String.valueOf(decimo);
		String premio = "Ningún premio";
		for (int i=0; i<lista.length; i++) {
			if (decimoString.equals(lista[i][0])) premio=lista[i][1];
		}
		return premio;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int numBolas = 99999;
		final int numPremios = 1807;
		int decimo;
		
		int[] bomboGeneral=creaBomboNumeros(numBolas);
		String[] bomboPremios=creaBomboPremios(numPremios);
		String[][] listaPremios = new String[bomboPremios.length][2];
		
		for (int i=0; i<bomboPremios.length; i++) {
			listaPremios[i][0] = String.format("%05d", dameNumero(bomboGeneral));
			listaPremios[i][1] = damePremio(bomboPremios);
		}
		
		try {
			System.out.println("Listado oficial de premios:");
			for (int i=0; i<listaPremios.length; i++) {
				System.out.println("Numero: "+listaPremios[i][0]+" agraciado con: "+listaPremios[i][1]);
			}
			System.out.println("Introduzca su décimo con todas las cifras (no se aceptan letras):");
			System.out.println(dameNumero(bomboGeneral));
			decimo=sc.nextInt();
			System.out.println(decimoAgraciado(decimo,listaPremios));
			System.out.println("Sorteo finalizado");
		} catch (Exception e) {
			System.out.println("ERROR: Excepción encontrada.");
		}
	}
}
