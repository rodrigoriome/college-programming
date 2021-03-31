package controller;

import util.Teclado;

public class ex_03 {

    public static void main(String[] args) {
        int read = Teclado.lerInt("Digite um número inteiro:");

        System.out.println("Os números primos de 0 a " + read + " são:");

        if (read < 2) {
            System.out.println("Nenhum");
        } else {
            for (int i = 0; i < read; i++ ) {
                if (isPrime(i)) {
                    System.out.println(i);
                }
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n < 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
