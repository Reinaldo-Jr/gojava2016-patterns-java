package br.com.gojava.modelo;

import br.com.gojava.generico.Frete;
import br.com.gojava.generico.Item;

public class FreteEspecial extends Frete {
	
	public FreteEspecial(Item item) {
		super(item);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getPreco() {
		// TODO Auto-generated method stub
		return 10 + super.getPreco();		
	}	

}
