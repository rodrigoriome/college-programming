package controller;

import java.util.List;
import java.util.ArrayList;

import model.Aluno;
import model.Turma;
import util.Teclado;

public class Cadastro {
    public static void main(String[] args) {
        Turma turma = new Turma();
        Aluno aluno = new Aluno();
        List<Aluno> alunosCadastratos = new ArrayList<Aluno>();

        int opcao = getOpcao();

        while (opcao != 4) {
            switch (opcao) {
            case 1:
                turma = turma.criarTurma();
                break;
            case 2:
                aluno = aluno.cadastrarAluno();
                alunosCadastratos.add(aluno);
                break;
            case 3:
                if (turma.isAtiva()) {
                    System.out.println("Turma: " + turma.getNumeroTurma());
                    System.out.println("Nome do curso: " + turma.getNomeCurso());
                    System.out.println("Turno: " + turma.getTurno());
                } else {
                    System.out.println("Por favor, crie uma turma.");
                }

                break;
            default:
                System.out.println("Opção inválida! Tente novamente.");
            }

            opcao = getOpcao();
        }

        turma.setAlunos(alunosCadastratos);
    }

    public static int menuOpcoes() {
        System.out.println("----- MENU DE OPÇÕES -----");
        System.out.println("- 1 - Cadastrar Turma");
        System.out.println("- 2 - Cadastrar Aluno");
        System.out.println("- 3 - Exibir Turma");
        System.out.println("- 4 - Sair");

        int selecao = Teclado.lerInt("Digite uma opção: ");

        return selecao;
    }

    public static int getOpcao() {
        int opcao = 0;

        try {
            opcao = menuOpcoes();
        } catch (NumberFormatException nfe) {
            System.out.println("Por favor, digite apenas números inteiros!");
            getOpcao();
        }

        return opcao;
    }
}
