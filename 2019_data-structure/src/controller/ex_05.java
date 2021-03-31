package controller;

import util.Teclado;

public class ex_05 {

    public static double getValidGrade() {
        double grade = Teclado.lerDouble("");
        if (grade >= 0 && grade <= 10) return grade;
        System.out.print("Nota inválida! Tente novamente: ");

        return getValidGrade();
    }
}
