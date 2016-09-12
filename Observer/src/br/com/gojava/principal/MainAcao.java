package br.com.gojava.principal;

import br.com.gojava.generico.Observador;
import br.com.gojava.modelo.Acao;
import br.com.gojava.modelo.Banco;
import br.com.gojava.modelo.Corretora;

public class MainAcao {

	public static void main(String[] args) {
		Acao acaoPetro = new Acao("Petro", 4);
		Observador corretoraBB 		   = new Corretora("BB");
		Observador corretoraSantander  = new Corretora("Santander");
		Observador bancoBB             = new Banco("BB");
		Observador bancoSantander      = new Banco("Santander");
		acaoPetro.registraObservador(corretoraBB);
		acaoPetro.registraObservador(corretoraSantander);
		acaoPetro.registraObservador(bancoBB);
		acaoPetro.registraObservador(bancoSantander);
		acaoPetro.setValor(12);
	}

}
