package br.com.dio.duplamenteencadeada;

public class ListaDuplamenteEncadeada<T> {

    private Noh<T> primeiroNoh;
    private Noh<T> ultimoNoh;

    public ListaDuplamenteEncadeada() {
        tamanhoLista = 0;
        primeiroNoh = null;
        ultimoNoh = null;
    }

    private int tamanhoLista;

    public int size() {
        return tamanhoLista;
    }

    private Noh<T> getNoh(int indice) {
        Noh<T> nohAux = primeiroNoh;

        for (int i = 0; (i < indice) && (nohAux != null); i++) {
            nohAux = nohAux.getProximoNoh();
        }

        return nohAux;
    }

    public T get(int index) {
        return this.getNoh(index).getConteudo();
    }

    public void add(T elemento) {
        Noh<T> novoNoh = new Noh<>(elemento);
        novoNoh.setProximoNoh(null);
        novoNoh.setNohAnterior(ultimoNoh);

        if (primeiroNoh == null)
            primeiroNoh = novoNoh;

        if (ultimoNoh != null)
            ultimoNoh.setProximoNoh(novoNoh);

        ultimoNoh = novoNoh;
        tamanhoLista++;
    }

    public void add(int indice, T elemento) {
        Noh<T> nohAux = getNoh(indice);
        Noh<T> novoNoh = new Noh<>(elemento);
        novoNoh.setProximoNoh(nohAux);

        if (novoNoh.getProximoNoh() != null) {
            novoNoh.setNohAnterior(nohAux.getNohAnterior());
            novoNoh.getProximoNoh().setNohAnterior(novoNoh);
        } else {
            novoNoh.setNohAnterior(ultimoNoh);
            ultimoNoh = novoNoh;
        }

        if (indice == 0) {
            primeiroNoh = novoNoh;
        } else {
            novoNoh.getNohAnterior().setProximoNoh(novoNoh);
        }

        tamanhoLista++;
    }

    public void remove(int index) {

        if (index == 0) {
            primeiroNoh = primeiroNoh.getProximoNoh();
            if (primeiroNoh != null) {
                primeiroNoh.setNohAnterior(null);
            }
        } else {
            Noh<T> nohAux = getNoh(index);
            nohAux.getNohAnterior().setProximoNoh(nohAux.getProximoNoh());
            if (nohAux != ultimoNoh) {
                nohAux.getProximoNoh().setNohAnterior(nohAux.getNohAnterior());
            } else {
                ultimoNoh = nohAux;
            }
        }
        tamanhoLista--;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Noh<T> nohAux;
        nohAux = primeiroNoh;
        while (nohAux != null) {
            sb.append(nohAux);
            nohAux = nohAux.getProximoNoh();
            if (nohAux != null) sb.append("---->");
        }
        return sb.toString();
    }
}
