package com.dio.arrays;

import java.util.Random;

/*
 * Fa�a um programa que leia 20 n�meros inteiros aleat�rios (entre 0 e 100)
 * armazene-os num vetor. Ao final, mostre os n�meros e seus sucessores.
 */

public class Ex3_NumerosAleatorios {
	public static void main(String[] args) {
		Random random = new Random();
		int[] vet = new int[20];

		for (int i = 0; i < vet.length; i++) {
			int numero = random.nextInt(100); // o valor gerado ser� de no m�ximo 100
			vet[i] = numero;
		}
		for (int numeros : vet) {
			System.out.println((numeros - 1) + " - " + numeros + " - " + (numeros + 1));
		}
	}
}
