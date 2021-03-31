package controller;

public class TestCapacity {
    public static void main(String[] args) {
        NamesList names = new NamesList();

        for (int i = 0; i < 200; i++) {
            String newName = "User " + i;
            System.out.print("Capacidade: " + names.getStorageCapacity() + " - ");
            System.out.print("Ponteiro: " + names.getPointer() + " - ");
            System.out.println(newName);

            if (i > 100) {
                names.softInsert(i, newName);
            } else {
                names.push(newName);
            }
        }
    }
}
