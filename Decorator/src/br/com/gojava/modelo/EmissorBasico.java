package br.com.gojava.modelo;

import br.com.gojava.generico.Emissor;

public class EmissorBasico implements Emissor {

	@Override
	public void enviaMSG(String mensagem) {
		System.out.println("Emissor Basico"+mensagem);
	}

}
