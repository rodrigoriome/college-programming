package controller;

import model.Stack;

public class App {

    /**
     * Alunos:
     * - Rodrigo Mesquita, 2018201046
     * - Diogo Raphael, 2018201581
     * - Gabriel Salvador, 2018201575
     */

    public static void main(String[] args) {
        Stack stack = new Stack(50);

        for (int i = 0; i < 55; i++) {
            stack.push(i);
        }

        System.out.println(stack.toString());

        for (int i = 0; i < 55; i++) {
            stack.pop();
        }

        System.out.println(stack.toString());
    }
}
