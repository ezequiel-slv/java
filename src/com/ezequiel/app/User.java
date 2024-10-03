package com.ezequiel.app; //pacote do projeto

public class User {

    public static void print(){
        System.out.println(Visibilidade2.y); //<<--Erro já que a variável não foi declarada no escopo padrão
    }
}
