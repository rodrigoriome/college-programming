package controller;

import util.Teclado;

public class ex_06 {

    public static void main(String[] args) {
        int n = Teclado.lerInt("Digite o valor de n:");
        int p = Teclado.lerInt("Digite o valor de p:");
        if (n - p <= 0) {
            System.out.println("Não foi possível realizar esta conta. Por favor selecione outros valoes.");
            return;
        }
        int result = getFactorial(n) / getFactorial(p) * getFactorial(n - p);
        System.out.println("O resultado dessa conta é: " + result);
    }

    public static int getFactorial(int n) {
        try {
            if (n <= 0) {
                throw new Exception("Números menores ou iguais a zero não se aplicam ao cálculo fatorial");
            }
            int result = n;
            while (n > 1) {
                result = result * (n - 1);
                n--;
            }

            return result;
        } catch (Exception e) {
            System.out.println(e);
            return 0;
        }
    }
}
