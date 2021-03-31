package controller;

/**
 * Alunos:
 * - Rodrigo Mesquita, 2018201046
 * - Diogo Raphael, 2018201581
 * - Gabriel Salvador, 2018201575
 */

public class NamesList {

    private String[] names;
    private int storageCapacity;
    private int pointer;

    public NamesList() {
        this.storageCapacity = 40;
        this.names = new String[storageCapacity];
        this.pointer = 0;
    }

    public int getStorageCapacity() {
        return this.storageCapacity;
    }

    public int getPointer() {
        return this.pointer;
    }

    public void prepareStorage() {
        if (this.pointer + 1 >= this.storageCapacity) this.increaseStorageCapacity();
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < this.pointer; i++) {
            s = s + this.names[i] + "\n";
        }

        return s;
    }

    // O(1)
    private boolean isValidPosition(int position) {
        return position >= 0 && position <= this.pointer;
    }

    // O(1)
    public void push(String name) {
        this.prepareStorage();
        this.names[this.pointer] = name;
        this.pointer++;
    }

    // O(1)
    public void hardInsert(int position, String name) {
        if (!this.isValidPosition(position)) return;
        this.prepareStorage();

        String aux = this.names[position];
        this.names[this.pointer] = aux;
        this.names[position] = name;
        this.pointer++;
    }

    // O(n)
    public void softInsert(int position, String name) {
        if (!this.isValidPosition(position)) return;
        this.prepareStorage();
        for (int i = this.pointer; i >= position; i--) {
            this.names[i + 1] = this.names[i];
        }

        this.names[position] = name;
        this.pointer++;
    }

    // O(1)
    void hardRemove(int position) {
        if (!this.isValidPosition(position)) return;

        this.names[position] = this.names[this.pointer - 1];
        this.names[this.pointer - 1] = null;
        this.pointer--;
    }

    // O(n)
    public void softRemove(int position) {
        if (!this.isValidPosition(position)) return;

        for (int i = position; i < this.pointer; i++) {
            this.names[i] = this.names[i + 1];
        }

        this.names[this.pointer] = null;
        this.pointer--;
    }

    // O(1)
    public String retrieve(int position) {
        if (this.isValidPosition(position)) {
            return this.names[position];
        }

        return null;
    }

    // O(n)
    public int getIdByName(String name) {
        for (int i = 0; i < pointer; i++) {
            if (names[i].equals(name)) {
                return i;
            }
        }

        return -1;
    }

    // O(n)
    public void increaseStorageCapacity() {
        String[] newNames = new String[this.storageCapacity * 2];
        for (int i = 0; i < this.names.length; i++) {
            newNames[i] = this.names[i];
        }

        this.names = newNames;
        this.storageCapacity = this.storageCapacity * 2;
    }
}
