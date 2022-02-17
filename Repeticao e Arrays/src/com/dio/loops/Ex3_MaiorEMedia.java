package com.dio.loops;

import java.util.Scanner;

/*
 * Faça um programa que leia 5 números e informe o maior número e a média
 */

public class Ex3_MaiorEMedia {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero, maiorNumero = 0, soma = 0;

		for (int i = 0; i < 5; i++) {
			System.out.println("Digite o " + (i + 1) + "º número: ");
			numero = sc.nextInt();
			soma += numero;
			if (numero > maiorNumero)
				maiorNumero = numero;
		}
		System.out.println("Maior número: " + maiorNumero);
		System.out.println("Média dos números: " + soma / 5);
	}
}
