package Desafio;

import java.util.Scanner;

public class Questao03 {

	public static String Digite_a_palavra() {
		Scanner entrada = new Scanner(System.in);
		String palavra = "";
		while (palavra.length() <= 2) {
			System.out.println("Digite uma palavra de no minimo 3 caracteres");
			palavra = entrada.nextLine();
		}
		return palavra;
	}

	public static void MostraPalavra(char[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
		System.out.println("");
	}

	public static String retiraEspaco(String palavra) {
		String alterada = "", interna = (palavra).trim();
		char c;

		for (int i = 0; i < interna.length(); i++) {
			c = interna.charAt(i);
			if (Character.isLetterOrDigit(c)) {
				System.out.println("i"+i);
				alterada += c;
			}
		}

		return alterada;
	}

	public static void CalculaAnagrama(char vetor[], int k) {
		int i;
		if (k == vetor.length - 1) {
			MostraPalavra(vetor);
		}else {
			CalculaAnagrama(vetor, k + 1);
			i = k + 1;
			while (i < vetor.length) {
				TrocaPosicao(vetor, k, i);
				CalculaAnagrama(vetor, k + 1);
				TrocaPosicao(vetor, k, i);
				i = i + 1;
			}
		}
	}

	public static void TrocaPosicao(char[] vetor, int k, int i) {
		char aux;
		aux = vetor[i];
		vetor[i] = vetor[k];
		vetor[k] = aux;
	}

	public static void QuebraPalavra(String palavra, char vetor[]) {
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = palavra.charAt(i);
		}
	}
}
