package src;

public class Main {

    public static void main(String[] args) {

        long timeNow = System.currentTimeMillis();
        // System.out.println(timeNow);
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
        for (int i = 0; i < 10; i++) {
            // vetor.adicionar(i);
            // System.out.println(i);
            lista.adicionar(i);
        }

        lista.remover(2);

        System.out.println(lista);

        long after = System.currentTimeMillis();
        // System.out.println(after);
        // System.out.println(after - timeNow);
    }

}