package com.dio.loops;

import java.util.Scanner;

/*
 * Faça um programa que leia conjuntos de dois valores, o primeiro representando
 * o nome do aluno e o seunfo representando a sua idade.
 * Pare inserindo o valor 0 no campo nome
 */

public class Ex1_NomeEIdade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome;
		int idade;

		do {
			System.out.println("Nome: ");
			nome = sc.next();
			System.out.println("Idade: ");
			idade = sc.nextInt();
		} while (!nome.equals("0"));
	}

}
