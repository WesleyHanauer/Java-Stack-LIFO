package Estrutura;

public class Teste1 {
    public static void main(String[] args) {
        Pilha<String> pilha = new Pilha<>(2);
        pilha.empilhar("Batata");
        pilha.empilhar("Repositório");
        pilha.empilhar("Repolho");
        pilha.empilhar("Beterraba");
        System.out.println(pilha);
        System.out.println("Tamanho da pilha: "+pilha.tamanho());
        System.out.println("Qual o proximo elemento: "+pilha.topo());
        System.out.println("Removendo o elemento "+pilha.desempilhar());
        System.out.println(pilha);
        System.out.println("A pilha está vazia? "+pilha.estaVazia());
        pilha.limpar();
        System.out.println(pilha);
        System.out.println("A pilha está vazia? "+pilha.estaVazia());
    }
}