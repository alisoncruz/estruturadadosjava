package br.com.dio.arvore;

public class ArvoreBinaria<T extends Comparable<T>> {

    private NohArvore<T> raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public void inserir(T conteudo) {
        NohArvore<T> novoNoh = new NohArvore<>(conteudo);
        raiz = inserir(raiz, novoNoh);
    }

    private NohArvore<T> inserir(NohArvore<T> atual, NohArvore<T> novoNoh) {
        if (atual == null) {
            return novoNoh;
        } else if (novoNoh.getConteudo().compareTo(atual.getConteudo()) < 0) {
            atual.setNohEsquerda(inserir(atual.getNohEsquerda(), novoNoh));
        } else {
            atual.setNohDireita(inserir(atual.getNohDireita(), novoNoh));
        }
        return atual;
    }

    public void exibirEmOrden() {
        System.out.println("\nExibindo em ordem");
        exibirEmOrden(this.raiz);
    }

    private void exibirEmOrden(NohArvore<T> atual) {
        if (atual != null) {
            exibirEmOrden(atual.getNohEsquerda());
            System.out.print(atual.getConteudo() + ", ");
            exibirEmOrden(atual.getNohDireita());
        }
    }

    public void exibirPosOrdem() {
        System.out.println("\nExibindo PosOrdem");
        exibirPosOrdem(this.raiz);
    }

    private void exibirPosOrdem(NohArvore<T> atual) {
        if (atual != null) {
            exibirPosOrdem(atual.getNohEsquerda());
            exibirPosOrdem(atual.getNohDireita());
            System.out.print(atual.getConteudo() + ", ");
        }
    }

    public void exibirPreOrdem() {
        System.out.println("\nExibindo Pre Ordem");
        exibirPreOrdem(this.raiz);
    }

    private void exibirPreOrdem(NohArvore<T> atual) {
        if (atual != null) {
            System.out.print(atual.getConteudo() + ", ");
            exibirPreOrdem(atual.getNohEsquerda());
            exibirPreOrdem(atual.getNohDireita());
        }
    }

    public void remover(T conteudo) {
        try {
            NohArvore<T> atual = this.raiz;
            NohArvore<T> pai = null;
            NohArvore<T> filho = null;
            NohArvore<T> temp = null;

            while (atual != null && !atual.getConteudo().equals(conteudo)) {
                pai = atual;
                if (conteudo.compareTo(atual.getConteudo()) < 0) {
                    atual = atual.getNohEsquerda();
                } else {
                    atual = atual.getNohDireita();
                }
            }

            if (atual == null) {
                System.out.println("Conteudo nao encontrado");
            }

            if (pai == null) {
                if (atual.getNohDireita() == null) {
                    this.raiz = atual.getNohEsquerda();
                } else if (atual.getNohEsquerda() == null) {
                    this.raiz = atual.getNohDireita();
                } else {

                    for (temp = atual, filho = atual.getNohEsquerda();
                         filho.getNohDireita() != null;
                         temp = filho, filho = filho.getNohEsquerda()) {

                        if (filho != atual.getNohEsquerda()) {
                            temp.setNohDireita(filho.getNohEsquerda());
                            filho.setNohEsquerda(raiz.getNohEsquerda());
                        }
                        filho.setNohDireita(raiz.getNohDireita());
                        raiz = filho;
                    }
                }
            } else if (atual.getNohDireita() == null) {
                if (pai.getNohEsquerda() == atual) {
                    pai.setNohEsquerda(atual.getNohEsquerda());
                } else {
                    pai.setNohDireita((atual.getNohEsquerda()));
                }

            } else if (atual.getNohEsquerda() == null) {
                if (pai.getNohEsquerda() == atual) {
                    pai.setNohEsquerda(atual.getNohDireita());
                } else {
                    pai.setNohDireita((atual.getNohDireita()));
                }
            } else {

                for (temp = atual, filho = atual.getNohEsquerda();
                     filho.getNohDireita() != null;
                     temp = filho, filho = filho.getNohDireita()) {

                    if (filho != atual.getNohEsquerda()) {
                        temp.setNohDireita(filho.getNohEsquerda());
                        filho.setNohEsquerda(atual.getNohEsquerda());
                    }

                    filho.setNohDireita(atual.getNohDireita());

                    if (pai.getNohEsquerda() == atual) {
                        pai.setNohEsquerda(filho);
                    } else {
                        pai.setNohDireita(filho);
                    }

                }
            }

        } catch (NullPointerException erro) {
            System.out.println("Conteudo não encontrado");
        }
    }

//    public void remover(T conteudo){
//        try{
//            NohArvore<T> atual = this.raiz;
//            NohArvore<T> pai = null;
//            NohArvore<T> filho = null;
//            NohArvore<T> temp = null;
//
//            while (atual != null && !atual.getConteudo().equals(conteudo)){
//                pai = atual;
//                if(conteudo.compareTo(atual.getConteudo()) < 0){
//                    atual = atual.getNohEsquerda();
//                }else {
//                    atual = atual.getNohDireita();
//                }
//            }
//
//            if(atual == null){
//                System.out.println("Conteudo nao encontrado. Bloco Try");
//            }
//
//            if(pai == null){
//                if(atual.getNohDireita() == null){
//                    this.raiz = atual.getNohEsquerda();
//                }else if(atual.getNohEsquerda() == null){
//                    this.raiz = atual.getNohDireita();
//                }else {
//                    for(temp = atual, filho = atual.getNohEsquerda();
//                        filho.getNohDireita() != null;
//                        temp = filho, filho = filho.getNohEsquerda()
//                    ){
//                        if(filho != atual.getNohEsquerda()){
//                            temp.setNohDireita(filho.getNohEsquerda());
//                            filho.setNohEsquerda(raiz.getNohEsquerda());
//                        }
//                    }
//                    filho.setNohDireita(raiz.getNohDireita());
//                    raiz = filho;
//                }
//            }else if(atual.getNohDireita() == null){
//                if(pai.getNohEsquerda() == atual){
//                    pai.setNohEsquerda(atual.getNohEsquerda());
//                }else {
//                    pai.setNohDireita(atual.getNohEsquerda());
//                }
//            }else if(atual.getNohEsquerda() == null){
//                if(pai.getNohEsquerda() == atual){
//                    pai.setNohEsquerda(atual.getNohDireita());
//                }else {
//                    pai.setNohDireita(atual.getNohDireita());
//                }
//            }else{
//                for(
//                        temp = atual, filho = atual.getNohEsquerda();
//                        filho.getNohDireita() != null;
//                        temp = filho, filho = filho.getNohDireita()
//                ){
//                    if(filho != atual.getNohEsquerda()){
//                        temp.setNohDireita(filho.getNohEsquerda());
//                        filho.setNohEsquerda(atual.getNohEsquerda());
//                    }
//                    filho.setNohDireita(atual.getNohDireita());
//                    if(pai.getNohEsquerda() == atual){
//                        pai.setNohEsquerda(filho);
//                    }else{
//                        pai.setNohDireita(filho);
//                    }
//                }
//            }
//        }catch (NullPointerException erro){
//            System.out.println("Conteudo nao encontrado. Bloco Catch");
//        }
//    }

}
