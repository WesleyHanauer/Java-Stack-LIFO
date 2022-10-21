package Estrutura;

import java.util.Stack;

public class Teste2 {
    public static void main(String[] args) {
        Stack<String> pilha = new Stack<>();
        pilha.push("A");
        pilha.push("B");
        pilha.push("C");
        pilha.push("D");
        pilha.pop();
        System.out.println(pilha);
        System.out.println(pilha.peek());
        System.out.println("A pilha esta vazia? "+pilha.isEmpty());
        System.out.println("O tamanho da pilha é "+pilha.size());
        pilha.clear();
        System.out.println(pilha);
    }
}
