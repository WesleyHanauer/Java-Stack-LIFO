package Estrutura;

public class EstruturaBasica<T>{
    private T[] vetor;
    private int tamanho;

    public EstruturaBasica(int capacidade){
        vetor = (T[]) new Object[capacidade];
        tamanho = 0;
    }

    protected void adiciona(T elemento){
        aumentaCapacidade();
        vetor[tamanho] = elemento;
        tamanho++;
    }

    protected void adiciona(int posicao, T elemento){
        if(!(posicao>=0&&posicao<tamanho)){
            throw new IllegalArgumentException("Posição inválida.");
        }
        aumentaCapacidade();
        for(int i=tamanho-1;i>=posicao;i--){
            vetor[i+1]=vetor[i];
        }
        vetor[posicao]=elemento;
        tamanho++;
    }

    private void aumentaCapacidade(){
        if (tamanho==vetor.length){
            T[] vetorAux = (T[]) new Object[tamanho*2];
            for (int i=0;i<tamanho;i++){
                vetorAux[i]=vetor[i];
            }
            vetor=vetorAux;
        }
    }

    protected T obterElemento(int posicao){
        if(!(posicao>=0&&posicao<tamanho)){
            throw new IllegalArgumentException("Posição inválida.");
        }
        return vetor[posicao];
    }

    public int posicaoDe(T elemento){
        for(int i=0;i<tamanho;i++){
            if (vetor[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }

    protected T remove(int posicao){
        if(!(posicao>=0&&posicao<tamanho)){
            throw new IllegalArgumentException("Posição inválida.");
        }
        T copia = vetor[posicao];
        for (int i=posicao;i<tamanho-1;i++){
            vetor[i]=vetor[i+1];
        }
        tamanho--;
        return copia;
    }

    public int ultimoDe(T elemento){
        for (int i=tamanho-1;i>0;i--){
            if(vetor[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }

    public boolean possui(T elemento){
        for (int i=0;i<tamanho;i++){
            if(vetor[i].equals(elemento)){
                return true;
            }
        }
        return false;
    }

    public int tamanho(){
        return tamanho;
    }

    public void limpar(){
        tamanho=0;
    }

    public boolean estaVazia(){
        return tamanho==0;
    }

    @Override
    public String toString(){
        String retorno = "[";
        if(tamanho>0){
            for(int i=0;i<tamanho-1;i++){
                retorno+=vetor[i]+", ";
            }
            retorno+=vetor[tamanho-1];
        }
        retorno+="]";
        return retorno;
    }
}