/*Utilizando somente operações de empilhar e desempilhar,
escreva um programa que remove um item com chave c fornecida
pelo usuário da pilha. Ao final da execução da função, a
pilha deve ser igual à original, exceto pela ausência do item removido. */

package Exercicio;

import java.util.Stack;
import java.util.Scanner;

public class Exercicio1 {
    public static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        Stack<String> pilha1 = new Stack<>();
        Stack<String> pilha2 = new Stack<>();
        pilha1.push("carro");
        pilha1.push("triciclo");
        pilha1.push("bicicleta");
        pilha1.push("navio");
        pilha1.push("aviao");
        pilha1.push("moto");
        pilha1.push("trem");
        System.out.println(pilha1);
        System.out.println("Qual item deseja remover?");
        String elemento = ler.next();
        int contador = pilha1.search(elemento);
        for (int i=0;i<contador;i++){
            pilha2.push(pilha1.peek());
            pilha1.pop();
        }
        for (int i=0;i<contador-1;i++){
            pilha2.pop();
            pilha1.push(pilha2.peek());
        }
        System.out.println(pilha1);
    }
}
