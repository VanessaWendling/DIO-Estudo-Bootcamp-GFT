package com.dio.main;

import com.dio.model.Cliente;
import com.dio.model.Conta;
import com.dio.model.ContaCorrente;
import com.dio.model.ContaPoupanca;

public class Main {
	public static void main(String[] args) {
		Conta corrente = new ContaCorrente(new Cliente("Vanessa"));
		Conta poupanca = new ContaPoupanca(new Cliente("Venilton"));
		
		corrente.depositar(100);
		corrente.transferir(100, poupanca);
		
		corrente.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
}
