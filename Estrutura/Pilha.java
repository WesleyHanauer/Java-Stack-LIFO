package Estrutura;

public class Pilha<T> extends EstruturaBasica<T>{
    public Pilha(int capacidade) {
        super(capacidade);
    }

    public void empilhar(T elemento){
        adiciona(elemento);
    }

    public T desempilhar(){
        return remove(tamanho()-1);
    }

    public T topo(){
        return obterElemento(tamanho()-1);
    }
}
