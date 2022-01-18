package br.com.dio.fila;

public class Noh<T> {

    private T object;
    private Noh refNoh;

    public Noh(){

    }

    public Noh(T object){
        this.refNoh = null;
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public void setRefNoh(Noh refNoh) {
        this.refNoh = refNoh;
    }

    public Noh getRefNoh() {
        return refNoh;
    }

    @Override
    public String toString() {
        return "Noh{" +
                "object=" + object +
                '}';
    }
}
