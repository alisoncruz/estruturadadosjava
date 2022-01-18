package br.com.dio.listacircular;

public class ListaCircular<T> {

    private Noh<T> cabeca;
    private Noh<T> cauda;
    private int tamanhoLista;

    public ListaCircular() {
        this.cauda = null;
        this.cabeca = null;
        this.tamanhoLista = 0;
    }

    public int size() {
        return this.tamanhoLista;
    }

    public void add(T conteudo) {
        Noh<T> novoNoh = new Noh<>(conteudo);

        if (this.isEmpty()) {
            this.cabeca = novoNoh;
            this.cauda = this.cabeca;
            this.cabeca.setProximoNoh(cauda);
        } else {
            novoNoh.setProximoNoh(this.cauda);
            this.cabeca.setProximoNoh(novoNoh);
            this.cauda = novoNoh;
        }
        this.tamanhoLista++;
    }

    public boolean isEmpty() {
        if (this.tamanhoLista == 0) return true;
        return false;
    }

    private Noh<T> getNoh(int index) {
        if (this.isEmpty()) {
            throw new IndexOutOfBoundsException("A lista está vazia!");
        }
        if (index == 0) {
            return this.cauda;
        }

        Noh<T> nohAuxiliar = this.cauda;

        for (int i = 0; (i < index) && (nohAuxiliar != null); i++) {
            nohAuxiliar = nohAuxiliar.getProximoNoh();
        }
        return nohAuxiliar;
    }

    public T get(int index) {
        return this.getNoh(index).getConteudo();
    }

    public void remove(int index) {
        if (index >= this.tamanhoLista) {
            throw new IndexOutOfBoundsException("O índice não corresponde a uma posição válida");
        }
        Noh<T> nohAuxiliar = cauda;

        if (index == 0) {
            if (this.size() == 1) {
                this.cabeca = null;
                this.cauda = null;
            } else {
                cauda = this.cauda.getProximoNoh();
                this.cabeca.setProximoNoh(this.cauda);
            }

        } else if (index == 1) {
            this.cauda.setProximoNoh(this.cauda.getProximoNoh().getProximoNoh());
        } else {
            for (int i = 0; i < index - 1; i++) {
                nohAuxiliar = nohAuxiliar.getProximoNoh();
            }
            nohAuxiliar.setProximoNoh(nohAuxiliar.getProximoNoh().getProximoNoh());
        }
        this.tamanhoLista--;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Noh<T> nohAux = this.cauda;

        if (this.isEmpty()) {
            sb.append("[Lista vazia]");
            return sb.toString();
        }
        while (true) {
            sb.append(nohAux + "---->");
            nohAux = nohAux.getProximoNoh();
            if (nohAux == cauda) {
                sb.append(" (retorna ao início)");
                break;
            }
        }
        return sb.toString();
    }

}
