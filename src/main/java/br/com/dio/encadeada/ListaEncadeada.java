package br.com.dio.encadeada;

public class ListaEncadeada<T> {

    Noh<T> referenciaEntrada;

    public ListaEncadeada() {
        referenciaEntrada = null;
    }

    public boolean isEmpty() {
        if (referenciaEntrada == null) return true;
        return false;
    }

    public int size() {
        int tamanhoLista = 0;
        Noh<T> referenciaAux = referenciaEntrada;
        while (referenciaAux != null) {
            tamanhoLista++;
            referenciaAux = referenciaAux.getProximoNoh();
        }
        return tamanhoLista;
    }

    public void add(T conteudo) {
        Noh novoNoh = new Noh(conteudo);
        if (this.isEmpty()) {
            referenciaEntrada = novoNoh;
            return;
        }
        Noh<T> noAuxiliar = referenciaEntrada;
        for (int i = 0; i < this.size()-1; i++) {
            noAuxiliar = noAuxiliar.getProximoNoh();
        }
        noAuxiliar.setProximoNoh(novoNoh);
    }

    private void validaIndice(int index) {
        if (index >= size()) {
            int ultimoIndice = size() - 1;
            throw new IndexOutOfBoundsException("Não existe conteúdo no índice " + index + " desta lista" +
                    "esta lista vai até o índice " + ultimoIndice);
        }
    }

    private Noh<T> getNoh(int index) {

        validaIndice(index);

        Noh<T> nohAuxiliar = referenciaEntrada;
        Noh<T> nohRetorno = null;
        for (int i = 0; i <= index; i++) {
            nohRetorno = nohAuxiliar;
            nohAuxiliar = nohAuxiliar.getProximoNoh();
        }
        return nohRetorno;
    }

    public T get(int index) {
        return getNoh(index).getConteudo();
    }

    public T remove(int index) {
        Noh<T> noPivot = this.getNoh(index);
        if (index == 0) {
            referenciaEntrada = noPivot.getProximoNoh();
            return noPivot.getConteudo();
        }
        Noh<T> noAnterior = getNoh(index - 1);
        noAnterior.setProximoNoh(noPivot.getProximoNoh());
        return noPivot.getConteudo();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Noh<T> nohAux = referenciaEntrada;
        while (nohAux != null) {
            sb.append(nohAux);
            nohAux = nohAux.getProximoNoh();
            if (nohAux != null) sb.append(" ---> ");
        }
        return sb.toString();
    }

}
