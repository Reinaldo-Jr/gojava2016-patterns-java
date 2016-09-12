package br.com.delta.principal;

import br.com.delta.modelo.Acao;
import br.com.delta.modelo.Corretora;

public class MainAcao {

	public static void main(String[] args) {
		Acao acaoPetro = new Acao("Petro", 4);
		Corretora corretoraBB 		= new Corretora("BB");
		Corretora corretoraSantander = new Corretora("Santander");
		acaoPetro.registraInteressado(corretoraBB);
		acaoPetro.registraInteressado(corretoraSantander);
		acaoPetro.setValor(12);
	}

}
