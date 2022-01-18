package br.com.dio.duplamenteencadeada;

public class Noh<T> {

    private T conteudo;
    private Noh<T> nohAnterior;
    private Noh<T> proximoNoh;

    public Noh() {
    }

    public Noh(T conteudo) {
        this.conteudo = conteudo;
        this.nohAnterior = null;
        this.proximoNoh = null;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public Noh<T> getNohAnterior() {
        return nohAnterior;
    }

    public void setNohAnterior(Noh<T> nohAnterior) {
        this.nohAnterior = nohAnterior;
    }

    public Noh<T> getProximoNoh() {
        return proximoNoh;
    }

    public void setProximoNoh(Noh<T> proximoNoh) {
        this.proximoNoh = proximoNoh;
    }

    @Override
    public String toString() {
        return "Noh{" +
                "conteudo=" + conteudo +
                '}';
    }
}
