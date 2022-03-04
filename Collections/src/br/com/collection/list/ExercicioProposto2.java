package br.com.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*
 * Utilizando listas, faça um programa que faça 5 perguntas
 * para uma pessoa sobre um crime. As perguntas são:
 * 
 * "Telefonou para a vítima?"
 * "Esteve no local do crime?"
 * "Mora perto da vítima?"
 * "Devia para a vítima?"
 * "Já trabalhou com a vítima?"
 * 
 * Se a pessoa responder positivamente a 2 questões ela deve ser
 * classificada como suspeita, entre 3 e 4 como cúmplice e 5 como
 * assassina. Caso contrário, ela será classificada como inocente.
 */

public class ExercicioProposto2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<String> respostas = new ArrayList<>();
		
		String resposta;
		
		System.out.println("Telefonou para a vítima?");
		resposta = sc.next();
		respostas.add(resposta.toLowerCase());
		System.out.println("Esteve no local do crime?");
		resposta = sc.next();
		respostas.add(resposta.toLowerCase());
		System.out.println("Mora perto da vítima?");
		resposta = sc.next();
		respostas.add(resposta.toLowerCase());
		System.out.println("Devia para a vítima?");
		resposta = sc.next();
		respostas.add(resposta.toLowerCase());
		System.out.println("Já trabalhou com a vítima?");
		resposta = sc.next();
		respostas.add(resposta.toLowerCase());
		
		int cont = 0;
        Iterator<String> iterator = respostas.iterator();
        while(iterator.hasNext())
            if(iterator.next().contains("s")) 
                cont++;
        
        switch(cont) {
        case 2:
            System.out.println("suspeito");
            break;
        case 3:
        case 4:
            System.out.println("cúmplice");
            break;
        case 5:
            System.out.println("assassino");
            break;
        default:
            System.out.println("inocente");
            break;
        }
	}
}
