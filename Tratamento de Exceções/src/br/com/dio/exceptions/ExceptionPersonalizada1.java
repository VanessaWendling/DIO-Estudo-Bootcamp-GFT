package br.com.dio.exceptions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

import javax.swing.JOptionPane;

public class ExceptionPersonalizada1 {

	public static void main(String[] args) {
		String nomeDoArquivo = JOptionPane.showInputDialog("nome do arquivo a ser exibido: ");
		imprimirArquivoNoConsole(nomeDoArquivo);

		System.out.println("Com exception ou não, o programa continua");
	}

	public static void imprimirArquivoNoConsole(String nomeDoArquivo) {
		try {
			BufferedReader br = lerArquivo(nomeDoArquivo);
			String line = br.readLine();
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			do {
				bw.write(line);
				bw.newLine();
				line = br.readLine();
			} while (line != null);
			bw.flush();
			br.close();
		} catch (ImpossivelAberturaDeArquivoException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null,
					"Ocorreu um erro não esperado. Por favor, fale com o suporte" + e.getMessage());
			e.printStackTrace();
		}
	}

	public static BufferedReader lerArquivo(String nomeDoArquivo) throws ImpossivelAberturaDeArquivoException {
		File file = new File(nomeDoArquivo);
		try {
			return new BufferedReader(new FileReader(nomeDoArquivo));
		} catch (FileNotFoundException e) {
			throw new ImpossivelAberturaDeArquivoException(file.getName(), file.getPath());
		}
	}
}

class ImpossivelAberturaDeArquivoException extends Exception{
	private String nomeDoArquivo;
	private String diretorio;
	public ImpossivelAberturaDeArquivoException(String nomeDoArquivo, String diretorio) {
		super ("O arquivo " + nomeDoArquivo + " não foi encontrado no diretório " + diretorio);
		this.nomeDoArquivo = nomeDoArquivo;
		this.diretorio = diretorio;
	}
	@Override
	public String toString() {
		return "ImpossivelAberturaDeArquivoException [nomeDoArquivo=" + nomeDoArquivo + ", diretorio=" + diretorio
				+ "]";
	}
}


	