package model;

public class Stack {

    private int limit, top;
    private int[] data;

    public Stack(int limit) {
        this.limit = limit;
        this.data = new int[this.limit];
        this.top = -1;
    }

    public void push(int number) {
        if (this.isFull()) {
            System.out.println("A pilha está cheia! Não há como adicionar elementos.");
            return;
        }

        this.top++;
        this.data[this.top] = number;
    }

    public Integer pop() {
        if (this.isEmpty()) {
            System.out.println("A pilha está vazia! Não há nada para remover.");
            return null;
        };

        int local = this.data[this.top];
        this.top--;

        return local;
    }

    public Integer pull() {
        return this.data[this.top];
    }

    public boolean isFull() {
        return this.top >= this.limit - 1;
    }

    public boolean isEmpty() {
        return this.top == -1;
    }

    @Override
    public String toString() {
        if (this.isEmpty()) {
            return "A pilha está vazia!";
        }

        StringBuilder output = new StringBuilder();

        for (int i = 0; i <= this.top; i++) {
            output.append(this.data[i]);

            if (i != this.top) {
                output.append(", ");
            }
        }

        return output.toString();
    }
}
