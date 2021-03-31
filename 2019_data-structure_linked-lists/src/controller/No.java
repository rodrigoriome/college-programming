package controller;

public class No {

	private Produto produto;
	private No proximo;

	public No(Produto produto) {
		this.produto = produto;
	}

	public Produto getproduto() {
		return produto;
	}

	public void setproduto(Produto produto) {
		this.produto = produto;
	}

	public No getProximo() {
		return proximo;
	}

	public void setProximo(No proximo) {
		this.proximo = proximo;
	}

	@Override
	public String toString() {
		return this.produto.toString() + " --> ";
	}
}
