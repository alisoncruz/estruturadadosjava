package br.com.dio.encadeada;

public class Noh<T> {
    private T conteudo;
    private Noh proximoNoh;

    public Noh() {
    }

    public Noh(T conteudo) {
        this.conteudo = conteudo;
        this.proximoNoh = null;
    }

    public Noh(T conteudo, Noh proximo) {
        this.conteudo = conteudo;
        this.proximoNoh = proximo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public Noh getProximoNoh() {
        return proximoNoh;
    }

    public void setProximoNoh(Noh proximoNoh) {
        this.proximoNoh = proximoNoh;
    }

    @Override
    public String toString() {
        return "Noh{" +
                "conteudo=" + conteudo +
                '}';
    }

    public String toStringEncadeado() {
        StringBuilder sb = new StringBuilder();
        sb.append(toString());
        if (proximoNoh != null)
            sb.append("-->"+ proximoNoh);
        else
            sb.append("--> null");
        return sb.toString();
    }
}
