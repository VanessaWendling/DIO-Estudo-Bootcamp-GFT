package br.com.collection.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/*
 * Dada a população estimada de alguns estados do nordeste brasileiro, faça:
 * Estado = PE - população = 9.616.621
 * Estado = AL - população = 3.351.543
 * Estado = CE - população  = 9.187.103
 * Estado = RN - população = 3.534.265
 */

public class ExercicioProposto1 {
	public static void main(String[] args) {
		System.out.println("Crie um dicionário e relacione os estados e suas populações");
		Map<String, Integer> populacao = new HashMap<>() {
			{
				put("PE", 9616621);
				put("AL", 3351543);
				put("CE", 9187103);
				put("RN", 3534265);
			}
		};
		System.out.println(populacao);

		System.out.println("Substitua a população do estado do RN por 3.534.165");
		populacao.put("RN", 3534165);
		System.out.println(populacao);

		System.out.println("Confira se o estado PB está no dicionário, caso não, adicione: PB - 4.039.277: "
				+ populacao.containsKey("PB"));
		if (!populacao.containsKey("PB"))
			populacao.put("PB", 4039277);
		System.out.println(populacao);

		System.out.println("Exiba a população de PE: " + populacao.get("PE"));

		System.out.println("Exiba todos os estados e suas populações na ordem que foi informado");
		Map<String, Integer> populacao1 = new LinkedHashMap<>() {
			{
				put("PE", 9616621);
				put("AL", 3351543);
				put("CE", 9187103);
				put("RN", 3534265);
			}
		};
		System.out.println(populacao1);

		System.out.println("Exiba todos os estados e suas populações na ordem alfabética:");
		Map<String, Integer> populacao2 = new TreeMap<>(populacao1);
		System.out.println(populacao2);

		System.out.print("Exiba o estado com a menor população e sua quantidade: ");
		Collection<Integer> populacao3 = populacao.values();

		String menor = "";
		for (Map.Entry<String, Integer> entry : populacao.entrySet())
			if (entry.getValue().equals(Collections.min(populacao3)))
				menor = entry.getKey();
		System.out.println(menor + " - " + Collections.min(populacao3));

		System.out.print("Exiba o estado com a maior população e sua quantidade: ");
		String maior = "";
		for (Map.Entry<String, Integer> entry : populacao.entrySet())
			if (entry.getValue().equals(Collections.max(populacao3)))
				maior = entry.getKey();
		System.out.println(maior + " - " + Collections.max(populacao3));

		System.out.print("Exiba a soma da população desses estados: ");
		int soma = 0;
		Iterator<Integer> iteretor = populacao.values().iterator();
		while (iteretor.hasNext())
			soma += iteretor.next();
		System.out.println(soma);

		System.out.println("Exiba a média da população deste dicionário de estados: " + soma / populacao.size());

		System.out.println("Revomova os estados com a população menor que 4.000.000");
		Iterator<Integer> iterator1 = populacao.values().iterator();
		while (iterator1.hasNext())
			if (iterator1.next() > 4000000)
				iterator1.remove();
		System.out.println(populacao);

		System.out.println("Apague o dicionário");
		populacao.clear();

		System.out.println("Confira se o dicionário está vazio: " + populacao.isEmpty());
	}
}
