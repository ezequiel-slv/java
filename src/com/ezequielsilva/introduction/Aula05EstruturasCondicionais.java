package com.ezequielsilva.introduction;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 20;
        boolean condicao1 = idade >= 18;

        if (condicao1) {
            System.out.println("Idade permitida para dirigir");
        }
        //  ! nega a senteça retornando o contrario de verdadeiro caso a condição seja falsa
        if(! condicao1) {
            System.out.println("Idade não permitida para dirigir");
        }
    }

}