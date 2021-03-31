package model;

import util.Teclado;

public class Aluno {
    private int matricula;
    private String nome;
    private String email;
    private String dataNascimento;

    public Aluno() {
        super();
    }

    public Aluno(int matricula, String nome, String email, String dataNascimento) {
        super();
        this.matricula = matricula;
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Aluno cadastrarAluno() {
        System.out.println("Cadastro de Aluno");

        int matricula = Teclado.lerInt("Digite a matrícula: ");
        String nome = Teclado.lerTexto("Digite o nome: ");
        String email = Teclado.lerTexto("Digite o e-mail: ");
        String dataNascimento = Teclado.lerTexto("Digite a data de nascimento: ");

        Aluno objetoAluno = new Aluno(matricula, nome, email, dataNascimento);
        System.out.println("Aluno(a) " + nome + " cadastrado(a) com sucesso");

        return objetoAluno;
    }
}
