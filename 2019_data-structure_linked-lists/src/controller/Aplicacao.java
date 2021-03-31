package controller;

import util.Teclado;

public class Aplicacao {

    /**
     * Alunos:
     * - Rodrigo Mesquita, 2018201046
     * - Diogo Raphael, 2018201581
     * - Gabriel Salvador, 2018201575
     */

    public static ListaEncadeada le = new ListaEncadeada();

	public static void main(String[] args) {
        impriveDiv();
        System.out.println("Programa Iniciado!");
        impriveDiv();
        escutaUsuario();
	}

    public static void impriveDiv() {
        System.out.println("------------------------------");
    }

    public static void imprimeMenu() {
        System.out.println("Menu de operações:");
        System.out.println("1 - Listar os Produtos");
        System.out.println("2 - Inserir um Produto no Início da Lista");
        System.out.println("3 - Inserir um Produto no Meio da Lista");
        System.out.println("4 - Inserir um Produto no Fim da Lista");
        System.out.println("5 - Buscar um Produto por Posição");
        System.out.println("6 - Buscar um Produto por Nome");
        System.out.println("7 - Remover um produto");
        System.out.println("8 - Remover Primeiro Produto da Lista");
        System.out.println("9 - Quantidade de Produtos");
        System.out.println("0 - Encerrar Programa");
    }

    public static void imprimeLista() {
        System.out.print("Lista: ");
        le.listar();
        System.out.println("");
    }

    public static void escutaUsuario() {
	    imprimeMenu();
	    int entrada = Teclado.lerInt("Digite o código da operação desejada:");

        switch (entrada) {
            case 1:
            {
                imprimeLista();
            }
            break;

            case 2:
            {
                Produto novoProduto = lerProduto();
                le.insereNoInicio(novoProduto);
            }
            break;

            case 3:
            {
                Produto novoProduto = lerProduto();
                int posicao = Teclado.lerInt("Digite a posição em que o produto será inserido:");
                le.insereNoMeio(novoProduto, posicao);
            }
            break;

            case 4:
            {
                Produto novoProduto = lerProduto();
                le.insereNoFim(novoProduto);
            }
            break;

            case 5:
            {
                int posicao = Teclado.lerInt("Digite o código do produto desejado:");
                No noDaPosicao = le.buscarPorPosicao(posicao);

                if (noDaPosicao == null) {
                    System.out.println("Não há produtos nessa posição!");
                } else {
                    System.out.println(noDaPosicao.getproduto().toString());
                }
            }
            break;

            case 6:
            {
                String nome = Teclado.lerTexto("Digite o nome do produto desejado:");
                int posicao = le.buscarPorNome(nome);

                if (posicao == -1) {
                    System.out.println(nome + " não está na lista");
                } else {
                    System.out.println(nome + " está na posição " + posicao);
                }
            }
            break;

            case 7:
            {
                String nome = Teclado.lerTexto("Digite o nome do produto a ser removido:");
                le.remove(nome);
            }
            break;

            case 8:
            {
                le.removePrimeiro();
            }
            break;

            case 9:
            {
                System.out.println("Atualmente existem " + le.getTamanho() + " produtos na lista.");
            }
            break;

            case 0:
                System.out.println("Programa Encerrado!");
                return;

            default:
                System.out.println("Operação inválida. Tente novamente!");
                break;
        }

        impriveDiv();
        imprimeLista();
        impriveDiv();

        escutaUsuario();
    }

    public static Produto lerProduto() {
        String nomeProduto = Teclado.lerTexto("Digite o nome do produto:");
        Produto novoProduto = new Produto(0, nomeProduto);

        return novoProduto;
    }
}
