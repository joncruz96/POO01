package com.POO;

import java.util.Scanner;

public class Pessoa{

    String nome;
    int idade;

    public Pessoa(){

    }

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    void setNome(String nome){
        this.nome = nome;
    }

    void setIdade(int idade){
        this.idade = idade;
    }

    String getNome(){
        return nome;
    }

    int getIdade(){
        return idade;
    }

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String velha, nova;

        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();

        System.out.println("Pessoa 1: ");
        pessoa1.setNome(leia.next());
        pessoa1.setIdade(leia.nextInt());

        System.out.println("Pessoa 2: ");
        pessoa2.setNome(leia.next());
        pessoa2.setIdade(leia.nextInt());

        System.out.println("Pessoa 3: ");
        pessoa3.setNome(leia.next());
        pessoa3.setIdade(leia.nextInt());


        if(pessoa1.getIdade() > pessoa2.getIdade()){
            if(pessoa1.getIdade() > pessoa3.getIdade()){
                velha = pessoa1.getNome();
            }
            else{
                velha = pessoa3.getNome();
            }
        }
        else{
            if (pessoa2.getIdade() > pessoa3.getIdade()) {
                velha = pessoa2.getNome();
            }
            else{
                velha = pessoa3.getNome();
            }
        }

        if(pessoa1.getIdade() < pessoa2.getIdade()){
            if(pessoa1.getIdade() < pessoa3.getIdade()){
                nova = pessoa1.getNome();
            }
            else{
                nova = pessoa3.getNome();
            }
        }
        else{
            if (pessoa2.getIdade() < pessoa3.getIdade()) {
                nova = pessoa2.getNome();
            }
            else{
                nova = pessoa3.getNome();
            }
        }

        System.out.println("A pessoa mais velha é: " + velha);
        System.out.println("A pessoa mais nova é: " + nova);
    }
}
