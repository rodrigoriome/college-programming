package model;

import java.util.List;

import util.Teclado;

public class Turma {
    private boolean ativa;
    private int numeroTurma;
    private String nomeCurso;
    private String turno;
    private List<Aluno> alunos;

    public Turma() {
        super();
    }

    public Turma(int numeroTurma, String nomeCurso, String turno, List<Aluno> alunos) {
        super();
        this.ativa = false;
        this.numeroTurma = numeroTurma;
        this.nomeCurso = nomeCurso;
        this.turno = turno;
        this.alunos = alunos;
    }

    public Turma(int numeroTurma, String nomeCurso, String turno) {
        super();
        this.ativa = false;
        this.numeroTurma = numeroTurma;
        this.nomeCurso = nomeCurso;
        this.turno = turno;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getNumeroTurma() {
        return numeroTurma;
    }

    public void setNumeroTurma(int numeroTurma) {
        this.numeroTurma = numeroTurma;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Turma criarTurma() {
        System.out.println("Criar Turma");

        int numeroTurma = Teclado.lerInt("Digite o número da turma: ");
        String nomeCurso = Teclado.lerTexto("Digite o nome do curso: ");
        String turno = Teclado.lerTexto("Digite o turno: ");

        Turma objetoTurma = new Turma(numeroTurma, nomeCurso, turno);
        this.ativa = true;
        System.out.println("Turma " + numeroTurma + " cadastrada com sucesso");

        return objetoTurma;
    }
}
