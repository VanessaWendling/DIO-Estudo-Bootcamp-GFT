package br.com.collection.set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

/*
 * Dadas as seguintes informações sobre minhas séries favoritas,
 * crie um conjunto e ordene este confjunto exibindo:
 * 
 * Série1 = Nome: got, genero: fantasia, tempoEpisodio: 60;
 * Série2 = Nome: dark, genero: drama, tempoEpisodio: 60;
 * Série3 = Nome:that '70s show, genero: comédia, tempoEpisodio: 25
 */

public class ExemploOrdenacaoSet {
	public static void main(String[] args) {
		System.out.println("Ordem aleatória");
		Set<Serie> minhasSeries = new HashSet<>(){{
			add(new Serie("got", "fantasia", 60));
			add(new Serie("dark", "drama", 60));
			add(new Serie("that '70s show", "comédia", 25));
		}};
		for(Serie serie: minhasSeries)
			System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio() );

		Set<Serie> minhasSeries2 = new LinkedHashSet<>() {{
			add(new Serie("got", "fantasia", 60));
			add(new Serie("dark", "drama", 60));
			add(new Serie("that '70s show", "comédia", 25));
		}};
		for(Serie serie: minhasSeries2)
			System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio() );
		
		System.out.println("Ordem natural (TempoEpisodio)");
		Set<Serie> minhasSeries3 = new TreeSet<>(minhasSeries);
		for(Serie serie: minhasSeries3)
			System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio() );

		System.out.println("Ordem Nome - Gênero - Tempo");
		Set<Serie> minhasSeries4 = new TreeSet<>(new ComparatoNomeGeneroTempoEpisodio());
		minhasSeries4.addAll(minhasSeries);
		for(Serie serie: minhasSeries4)
			System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio() );
		
		System.out.println("Ordem Gênero");
		Set<Serie> minhasSeries5 = new TreeSet<>(new ComparatorGenero());
		minhasSeries5.addAll(minhasSeries);
		for(Serie serie: minhasSeries5)
			System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio() );

		System.out.println("Ordem Tempo Episodio");
		Set<Serie> minhasSeries6 = new TreeSet<>(new ComparatorTempoEpisodio());
		minhasSeries6.addAll(minhasSeries);
		for(Serie serie: minhasSeries6)
			System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio() );
		
		
		
	}
}

		
		
class Serie implements Comparable<Serie>{
	private String nome;
	private String genero;
	private Integer tempoEpisodio;
	public Serie(String nome, String genero, Integer tempoEpisodio) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.tempoEpisodio = tempoEpisodio;
	}
	public String getNome() {
		return nome;
	}
	public String getGenero() {
		return genero;
	}
	public Integer getTempoEpisodio() {
		return tempoEpisodio;
	}
	@Override
	public String toString() {
		return "Serie [nome=" + nome + ", genero=" + genero + ", tempoEpisodio=" + tempoEpisodio + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(genero, nome, tempoEpisodio);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Serie other = (Serie) obj;
		return Objects.equals(genero, other.genero) && Objects.equals(nome, other.nome)
				&& Objects.equals(tempoEpisodio, other.tempoEpisodio);
	}
	@Override
	public int compareTo(Serie serie) {
		int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
		if(tempoEpisodio != 0)
			return tempoEpisodio;
		
		return this.getGenero().compareTo(serie.getGenero());
	}
}


class ComparatoNomeGeneroTempoEpisodio implements Comparator<Serie>{

	@Override
	public int compare(Serie s1, Serie s2) {
		
		int nome = s1.getNome().compareTo(s2.getNome());
		if(nome != 0)
			return nome;
		
		int genero = s1.getGenero().compareTo(s2.getGenero());
		if(genero != 0)
			return genero;
		
		return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
	}
	
}

class ComparatorGenero implements Comparator<Serie>{

	@Override
	public int compare(Serie s1, Serie s2) {
		return s1.getGenero().compareTo(s2.getGenero());
	}
	
}

class ComparatorTempoEpisodio implements Comparator<Serie>{

	@Override
	public int compare(Serie s1, Serie s2) {
		
		int tempoEpisodio = Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
		if(tempoEpisodio != 0)
			return tempoEpisodio;
		
		return s1.getGenero().compareTo(s2.getGenero());
		
	}
	
}