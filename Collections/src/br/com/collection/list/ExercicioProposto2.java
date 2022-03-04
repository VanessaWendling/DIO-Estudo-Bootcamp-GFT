package br.com.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*
 * Utilizando listas, fa�a um programa que fa�a 5 perguntas
 * para uma pessoa sobre um crime. As perguntas s�o:
 * 
 * "Telefonou para a v�tima?"
 * "Esteve no local do crime?"
 * "Mora perto da v�tima?"
 * "Devia para a v�tima?"
 * "J� trabalhou com a v�tima?"
 * 
 * Se a pessoa responder positivamente a 2 quest�es ela deve ser
 * classificada como suspeita, entre 3 e 4 como c�mplice e 5 como
 * assassina. Caso contr�rio, ela ser� classificada como inocente.
 */

public class ExercicioProposto2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<String> respostas = new ArrayList<>();
		
		String resposta;
		
		System.out.println("Telefonou para a v�tima?");
		resposta = sc.next();
		respostas.add(resposta.toLowerCase());
		System.out.println("Esteve no local do crime?");
		resposta = sc.next();
		respostas.add(resposta.toLowerCase());
		System.out.println("Mora perto da v�tima?");
		resposta = sc.next();
		respostas.add(resposta.toLowerCase());
		System.out.println("Devia para a v�tima?");
		resposta = sc.next();
		respostas.add(resposta.toLowerCase());
		System.out.println("J� trabalhou com a v�tima?");
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
            System.out.println("c�mplice");
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
