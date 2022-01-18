package br.com.dio.listacircular;

public class Noh<T> {

    private T conteudo;
    private Noh<T> proximoNoh;

    public Noh(T conteudo) {
        this.proximoNoh = null;
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
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
