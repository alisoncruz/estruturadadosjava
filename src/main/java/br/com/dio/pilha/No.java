package br.com.dio.pilha;

public class No {

    private int dado;
    private No proximoNo = null;

    public No(int dado) {
        this.dado = dado;
    }

    public No() {

    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public No getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "dado=" + dado +
                '}';
    }
}
