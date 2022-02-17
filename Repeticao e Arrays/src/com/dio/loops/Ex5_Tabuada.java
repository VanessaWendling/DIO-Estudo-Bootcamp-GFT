package com.dio.loops;

import java.util.Scanner;

/*
 * Desenvolva um gerador de tabuada, capaz de gerar tabuadas de qualquer
 * número inteiro entre 1 a 10. O Usuário deve informar qual número ele 
 * deseja ver a tabuada.
 */

public class Ex5_Tabuada {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numero;
		do {
			System.out.println("Digite o número que você deseja gerar a tabuada: ");
			numero = sc.nextInt();
		} while (numero < 1 || numero > 10);

		for (int i = 1; i <= 10; i++)
			System.out.println(numero + " X " + i + " = " + (numero * i));
	}
}
