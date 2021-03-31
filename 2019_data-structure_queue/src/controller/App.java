package controller;

import model.Queue;

public class App {

    /**
     * Alunos:
     * - Rodrigo Mesquita, 2018201046
     * - Diogo Raphael, 2018201581
     * - Gabriel Salvador, 2018201575
     */

    public static void main(String[] args) {
        Queue queue = new Queue();

        for (int i = 1; i <= 50; i++) {
            queue.push("Usuário número " + i);
        }

        System.out.println(queue.toString());
        System.out.println(queue.next());

        for (int i = 0; i < 50; i++) {
            queue.pop();
        }

        System.out.println(queue.toString());
        System.out.println(queue.next());
    }
}
