package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a, b;
		
		System.out.println("Digite o primeiro valor: ");
		a = sc.nextDouble();
		System.out.println("Digite o segundo valor: ");
		b = sc.nextDouble();

		double soma = soma(a, b);
		double subtrsacao = subtrsacao(a, b);
		double divisao = divisao(a, b);
		double multiplicacao = multiplicacao(a, b);
		
		System.out.println("Soma: " + soma);
		System.out.println("Subtração: " + subtrsacao);
		System.out.println("Divisão: " + divisao);
		System.out.println("Multiplicação: " + multiplicacao);
	}
	
	public static double soma(double a, double b) {
		return a + b;
	}
	
	public static double subtrsacao(double a, double b) {
		return a - b;
	}
	
	public static double divisao(double a, double b) {
		return (a/b);
	}
	
	public static double multiplicacao(double a, double b) {
		return a * b;
	}

}
