package br.com.delta.generico;

import br.com.delta.modelo.Acao;

public interface AcaoObserver {

	public void notificaAlteracao(Acao acao);
	
}
