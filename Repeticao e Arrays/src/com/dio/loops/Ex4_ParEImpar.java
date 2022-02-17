package com.dio.loops;

import java.util.Scanner;

/*
 * Faça um programa que peça N números inteiros, calcule e mostre a quantidade
 * de números pares e a quantidade de números impares
 */

public class Ex4_ParEImpar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int par = 0, impar = 0;
		int quantidadeNumeros = sc.nextInt();
		for (int i = 0; i < quantidadeNumeros; i++) {
			System.out.println("Digite um número: ");
			int numero = sc.nextInt();
			if (numero % 2 == 0)
				par++;
			else
				impar++;
		}
		System.out.println("O número de pares são: " + par);
		System.out.println("O número de ímpares são: " + impar);

	}
}
