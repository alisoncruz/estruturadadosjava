package br.com.dio.fila;

public class Programa {
    public static void main(String[] args) {
        Fila<String> fila = new Fila();

        fila.queue("primeiro");
        fila.queue("segundo");
        fila.queue("terceiro");
        fila.queue("quarto");
        fila.queue("quinto");

        System.out.println(fila);

        System.out.println(fila.dequeue());
        System.out.println(fila);
    }
}
