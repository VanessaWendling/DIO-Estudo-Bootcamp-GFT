package com.dio.model;

import com.dio.interfaces.IConta;

public abstract class Conta implements IConta{
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;	
	
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	@Override
	public void sacar(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
		}
		
	}
	@Override
	public void depositar(double valor) {
		if(valor > 0) {
			this.saldo += valor;
		}
		
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	
	protected void inprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
		
	}
	
	
}
