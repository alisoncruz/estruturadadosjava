package br.com.dio.arvore;

import br.com.dio.arvore.model.Obj;

public class Programa {

    public static void main(String[] args) {
        ArvoreBinaria<Obj> arvore = new ArvoreBinaria<>();

        arvore.inserir(new Obj(13));
        arvore.inserir(new Obj(10));
        arvore.inserir(new Obj(25));
        arvore.inserir(new Obj(2));
        arvore.inserir(new Obj(12));
        arvore.inserir(new Obj(20));
        arvore.inserir(new Obj(31));
        arvore.inserir(new Obj(29));

//        arvore.exibirEmOrden();
//        arvore.exibirPosOrdem();
//        arvore.exibirPreOrdem();
//
//        arvore.inserir(new Obj(32));
//        arvore.exibirEmOrden();

        arvore.exibirEmOrden();
        arvore.remover(new Obj(13));
        arvore.exibirEmOrden();
    }
}
