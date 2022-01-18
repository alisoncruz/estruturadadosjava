package br.com.dio.listacircular;

public class Programa {
    public static void main(String[] args) {
        ListaCircular<String> listaCircular = new ListaCircular<>();
        listaCircular.add("c0");

        System.out.println(listaCircular);

        listaCircular.remove(0);

        System.out.println(listaCircular);


        listaCircular.add("c0");
        listaCircular.add("c1");
        listaCircular.add("c2");
        listaCircular.add("c3");
        listaCircular.add("c4");


        System.out.println(listaCircular);

        System.out.println(listaCircular.get(0));
        System.out.println(listaCircular.get(1));
        System.out.println(listaCircular.get(2));
        System.out.println(listaCircular.get(3));
        System.out.println(listaCircular.get(4));

        System.out.println();

        for (int i = 0; i < 20; i++)
            System.out.println(listaCircular.get(i));

    }
}
