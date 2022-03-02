package br.com.dio.exceptions;

import javax.swing.JOptionPane;

public class ExceptionPersonalizada2 {
	public static void main(String[] args) {
		int[] numerador = { 4, 5, 8, 10 };
		int[] denominador = { 2, 4, 0, 2, 8 };

		for (int i = 0; i < denominador.length; i++) {
			try {
				if (numerador[i] % 2 != 0)
					throw new DivisaoNaoExataException("Divisão não exata", numerador[i], denominador[i]);
				if(denominador[i] == 0)
					throw new DivisaoPorZero("Divisão por zero", denominador[i]);
				int resultado = numerador[i] / denominador[i];
				System.out.println(resultado);
			} catch (DivisaoNaoExataException e) {
				e.printStackTrace();
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
			catch (DivisaoPorZero e) {
				e.printStackTrace();
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
			catch (ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
		}
		System.out.println("O programa continua...");
	}
}

class DivisaoNaoExataException extends Exception {
	private int numerador;
	private int denominador;

	public DivisaoNaoExataException(String message, int numerador, int denominador) {
		super(message);
		this.numerador = numerador;
		this.denominador = denominador;
	}
}

class DivisaoPorZero extends Exception {
	private int denominador;

	public DivisaoPorZero(String message, int denominador) {
		super(message);
		this.denominador = denominador;
	}
}