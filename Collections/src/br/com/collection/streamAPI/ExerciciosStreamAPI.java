package br.com.collection.streamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ExerciciosStreamAPI {
	public static void main(String[] args) {
		List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "6", "5");
		System.out.println("Imprima todos os elementos dessa lista de String: ");
		numerosAleatorios.forEach(System.out::println);

		System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set: ");
		Set<String> collectSet = numerosAleatorios.stream().limit(5).collect(Collectors.toSet());

		System.out.println("Transforme esta lista de String em uma lista de números inteiros: ");
		List<Integer> collectList = numerosAleatorios.stream() // Stream<String>
				.map(Integer::parseInt) // Stream<Integer>
				.collect(Collectors.toList()); // List<Integer>

		System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista: ");
		List<Integer> listParesMaioresQue2 = numerosAleatorios.stream().map(Integer::parseInt)
				.filter(i -> (i % 2 == 0 && i > 2)).collect(Collectors.toUnmodifiableList());
		System.out.println(listParesMaioresQue2);

		System.out.println("Mostre a média dos números: ");
		numerosAleatorios.stream() // Stream<String>
				.mapToInt(Integer::parseInt) // IntStream
				.average() // OptionalDouble
				.ifPresent(System.out::println);

		System.out.println("Remova os valores impares: ");
		List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream().map(Integer::parseInt)
				.collect(Collectors.toList());

		// removeIf significa que vai alterar a lista
		numerosAleatoriosInteger.removeIf(i -> i % 2 != 0);
		System.out.println(numerosAleatoriosInteger);

		System.out.println("Ignore os 3 primeiros elementos da lista e imprima o restante: ");
		numerosAleatoriosInteger.stream().skip(3).forEach(System.out::println);

		System.out.print("Retirando os números repetidos da lista, quantos números ficam? ");
		long countNumerosUnicos = numerosAleatoriosInteger.stream().distinct().count();
		System.out.println(countNumerosUnicos);

		System.out.println("Mostre o menor valor da lista: ");
		numerosAleatoriosInteger.stream().mapToInt(Integer::intValue).min().ifPresent(System.out::println);

		System.out.println("Mostre o maior valor da lista: ");
		numerosAleatoriosInteger.stream().mapToInt(Integer::intValue).max().ifPresent(System.out::println);

		System.out.print("Pegue apenas os números ímpares e some: ");
		int somaDosNumerosPares = numerosAleatoriosInteger.stream().filter(i -> (i % 2 == 0))
				.mapToInt(Integer::intValue).sum();
		System.out.println(somaDosNumerosPares);

		System.out.println("Mostre a lista na ordem numérica: ");
		List<Integer> numerosOrdemNatural = numerosAleatoriosInteger.stream().sorted(Comparator.naturalOrder())
				.collect(Collectors.toList());
		System.out.println(numerosOrdemNatural);

		System.out.println("Agrupe os valores ímpares múltiplos de 3 e do 5: ");
		Map<Boolean, List<Integer>> collectNumerosMultiplosDe3E5 = numerosAleatoriosInteger.stream()
                .collect(Collectors.groupingBy(i -> (i % 3 == 0 || i % 5 == 0)));
        System.out.println(collectNumerosMultiplosDe3E5);
	}
}
