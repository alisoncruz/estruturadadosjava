package br.com.dio.stack;

import br.com.dio.equalshashcode.Carro;

import java.util.Stack;

public class Programa {

    public static void main(String []args){
        Stack<Carro> stackCarros = new Stack<>();

        stackCarros.push(new Carro("Ford"));
        stackCarros.push(new Carro("Chevrolet"));
        stackCarros.push(new Carro("Fiat"));

        System.out.println(stackCarros);
        System.out.println(stackCarros.pop());
        System.out.println(stackCarros);

        System.out.println(stackCarros.peek());
        System.out.println(stackCarros);
    }
}
