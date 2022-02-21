package Desafio;

public class QuestãoTeste03 {

public static void main(String[] args) {
	
	Questao03 anagrama = new Questao03();
	
	String palavra = anagrama.Digite_a_palavra();
	
	 palavra = anagrama.retiraEspaco(palavra);
	char vetor[];
	
	vetor = new char[palavra.length()];
	
   	anagrama.QuebraPalavra(palavra, vetor);

   	anagrama.MostraPalavra(vetor);

	
	
	
}
}
