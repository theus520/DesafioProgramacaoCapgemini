package Desafio;

import java.util.List;
import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		ContinuacaoQuestao01 resultadoContinuaQuestao = new ContinuacaoQuestao01();
		
		System.out.println("Digite o numero de vezes");

		int quantidadeEscada = entrada.nextInt();
		
		List<String> escada = resultadoContinuaQuestao.digiteONumero(quantidadeEscada);
		
		resultadoContinuaQuestao.imprimir(escada);
			 
	}

}





	
	




 
	


