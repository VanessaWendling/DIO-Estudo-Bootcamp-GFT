package com.dio.arrays;

import java.util.Iterator;
import java.util.Scanner;

/*
 * Faça um programa que leia um vetor de 6 caracteres, e diga
 * quantas consoantes foram lida. Imprima as consoantes.
 */

public class Ex2_Consoantes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] consoantes = new String[6];
		int numeroConsoantes = 0, cont = 0;

		do {
			System.out.println("Digite uma letra: ");
			String letra = sc.next();
			if (!(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i")
					|| letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u"))) {
				consoantes[numeroConsoantes] = letra;
				numeroConsoantes++;
			}
			cont++;
		} while (cont < consoantes.length);
		/*
		 * Primeiro jeito for(int i = 0; i < numeroConsoantes; i++) System.out.print(
		 * consoantes[i] + "\t");
		 */

		for (String consoante : consoantes) {
			if (consoante != null)
				System.out.print(consoante + "\t");
		}
	}
}
