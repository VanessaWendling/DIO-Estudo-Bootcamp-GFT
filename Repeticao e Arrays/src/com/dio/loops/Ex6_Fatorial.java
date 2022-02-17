package com.dio.loops;

import java.util.Scanner;

/*
 * Fa�a um programa que mostre o fatorial de um n�meor inteiro fornecido pelo usu�rio.
 */

public class Ex6_Fatorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int produtoFatorial = 1;
		System.out.println("Digite o n�mero que deseja consultar o fatorial: ");
		int fatorial = sc.nextInt();
		for (int i = fatorial; i > 0; i--)
			produtoFatorial *= i;

		System.out.println(fatorial + "! = " + produtoFatorial);
	}
}
