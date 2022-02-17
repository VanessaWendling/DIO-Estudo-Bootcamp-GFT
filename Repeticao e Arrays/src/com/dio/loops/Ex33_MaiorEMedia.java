package com.dio.loops;

import java.util.Scanner;

/*
 * Fa�a um programa que leia 5 n�meros e informe o maior n�mero e a m�dia
 */

public class Ex33_MaiorEMedia {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero, maiorNumero = 0, soma = 0, count = 0;
		do {
			System.out.println("N�mero: ");
			numero = sc.nextInt();
			soma += numero;

			if (numero > maiorNumero)
				maiorNumero = numero;
			count++;
		} while (count < 5);
		System.out.println("Maior n�mero: " + maiorNumero);
		System.out.println("M�dia dos n�meros: " + soma / 5);
	}
}
