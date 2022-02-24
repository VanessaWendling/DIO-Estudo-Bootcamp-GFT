package com.dio.interfaces;

import com.dio.model.Conta;

public interface IConta {
	void sacar (double valor);
	
	void depositar(double valor);
	
	void transferir (double valor, Conta contaDestino);
	
	void imprimirExtrato();
}
