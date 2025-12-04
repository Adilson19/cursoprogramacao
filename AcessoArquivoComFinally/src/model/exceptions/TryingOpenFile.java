package model.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryingOpenFile {
	private String fileName;
	public TryingOpenFile(String fileName) {
		this.fileName = fileName;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public void tryingOpenFileException(String nameFile) {
		FileReader reader = null; 
		try {
			System.out.println("Tentando abrir o arquivo: " + getFileName() + "...");
			
			reader = new FileReader(this.fileName);
			System.out.println("Arquivo aberto com sucesso! Pronto para leitura");
		}
		catch(FileNotFoundException e) {
			System.out.println("Erro: O aquivo '" + getFileName() + "' nao foi encontrado.");
			System.out.println("Detalhes da Execucao: " + e.getMessage());			
		}
		catch(IOException e) {
			System.out.println("Erro de I/O durante o processamento do arquivo.");
			System.out.println("Detalhes da Excecao: " + e.getMessage());
		}finally {
			//	O bloco finally eh SEMPRE EXECUTADO, independemente de uma execucao ter ocorrido ou nao.
			
			System.out.println("\n*** Tentativa de acesso ao arquivo concluida. ***");
			
			// DESAFIO: Garante que o arquivo seja fechado, se tiver sido aberto (nao for null)
			if(reader != null) {
				try {
					reader.close();
					System.out.println("Arquivo fechado com sucesso no bloco finally");
				}
				catch(IOException e) {
					System.out.println("Erro ao tentar fechar o arquivo no finally: " + e.getMessage());
				}
			}
		}
	}
}
