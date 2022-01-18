package br.com.dio.equalshashcode;

import java.util.ArrayList;
import java.util.List;

public class Programa {
    public static void main(String[] args) {
        List<Carro> listaCarros = new ArrayList<>();
        listaCarros.add(new Carro("Wolkswagen"));
        listaCarros.add(new Carro("Chevrolet"));
        listaCarros.add(new Carro("Ford"));

        System.out.println(listaCarros.contains(new Carro("Ford")));
    Carro carro1 = new Carro("Ford");
    Carro carro2 = new Carro("Chevrolet");

        System.out.println(carro1.equals(carro2));
    }
}
