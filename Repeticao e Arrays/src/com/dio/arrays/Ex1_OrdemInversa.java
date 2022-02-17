package com.dio.arrays;

import java.util.Scanner;

/*
 * Crie um vetor de 6 números inteiros e mostre-os na ordem inversa
 */

public class Ex1_OrdemInversa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] vetor = { 0, -5, 15, 50, 8, 4 };
		System.out.print("vetor = ");
		for (int i = 5; i >= 0; i--)
			System.out.print(vetor[i] + "\t");
	}
}
