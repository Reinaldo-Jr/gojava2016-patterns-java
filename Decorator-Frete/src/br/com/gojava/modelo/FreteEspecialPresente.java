package br.com.gojava.modelo;

import br.com.gojava.generico.Frete;
import br.com.gojava.generico.Item;

public class FreteEspecialPresente extends Frete {

	public FreteEspecialPresente(Item item) {
		super(item);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double getPreco() {
		// TODO Auto-generated method stub
		return 20 + super.getPreco();
	}	
	
	
}
