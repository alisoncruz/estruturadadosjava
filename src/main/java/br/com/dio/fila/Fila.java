package br.com.dio.fila;

public class Fila<T> {

    private Noh<T> refEntradaFila;

    public Fila() {
        this.refEntradaFila = null;
    }

    public boolean isEmpty() {
        if (refEntradaFila == null) return true;
        return false;
    }

    public void queue(T noh) {
        Noh novoNoh = new Noh(noh);
        novoNoh.setRefNoh(refEntradaFila);
        refEntradaFila = novoNoh;
    }

    public T first() {
        if (isEmpty()) return null;
        Noh first = refEntradaFila;
        while (true) {
            if (first.getRefNoh() == null) break;
            first = first.getRefNoh();
        }
        return (T) first.getObject();
    }

    public T dequeue() {
        if (isEmpty()) return null;
        Noh nohAux = refEntradaFila;
        Noh primeiroNoh = refEntradaFila;

        while (true) {
            if (primeiroNoh.getRefNoh() == null) {
                nohAux.setRefNoh(null);
                return (T) primeiroNoh.getObject();
            }
            nohAux = primeiroNoh;
            primeiroNoh = primeiroNoh.getRefNoh();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Noh nohAux = refEntradaFila;
        while (true) {
            if (nohAux == null) break;
            sb.append(nohAux);
            if (nohAux.getRefNoh() == null) break;
            nohAux = nohAux.getRefNoh();
            sb.append("---->");
        }
        return sb.toString();
    }
}
