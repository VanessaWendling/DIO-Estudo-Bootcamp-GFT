package br.com.collection.set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

/*
 * Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e IDE.
 * Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
 * a) Ordem de inserção;
 * b) Ordem natural(nome);
 * c) IDE;
 * d) Ano de criação e nome;
 * e) Nome, ano de criação e IDE;
 * Ao final, exiba as linguagens no console, um abaixo da outra.
*/

public class ExercicioProposto2 {
	public static void main(String[] args) {
		Set<LinguagemFavorita> linguagens = new HashSet<>() {{
			add(new LinguagemFavorita("Python", 1991, "Pycharm"));
			add(new LinguagemFavorita("JavaScript", 1995, "IntelliJ"));
			add(new LinguagemFavorita("Java", 1991, "Visual Studio Code"));
		}};
		
		
		System.out.println("Ordem de inserção");
		Set<LinguagemFavorita> linguagens1 = new LinkedHashSet<>(linguagens);
		 for (LinguagemFavorita linguagem : linguagens1) System.out.println(linguagem);
		
		System.out.println("Ordem natural: nome");
		Set<LinguagemFavorita> linguagens2 = new TreeSet<>(linguagens);
		for (LinguagemFavorita linguagemFavorita : linguagens2) {
			System.out.println(linguagemFavorita);
		}
		
		System.out.println("Ordem natural: ide");
		Set<LinguagemFavorita> linguagens3 = new TreeSet<>(new ComparatorIde());
		linguagens3.addAll(linguagens);
		System.out.println(linguagens3);
		
		
		System.out.println("Ordem natural: ano de criação e nome");
		Set<LinguagemFavorita> linguagens4 = new TreeSet<>(new ComparatorAnoDeCriacaoENome());
		linguagens4.addAll(linguagens);
		System.out.println(linguagens4);
		
		System.out.println("Ordem natural: nome - ano - ide");
		 Set<LinguagemFavorita> linguagens5 = new TreeSet<LinguagemFavorita>(new ComparatorNomeAnoDeCriacaoIde());
		 linguagens5.addAll(linguagens);
			System.out.println(linguagens5);
	}
}

class LinguagemFavorita implements Comparable<LinguagemFavorita> {

	private String nome;
	private Integer anoDeCriacao;
	private String ide;

	public LinguagemFavorita(String nome, Integer anoDeCriacao, String ide) {
		super();
		this.nome = nome;
		this.anoDeCriacao = anoDeCriacao;
		this.ide = ide;
	}

	@Override
	public String toString() {
		return "LinguagemFavorita [nome=" + nome + ", anoDeCriacao=" + anoDeCriacao + ", ide=" + ide + "]";
	}

	public String getNome() {
		return nome;
	}

	public Integer getAnoDeCriacao() {
		return anoDeCriacao;
	}

	public String getIde() {
		return ide;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ide, anoDeCriacao, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LinguagemFavorita other = (LinguagemFavorita) obj;
		return Objects.equals(ide, other.ide) && Objects.equals(anoDeCriacao, other.anoDeCriacao)
				&& Objects.equals(nome, other.nome);
	}

	@Override
	public int compareTo(LinguagemFavorita linguagem) {
		return this.getNome().compareTo(linguagem.getNome());
	}

}

class ComparatorIde implements Comparator<LinguagemFavorita>{
	@Override
	public int compare(LinguagemFavorita ling1, LinguagemFavorita ling2) {
		return ling1.getIde().compareTo(ling2.getIde());
	}
	
}

class ComparatorAnoDeCriacaoENome implements Comparator<LinguagemFavorita>{
	@Override
	public int compare(LinguagemFavorita ling1, LinguagemFavorita ling2) {
		int anoDeCriacao = Integer.compare(ling1.getAnoDeCriacao(), ling2.getAnoDeCriacao());
		if(anoDeCriacao != 0)
			return anoDeCriacao;
		
		return ling1.getNome().compareTo(ling2.getNome());
	}
	
}

class ComparatorNomeAnoDeCriacaoIde implements Comparator<LinguagemFavorita>{

	@Override
	public int compare(LinguagemFavorita ling1, LinguagemFavorita ling2) {
		int nome = ling1.getNome().compareTo(ling2.getNome());
		if (nome!= 0)
			return nome;
		int anoCriacao = Integer.compare(ling1.getAnoDeCriacao(), ling2.getAnoDeCriacao());
		if (anoCriacao!= 0)
			return anoCriacao;
	
		return  ling1.getIde().compareTo(ling2.getIde());
	}
	
}
