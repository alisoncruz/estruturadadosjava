package br.com.dio.pilha;

public class Programa {

    public static void main(String[] args) {

        Pilha pilha = new Pilha();

        No no1 = new No(1);
        No no2 = new No(2);
        No no3 = new No(3);
        No no4 = new No(4);
        No no5 = new No(5);

        pilha.push(no1);
        pilha.push(no2);
        pilha.push(no3);
        pilha.push(no4);
        pilha.push(no5);


        System.out.println(pilha.toString());

        System.out.println(pilha.top());
        pilha.pop();

        System.out.println(pilha.toString());
        pilha.pop();
        pilha.pop();
        pilha.pop();

        System.out.println(pilha);


    }
}
