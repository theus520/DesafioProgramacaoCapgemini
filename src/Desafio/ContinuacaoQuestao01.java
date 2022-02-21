package Desafio;

import java.util.ArrayList;
import java.util.List;

public class ContinuacaoQuestao01 {
	
	public 	List<String> digiteONumero(int quantidadeEscada) {
		List<String> escada = new ArrayList<>();

		for ( int i = 0; i < quantidadeEscada; i++) {
     		escada.add(" ".repeat(quantidadeEscada - i) + "*".repeat(i+ 1));	
		}
		return escada;
	}
	
	public void imprimir (List<String> escada ) {
		for( String e:escada){
	       	System.out.println(e);
        }
    }
}

	

