/*Uma empresa de logística pretende implementar um porto seco para armazenar contêineres
e precisa para um programa simples para gerenciar seu porto.

Dado o tamanho da empresa, essa possui apenas 5 locais onde pode empilhar os containers e
seu equipamento permite empilhar no máximo 4 containers.

Por política da empresa, um novo container deve ser colocado no local com a pilha mais baixa
disponível (se mais de um local tiver a mesma quantidade de contêineres, tanto faz em que pilha será adicionado).

Cada container é adicionado a partir de um código informado e o sistema não pode permitir
códigos repetidos. Para remoção também é preciso informar o código do container, mas o mesmo
somente será removido se estiver no topo da pilha.

O algoritmo deve mostrar as seguintes mensagens:
Código inválido!: quando for fornecido um valor já existe no momento de inserção e quando for
fornecido um valor não existente no momento de remoção.
Impossível empilhar!: quando não for mais possível adicionar containers nas pilhas.
Impossível desempilhar!: quando não for possível remover um container, ou por não existir mais
containers ou por ele não estar no topo da pilha.*/

package Exercicio;


import javax.management.StringValueExp;
import java.util.Stack;
import java.util.Scanner;

public class Exercicio2 {
    static Stack<String> local1 = new Stack<>();
    static Stack<String> local2 = new Stack<>();
    static Stack<String> local3 = new Stack<>();
    static Stack<String> local4 = new Stack<>();
    static Stack<String> local5 = new Stack<>();
    public static Scanner ler = new Scanner(System.in);

    static int menor(){
        if(local1.size()<=local2.size()&&local1.size()<=local3.size()&&local1.size()<=local4.size()&&local1.size()<=local5.size()){
            return 1;
        }
        else if (local2.size()<=local1.size()&&local2.size()<=local3.size()&&local2.size()<=local4.size()&&local2.size()<=local5.size()){
            return 2;
        }
        else if (local3.size()<=local2.size()&&local3.size()<=local1.size()&&local3.size()<=local4.size()&&local3.size()<=local5.size()){
            return 3;
        }
        else if (local4.size()<=local2.size()&&local4.size()<=local3.size()&&local4.size()<=local1.size()&&local4.size()<=local5.size()){
            return 4;
        }
        else {
            return 5;
        }
    }

    public static void main(String[] args) {
        char opcao;
        while(true){
            System.out.println("Qual operação deseja fazer?");
            System.out.println("A para adicionar");
            System.out.println("R para remover");
            opcao = ler.next().charAt(0);
            if (opcao=='A'){
                System.out.println("Qual container deseja posicionar?");
                String container = ler.next();
                if(menor()==1){
                    if (local1.size()<4){
                        if (local1.contains(container)||local2.contains(container)||local3.contains(container)||local4.contains(container)||local5.contains(container)){
                            System.out.println("Código inválido!");
                        }else {
                            local1.push(container);
                        }
                    }else{
                        System.out.println("Impossível empilhar!");
                    }
                }
                else if(menor()==2){
                    if (local2.size()<4){
                        if (local1.contains(container)||local2.contains(container)||local3.contains(container)||local4.contains(container)||local5.contains(container)){
                            System.out.println("Código inválido!");
                        }else {
                            local2.push(container);
                        }
                    }else{
                        System.out.println("Impossível empilhar!");
                    }
                }
                else if(menor()==3){
                    if (local3.size()<4){
                        if (local1.contains(container)||local2.contains(container)||local3.contains(container)||local4.contains(container)||local5.contains(container)){
                            System.out.println("Código inválido!");
                        }else {
                            local3.push(container);
                        }
                    }else{
                        System.out.println("Impossível empilhar!");
                    }
                }
                else if(menor()==4){
                    if (local4.size()<4){
                        if (local1.contains(container)||local2.contains(container)||local3.contains(container)||local4.contains(container)||local5.contains(container)){
                            System.out.println("Código inválido!");
                        }else {
                            local4.push(container);
                        }
                    }else{
                        System.out.println("Impossível empilhar!");
                    }
                }
                else{
                    if (local5.size()<4){
                        if (local1.contains(container)||local2.contains(container)||local3.contains(container)||local4.contains(container)||local5.contains(container)){
                            System.out.println("Código inválido!");
                        }else {
                            local5.push(container);
                        }
                    }else{
                        System.out.println("Impossível empilhar!");
                    }
                }
                System.out.println(local1);
                System.out.println(local2);
                System.out.println(local3);
                System.out.println(local4);
                System.out.println(local5);
            }
            else if(opcao=='R'){
                System.out.println("Qual container deseja remover?");
                String container = ler.next();
                if (local1.contains(container)){
                    if (local1.peek().equals(container)){
                        local1.pop();
                    }
                }
                else if(local2.contains(container)){
                    if (local2.peek().equals(container)){
                        local2.pop();
                    }
                }
                else if(local3.contains(container)){
                    if (local3.peek().equals(container)){
                        local3.pop();
                    }
                }
                else if(local4.contains(container)){
                    if (local4.peek().equals(container)){
                        local4.pop();
                    }
                }
                else if(local5.contains(container)){
                    if (local5.peek().equals(container)){
                        local5.pop();
                    }
                }else{
                    System.out.println("Impossível desempilhar!");
                }
                System.out.println(local1);
                System.out.println(local2);
                System.out.println(local3);
                System.out.println(local4);
                System.out.println(local5);
            }
        }
        }
    }