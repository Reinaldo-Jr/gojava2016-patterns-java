package br.com.gojava.generico;

public abstract class Frete implements Item {
	
	private Item item;

	public Frete(Item item) {
		super();
		this.item = item;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	@Override
	public double getPreco() {
		// TODO Auto-generated method stub
		return getItem().getPreco();
	}

}
