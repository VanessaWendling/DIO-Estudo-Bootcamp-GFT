package com.dio.loops;

import java.util.Scanner;

/*
 * Fa�a um programa que leia 5 n�meros e informe o maior n�mero e a m�dia
 */

public class Ex3_MaiorEMedia {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero, maiorNumero = 0, soma = 0;

		for (int i = 0; i < 5; i++) {
			System.out.println("Digite o " + (i + 1) + "� n�mero: ");
			numero = sc.nextInt();
			soma += numero;
			if (numero > maiorNumero)
				maiorNumero = numero;
		}
		System.out.println("Maior n�mero: " + maiorNumero);
		System.out.println("M�dia dos n�meros: " + soma / 5);
	}
}
