package controller;

import util.Teclado;

import static controller.ex_05.getValidGrade;

public class ex_02 {

    public static void main(String[] args) {
        int n = Teclado.lerInt("Digite quantas notas quer inserir");
        int i = 0;

        double average = 0;
        double highest = 0;
        int approved = 0;

        while (i < n) {
            System.out.println("Digite o " + (i + 1) + "º numero: ");
            double j = getValidGrade();

            // Aumenta a média, para ser dividia por n posteriormente
            average = average + j;

            // Se o numero atual é maior do que o maior já definido, define este como o maior
            if (j > highest) { highest = j; }

            // Se o numero é maior do que 7, aumenta o numeor de aprovados
            if (j >= 7) { approved++; }

            i++;
        }

        System.out.println("A média da turma é: " + (average / n));
        System.out.println("A nota mais alta foi: " + highest);
        System.out.println("Alunos aprovados: " + approved);
    }
}
