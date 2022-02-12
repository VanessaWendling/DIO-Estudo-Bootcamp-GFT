package com.dio.base;

import java.math.BigDecimal;

/**
 * @author Vanessa
 * @version 1.0.0
 * @since Realease 1.0.0
 * ^ a classe existe desde quando
 * @see BigDecimal
 * ^ pode ter quantos sees eu quiser
 */

public class Order {
	private final String code;
	private final int totalValue;
	private String[] items;
	
	
	/**
	 * Contrutor da classe
	 * @param code			código do pedido
	 * @param totalValue	valor total do pedido
	 */
	public Order(String code, int totalValue){
		this.code = code;
		this.totalValue = totalValue;
	}
	
	//estruturas de decisão
	
	public double calcularFe() {
		if(totalValue > 100) {
			return totalValue * 0.99;
		}else {
			return totalValue;
		}
	}
	
	public double calcularFee() {
		switch(totalValue) {
		case 100: 
			return totalValue * 0.99;
		case 200:
			return totalValue * 1.99;
		default:
			return totalValue;
		}
	}
	
	/**
	 * Calcula as taxas de acordo com o valor total do pedido. Se o o pedido for maior que R$100,00 uma taxa é cobrada
	 * @return						valor total do pedido com as taxas
	 * @throws RuntimeException		se o valor do pedido for negativo
	 */
	public double calculaFe() throws RuntimeException {
		if(this.totalValue < 0) {
			throw new RuntimeException("O pedido não pdoe ter valor negativo");
		}
		if(this.totalValue == 100) {
			return this.totalValue * 0.99;
		}
		return this.totalValue;
	}
	
	//estruturas de repetição
	
	public void printItems() {
		int i = 0;
		while(i < items.length) {
			System.out.println(items[i]);
			i++;
		}
	}
	
	public void printItem() {
		int i = 0;
		do {
			System.out.println(items[i]);
			i++;
		} while(i < items.length);	
	}
	
	public void printDosItems() {
		for(int i = 0; i < items.length; i++) {
			System.out.println(items[i]);
		}
	}
	
	public void printDoItem() {
		//ele ja entende que são os elementos da lista. Ou seja, cada i representa 1 elemento
		for(String i : items) {
			System.out.println(i);
		}
	}
	
	@Override
	public String toString() {
		return "Order={"+
				"code='" + code + "'" +
				"}";
	}
}
