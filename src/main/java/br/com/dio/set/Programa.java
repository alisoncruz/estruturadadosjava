package br.com.dio.set;

import br.com.dio.equalshashcode.Carro;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Programa {

    public static void main(String[] args) {

        Set<Carro> hashSetCarro = new TreeSet<>();

        hashSetCarro.add(new Carro("Ford"));
        hashSetCarro.add(new Carro("Chevrolet"));
        hashSetCarro.add(new Carro("Fiat"));
        hashSetCarro.add(new Carro("Peugeot"));
        hashSetCarro.add(new Carro("Zup"));
        hashSetCarro.add(new Carro("Alfa Romeo"));

        System.out.println(hashSetCarro);
    }
}
