package br.com.dio.arvore;

public class NohArvore<T extends Comparable<T>> {

    private T conteudo;
    private NohArvore<T> nohEsquerda;
    private NohArvore<T> nohDireita;

    public NohArvore(T conteudo) {
        this.conteudo = conteudo;
        this.nohEsquerda = null;
        this.nohDireita = null;
    }

    public NohArvore() {
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NohArvore<T> getNohEsquerda() {
        return nohEsquerda;
    }

    public void setNohEsquerda(NohArvore<T> nohEsquerda) {
        this.nohEsquerda = nohEsquerda;
    }

    public NohArvore<T> getNohDireita() {
        return nohDireita;
    }

    public void setNohDireita(NohArvore<T> nohDireita) {
        this.nohDireita = nohDireita;
    }

    @Override
    public String toString() {
        return "NohArvore{" +
                "conteudo=" + conteudo +
                '}';
    }
}
