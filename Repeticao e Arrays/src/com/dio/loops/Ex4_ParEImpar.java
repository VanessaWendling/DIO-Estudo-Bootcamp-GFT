package com.dio.loops;

import java.util.Scanner;

/*
 * Fa�a um programa que pe�a N n�meros inteiros, calcule e mostre a quantidade
 * de n�meros pares e a quantidade de n�meros impares
 */

public class Ex4_ParEImpar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int par = 0, impar = 0;
		int quantidadeNumeros = sc.nextInt();
		for (int i = 0; i < quantidadeNumeros; i++) {
			System.out.println("Digite um n�mero: ");
			int numero = sc.nextInt();
			if (numero % 2 == 0)
				par++;
			else
				impar++;
		}
		System.out.println("O n�mero de pares s�o: " + par);
		System.out.println("O n�mero de �mpares s�o: " + impar);

	}
}
