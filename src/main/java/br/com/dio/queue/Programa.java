package br.com.dio.queue;

import br.com.dio.equalshashcode.Carro;

import java.util.LinkedList;
import java.util.Queue;

public class Programa {

    public static void main(String[] args) {
        Queue<Carro> queueCarros = new LinkedList<>();
        queueCarros.add(new Carro("Ford"));
        queueCarros.add(new Carro("Chevrolet"));
        queueCarros.add(new Carro("Fiat"));

        System.out.println(queueCarros);
        System.out.println(queueCarros.add(new Carro("Peugeot")));
        System.out.println(queueCarros);

        System.out.println(queueCarros.offer(new Carro("Renault")));
        System.out.println(queueCarros);

        System.out.println(queueCarros.peek());
        System.out.println(queueCarros);

        System.out.println(queueCarros.poll());
        System.out.println(queueCarros);

        System.out.println(queueCarros.isEmpty());

        System.out.println(queueCarros.size());
    }
}
