package Desafio;

public class QuestaoUsuario02 {

	public QuestaoUsuario02() {

	}

	private String nome;
	private String senha;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {

		if (nome != null) {
			this.nome = nome;
			System.out.println("Cadastro com sucesso.");

		} else {
			System.out.println("Digita o nome!");
		}
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {

		if (senha != null) {
			if (validarSenha(senha)) {
				this.senha = senha;
				System.out.println("Cadastro com sucesso.");
			} else {
				System.out.println("Senha invalida.");
			}

		} else {
			System.out.println("Digita a senha!");
		}
	}

	private boolean validarSenha(String senha) {
		if (senha.length() < 6)
			return false;

		boolean isNumero = false;
		boolean isMaiuscula = false;
		boolean isMinuscula = false;
		boolean isSimbolo = false;

		for (char c : senha.toCharArray()) {
			if (c >= '0' && c <= '9') {
				isNumero = true;
			} else if (c >= 'A' && c <= 'Z') {
				isMaiuscula = true;
			} else if (c >= 'a' && c <= 'z') {
				isMinuscula = true;
			} else {
				isSimbolo = true;
			}
		}
		return isNumero && isMaiuscula && isMinuscula && isSimbolo;
	}

	@Override
	public String toString() {
		return "QuestaoUsuario02 [nome=" + nome + ", senha=" + senha + "]";
	}

}
