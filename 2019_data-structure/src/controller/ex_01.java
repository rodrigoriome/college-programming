package controller;

import util.Teclado;

public class ex_01 {

    public static void main(String[] args) {
        double radius = Teclado.lerDouble("Digite o raio da pista (metros)");
        double distance = Teclado.lerDouble("Digite a distância percorrida (metros)");

        System.out.println("Voltas dadas: " + distance / getCircunference(radius));
    }

    public static double getCircunference(double radius) {
        return 2 * 3.14 * radius;
    }
}
