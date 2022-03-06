package br.com.collection.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/*
 * Dada a popula��o estimada de alguns estados do nordeste brasileiro, fa�a:
 * Estado = PE - popula��o = 9.616.621
 * Estado = AL - popula��o = 3.351.543
 * Estado = CE - popula��o  = 9.187.103
 * Estado = RN - popula��o = 3.534.265
 */

public class ExercicioProposto1 {
	public static void main(String[] args) {
		System.out.println("Crie um dicion�rio e relacione os estados e suas popula��es");
		Map<String, Integer> populacao = new HashMap<>() {
			{
				put("PE", 9616621);
				put("AL", 3351543);
				put("CE", 9187103);
				put("RN", 3534265);
			}
		};
		System.out.println(populacao);

		System.out.println("Substitua a popula��o do estado do RN por 3.534.165");
		populacao.put("RN", 3534165);
		System.out.println(populacao);

		System.out.println("Confira se o estado PB est� no dicion�rio, caso n�o, adicione: PB - 4.039.277: "
				+ populacao.containsKey("PB"));
		if (!populacao.containsKey("PB"))
			populacao.put("PB", 4039277);
		System.out.println(populacao);

		System.out.println("Exiba a popula��o de PE: " + populacao.get("PE"));

		System.out.println("Exiba todos os estados e suas popula��es na ordem que foi informado");
		Map<String, Integer> populacao1 = new LinkedHashMap<>() {
			{
				put("PE", 9616621);
				put("AL", 3351543);
				put("CE", 9187103);
				put("RN", 3534265);
			}
		};
		System.out.println(populacao1);

		System.out.println("Exiba todos os estados e suas popula��es na ordem alfab�tica:");
		Map<String, Integer> populacao2 = new TreeMap<>(populacao1);
		System.out.println(populacao2);

		System.out.print("Exiba o estado com a menor popula��o e sua quantidade: ");
		Collection<Integer> populacao3 = populacao.values();

		String menor = "";
		for (Map.Entry<String, Integer> entry : populacao.entrySet())
			if (entry.getValue().equals(Collections.min(populacao3)))
				menor = entry.getKey();
		System.out.println(menor + " - " + Collections.min(populacao3));

		System.out.print("Exiba o estado com a maior popula��o e sua quantidade: ");
		String maior = "";
		for (Map.Entry<String, Integer> entry : populacao.entrySet())
			if (entry.getValue().equals(Collections.max(populacao3)))
				maior = entry.getKey();
		System.out.println(maior + " - " + Collections.max(populacao3));

		System.out.print("Exiba a soma da popula��o desses estados: ");
		int soma = 0;
		Iterator<Integer> iteretor = populacao.values().iterator();
		while (iteretor.hasNext())
			soma += iteretor.next();
		System.out.println(soma);

		System.out.println("Exiba a m�dia da popula��o deste dicion�rio de estados: " + soma / populacao.size());

		System.out.println("Revomova os estados com a popula��o menor que 4.000.000");
		Iterator<Integer> iterator1 = populacao.values().iterator();
		while (iterator1.hasNext())
			if (iterator1.next() > 4000000)
				iterator1.remove();
		System.out.println(populacao);

		System.out.println("Apague o dicion�rio");
		populacao.clear();

		System.out.println("Confira se o dicion�rio est� vazio: " + populacao.isEmpty());
	}
}
