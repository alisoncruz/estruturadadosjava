package br.com.dio.pilha;

public class Pilha {

    private No noTopo;

    public Pilha() {
        noTopo = null;
    }

    public boolean isEmpty() {
        if (noTopo == null) return true;
        return false;
    }

    public No top() {
        return noTopo;
    }

    public void push(No novoNo) {
        No noAuxiliar = noTopo;
        noTopo = novoNo;
        noTopo.setProximoNo(noAuxiliar);
    }

    public No pop() {
        if (isEmpty()) {
            System.out.println("Pilha vazia!");
        }
        No poped = noTopo;
        noTopo = poped.getProximoNo();
        return poped;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("----------\n");
        No noAuxiliar = noTopo;
        while (true) {
            if (noAuxiliar == null) break;
            sb.append(noAuxiliar + "\n");
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        sb.append("----------");
        return sb.toString();
    }
}
