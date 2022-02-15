package com.dio.exercicio1;

public class Principal {

	public static void main(String[] args) {
		System.out.println("********* Calculadora *********");
		Calculadora.soma(3, 6);
		Calculadora.subtracao(9, 1.8);
		Calculadora.multiplicacao(7, 8);
		Calculadora.divisao(5, 2.5);
		
		System.out.println("***** Exerc�cio  Mensagem *****");
		Mensagem.obterMensagem(9);
		Mensagem.obterMensagem(14);
		Mensagem.obterMensagem(1);
		Mensagem.obterMensagem(25);
		
		System.out.println("***** Exerc�cio Empr�stimo *****");
		Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
		Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
		Emprestimo.calcular(1000, 5);
	}

}
