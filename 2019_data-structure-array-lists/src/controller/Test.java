package controller;

public class Test {
    public static void main(String[] args) {
        NamesList nomes = new NamesList();

        System.out.println("Lista inicial");
        System.out.println("-----");
        System.out.println(nomes);

        System.out.println("Teste: `push`");
        System.out.println("-----");
        nomes.push("João da Silva");
        nomes.push("José dos Santos");
        nomes.push("Maria de Souza");
        nomes.push("Francisco Carvalho");
        System.out.println(nomes);

        System.out.println("Teste: `softInsert`");
        System.out.println("-----");
        nomes.softInsert(4, "Rodrigo Mesquita");
        System.out.println(nomes);

        System.out.println("Teste: `hardInsert`");
        System.out.println("-----");
        nomes.hardInsert(4, "Pablo Picasso");
        System.out.println(nomes);

        System.out.println("Teste: `retrieve`");
        System.out.println("-----");
        System.out.println(nomes.retrieve(4));

        System.out.println("Teste: `softRemove`");
        System.out.println("-----");
        nomes.softRemove(nomes.getIdByName("José dos Santos"));
        System.out.println(nomes);

        System.out.println("Teste: `hardRemove`");
        System.out.println("-----");
        nomes.hardRemove(1);
        System.out.println(nomes);
    }
}
