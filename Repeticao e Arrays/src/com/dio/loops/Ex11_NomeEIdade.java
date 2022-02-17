package com.dio.loops;

import java.util.Scanner;

/*
 * Faça um programa que leia conjuntos de dois valores, o primeiro representando
 * o nome do aluno e o seunfo representando a sua idade.
 * Pare inserindo o valor 0 no campo nome
 */

public class Ex11_NomeEIdade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome;
		int idade;

		while (true) {
			System.out.println("Nome: ");
			nome = sc.next();
			if (nome.equals("0"))
				break;
			System.out.println("Idade: ");
			idade = sc.nextInt();
		}
		System.out.println("Saiu do laço");
	}
}
