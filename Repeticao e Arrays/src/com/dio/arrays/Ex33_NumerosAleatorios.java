package com.dio.arrays;

import java.util.Scanner;

/*
 * Faça um programa que leia 20 números inteiros aleatórios (entre 0 e 100)
 * armazene-os num vetor. Ao final, mostre os números e seus sucessores.
 */

public class Ex33_NumerosAleatorios {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int[] vet = new int[20];

		for (int i = 0; i < vet.length; i++) {
			do {
				num = sc.nextInt();
			} while (num < 0 || num > 100);
			vet[i] = num;
		}
		for (int numero : vet) {
			System.out.println((numero - 1) + " - " + numero + " - " + (numero + 1));
		}
	}
}
