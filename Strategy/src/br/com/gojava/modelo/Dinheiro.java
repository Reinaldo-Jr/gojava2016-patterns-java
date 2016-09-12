package br.com.gojava.modelo;

import br.com.gojava.generico.FormaPagamento;

public class Dinheiro implements FormaPagamento {

	@Override
	public void pagar() {
		System.out.println("Pagamento Realizado com DINHEIRO");
	}

}
