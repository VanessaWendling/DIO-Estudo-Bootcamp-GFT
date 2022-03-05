package br.com.collection.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*
 * Crie uma conjunto contendo as cores do arco-�ris e:
 * a) Exiba todas as cores o arco-�ris uma abaixo da outra;
 * b) A quantidade de cores que o arco-�ris tem;
 * c) Exiba as cores em ordem alfab�tica;
 * d) Exiba as cores na ordem inversa da que foi informada;
 * e) Exiba todas as cores que come�am com a letra �v�;
 * f) Remova todas as cores que n�o come�am com a letra �v�;
 * g) Limpe o conjunto;
 * h) Confira se o conjunto est� vazio;
 */

public class ExercicioProposto1 {
	public static void main(String[] args) {
		Set<String> coresArcoIris = new HashSet<>() {
			{
				add("violeta");
				add("anil");
				add("azul");
				add("verde");
				add("amarelo");
				add("laranja");
				add("vermelho");
			}
		};
		System.out.println("Exiba todas as cores o arco-�ris uma abaixo da outra");
		for (String cor : coresArcoIris) {
			System.out.println(cor);
		}
		
		System.out.println("b) A quantidade de cores que o arco-�ris tem: " + coresArcoIris.size());
		
		System.out.println("Exiba as cores em ordem alfab�tica");
		Set<String> coresArcoIris2 = new TreeSet<>(coresArcoIris);
		System.out.println(coresArcoIris2);
		
		//ATEN��OOOO
		System.out.println("Exiba as cores na ordem inversa da que foi informada");
		Set<String> coresArcoIris3 = new LinkedHashSet<>(coresArcoIris);
		List<String> coresArcoIrisList = new ArrayList<>(coresArcoIris3);
        Collections.reverse(coresArcoIrisList);
        System.out.println(coresArcoIrisList);
        
        System.out.println("Remova todas as cores que n�o come�am com a letra �v�: ");
        Iterator<String> iterator1 = coresArcoIris.iterator();
        while (iterator1.hasNext())
            if (!iterator1.next().startsWith("v"))
            	iterator1.remove();
        
        System.out.println(coresArcoIris);

        System.out.println("Limpe o conjunto: ");
        coresArcoIris.clear();

        System.out.println("Confira se o conjunto est� vazio: " + coresArcoIris.isEmpty());
		
	}
}
