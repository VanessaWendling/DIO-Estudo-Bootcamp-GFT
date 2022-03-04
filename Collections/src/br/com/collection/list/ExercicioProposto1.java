package br.com.collection.list;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*
 * Faça um programa que receba a temperatura média dos 6 
 * primeiros meses do ano e armazene-as em uma lista.
 * 
 * Após isto, calcule a média semestral das temperaturas e
 * mostre todas as temperaturas acima desta média, e em que
 * mês elas ocorreram (mostre o mês por extenso)
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
		
		System.out.print("A média semestral é: " );
		double media = soma/temperaturas.size();
		System.out.println(media);
		
		System.out.println("-----------------------");
		System.out.println(temperaturas);
		System.out.println("-----------------------");
		
		
		System.out.println("As temperaturas acima da média: ");
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
					System.out.println( temperatura + " - Março");
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
					System.out.println("Todas as temperaturas foram abaixo da média");
				}
			}
				
		
	}
}
