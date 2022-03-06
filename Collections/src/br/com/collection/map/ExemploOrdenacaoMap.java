package br.com.collection.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/* 
 * Dadas as seguintes informa��es sobre meus livros favoritos e seus autores,
 * crie um dicion�rio e ordene este dicion�rio:
 * exibindo (Nome Autor - Nome Livro);
 * Autor = Hawking, Stephen  - Livro = nome: Uma Breve Hist�ria do Tempo. p�ginas: 256
 * Autor = Duhigg, Charles - Livro = nome: O Poder do H�bito, paginas: 408
 * Autor = Harari, Yuval Noah  - Livro = 21 Li��es Para o S�culo 21, p�ginas: 432
*/

public class ExemploOrdenacaoMap {
	public static void main(String[] args) {
		System.out.println("Mostre na ordem aleat�ria");
		Map<String, Livro> meusLivros = new HashMap<>() {{
			put(" Hawking, Stephen", new Livro("Uma Breve Hist�ria do Tempo", 256));
            put(" Duhigg, Charles", new Livro("O Poder do H�bito", 408));
            put(" Harari, Yuval Noah", new Livro("21 Li��es Para o S�culo 21", 432));
		}};
		for(Map.Entry<String, Livro> livro : meusLivros.entrySet())
			System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
		
		System.out.println("Mostre na ordem de inser��o");
		Map<String, Livro> meusLivros2 = new LinkedHashMap<>(){{
			put(" Hawking, Stephen", new Livro("Uma Breve Hist�ria do Tempo", 256));
            put(" Duhigg, Charles", new Livro("O Poder do H�bito", 408));
            put(" Harari, Yuval Noah", new Livro("21 Li��es Para o S�culo 21", 432));
		}};
		for(Map.Entry<String, Livro> livro : meusLivros2.entrySet())
			System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
		
		System.out.println("Mostre na ordem alfab�tica de autores");
		Map<String, Livro> meusLivros3 = new TreeMap<>(meusLivros2);
		for(Map.Entry<String, Livro> livro : meusLivros3.entrySet())
			System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
		
		System.out.println("Mostre na ordem alfab�tica de livros");
		//precisa primeiro criar o set
		Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new ComparatorNomeDoLivro());
		meusLivros4.addAll(meusLivros.entrySet());
		for(Map.Entry<String, Livro> livro : meusLivros4)
			System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
		
		System.out.println("MOstre a ordem pelo n�meo de p�ginas");
		Set<Map.Entry<String, Livro>> meusLivros5 = new TreeSet<>(new ComparatorNumeroDePaginas());
		meusLivros5.addAll(meusLivros.entrySet());
		for(Map.Entry<String, Livro> livro : meusLivros5)
			System.out.println(livro.getKey() + " - " + livro.getValue().getPaginas());
	}
}

class Livro {
	private String nome;
	private Integer paginas;
	public Livro(String nome, Integer paginas) {
		super();
		this.nome = nome;
		this.paginas = paginas;
	}
	public String getNome() {
		return nome;
	}
	public Integer getPaginas() {
		return paginas;
	}
	@Override
	public int hashCode() {
		return Objects.hash(nome, paginas);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(paginas, other.paginas);
	}
	@Override
	public String toString() {
		return "Livro [nome=" + nome + ", paginas=" + paginas + "]";
	}
}

class ComparatorNomeDoLivro implements Comparator<Map.Entry<String, Livro>>{

	@Override
	public int compare(Map.Entry<String, Livro> livro1, Map.Entry<String, Livro> livro2) {
		return livro1.getValue().getNome().compareToIgnoreCase(livro2.getValue().getNome());
	}
}


class ComparatorNumeroDePaginas implements Comparator<Map.Entry<String, Livro>>{

	@Override
	public int compare(Entry<String, Livro> livro1, Entry<String, Livro> livro2) {
		return Integer.compare(livro1.getValue().getPaginas(), livro2.getValue().getPaginas());
	}
	
}