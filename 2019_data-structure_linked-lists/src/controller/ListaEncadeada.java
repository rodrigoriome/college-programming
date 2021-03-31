package controller;

public class ListaEncadeada {

	private No inicio;

	// a lista é inicializada vazia
	public ListaEncadeada() {
		this.setInicio(null);
	}

    public No getInicio() {
        return inicio;
    }

    public void setInicio(No inicio) {
        this.inicio = inicio;
    }

    // método getTamanho
    public int getTamanho() {
        No atual = this.getInicio();
        int tamanho = 0;
        while (atual != null) {
            tamanho++;
            atual = atual.getProximo();
        }

        return tamanho;
    }

	// desenvolvido em aula
	public void insereNoInicio(Produto produto) {
		No novo = new No(produto);
		novo.setProximo(inicio);
		setInicio(novo);
	}

	// imprimindo todos elementos da lista
	public void listar() {
        if (this.getInicio() == null) {
            System.out.print("(vazia)");
            return;
        }

		No atual = inicio;

		while (atual != null) {
			System.out.print(atual);
			atual = atual.getProximo();
		}
	}

	// método insereNoMeio
    public void insereNoMeio(Produto produto, int posicao) {
        if (!isPosicaoValida(posicao)) return;

        No atual = inicio;
        int posicaoAtual = 0;

        while (posicaoAtual < posicao - 1) {
            atual = atual.getProximo();
            posicaoAtual++;
        }

        No novoNo = new No(produto);
        novoNo.setProximo(atual.getProximo());
        atual.setProximo(novoNo);
    }

	// método insereNoFim
    public void insereNoFim(Produto produto) {
        No novo = new No(produto);
	    if (this.getInicio() == null) {
	        setInicio(novo);
	        return;
        }

        No atual = this.getInicio();
	    while (atual.getProximo() != null) {
            atual = atual.getProximo();
        }

	    atual.setProximo(novo);
    }

	// método buscarPorPosicao
    public No buscarPorPosicao(int posicao) {
	    if (this.getInicio() == null || !isPosicaoValida(posicao)) return null;

        No atual = this.getInicio();

        for (int i = 0; i < posicao; i++) {
            atual = atual.getProximo();
        }

        return atual;
    }

	// método buscarPorNome WIP
    public int buscarPorNome(String nome) {
        No atual = this.getInicio();
        int posicao = 0;

        while (atual.getProximo() != null) {
            if(atual.getproduto().getNome().equals(nome)) {
                return posicao;
            }

            posicao++;
            atual = atual.getProximo();
        }

        return -1;
    }

	// método remove
    public void remove(String nome) {
	    if (this.getInicio() == null) return;
	    if (this.getInicio().getproduto().getNome().equals(nome)) {
	        this.setInicio(this.getInicio().getProximo());
	        return;
        }

	    No atual = this.getInicio();

        while (atual.getProximo() != null) {
            if (atual.getProximo().getproduto().getNome().equals(nome)) {
                atual.setProximo(atual.getProximo().getProximo());
                return;
            }

            atual = atual.getProximo();
        }
    }

	// método removePrimeiro
    public void removePrimeiro() {
        if (this.getInicio() == null) return;
        if (this.getInicio().getProximo() != null) {
            this.setInicio(this.getInicio().getProximo());
        } else {
            this.setInicio(null);
        }
    }

	private boolean isPosicaoValida(int posicao) {
        if (posicao >= this.getTamanho()) {
            System.out.println("Posição inválida");
            return false;
        }

        return true;
    }
}
