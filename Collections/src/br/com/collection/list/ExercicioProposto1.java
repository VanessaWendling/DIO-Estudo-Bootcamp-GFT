package br.com.collection.list;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*
 * Fa�a um programa que receba a temperatura m�dia dos 6 
 * primeiros meses do ano e armazene-as em uma lista.
 * 
 * Ap�s isto, calcule a m�dia semestral das temperaturas e
 * mostre todas as temperaturas acima desta m�dia, e em que
 * m�s elas ocorreram (mostre o m�s por extenso)
 */


public class ExercicioProposto1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Double> temperaturas = new ArrayList<>();
		double soma = 0.0;
		
		for(int i = 0; i < 6; i++) {
			double temperatura = sc.nextDouble();
			temperaturas.add(temperatura);
			soma += temperatura;
		}
		
		System.out.print("A m�dia semestral �: " );
		double media = soma/temperaturas.size();
		System.out.println(media);
		
		System.out.println("-----------------------");
		System.out.println(temperaturas);
		System.out.println("-----------------------");
		
		
		System.out.println("As temperaturas acima da m�dia: ");
		for (Double temperatura : temperaturas)
			if(temperatura > media) {
				int index = temperaturas.indexOf(temperatura);
				switch(index) {
				case 0:
					System.out.println( temperatura + " - Janeiro");
					break;
				case 1:
					System.out.println( temperatura + " - Fevereiro");
					break;
				case 2:
					System.out.println( temperatura + " - Mar�o");
					break;
				case 3:
					System.out.println( temperatura + " - Abril");
					break;
				case 4:
					System.out.println( temperatura + " - Maio");
					break;
				case 5:
					System.out.println( temperatura + " - Junho");
					break;
				default:
					System.out.println("Todas as temperaturas foram abaixo da m�dia");
				}
			}
				
		
	}
}
