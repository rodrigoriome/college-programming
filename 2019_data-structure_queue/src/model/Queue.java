package model;

import java.util.LinkedList;

public class Queue {

    private LinkedList<String> names = new LinkedList<String>();

    public void push(String name) {
        this.names.addLast(name);
    }

    public void pop() {
        if (this.names.isEmpty()) {
            System.out.println("A lista está vazia. Não ha nada ser removido.");
            return;
        }

        this.names.removeFirst();
    }

    public String next() {
        if (this.names.isEmpty()) {
            return "A lista está vazia. Não ha retorno.";
        }

        return this.names.getFirst();
    }

    @Override
    public String toString() {
        if (this.names.isEmpty()) {
            return "A fila está vazia!";
        }

        StringBuilder output = new StringBuilder();

        for (int i = 0; i < this.names.size(); i++) {
            output.append(this.names.get(i));

            if (i != this.names.size()) {
                output.append(", ");
            }
        }

        return output.toString();
    }
}
