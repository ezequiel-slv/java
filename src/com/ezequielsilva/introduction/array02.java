package com.ezequielsilva.introduction;

public class array02 {
    public static void main(String[] args) {

        String[] nomes = new String[3];

        nomes[0] = "Ezequiel";
        nomes[1] = "Silva";
        nomes[2] = "Lima";
         
        //com laço de repetição
        for (int i = 0; i < 3; i++) {
            System.out.println(nomes[i]);
        }
       //concatenado
        System.out.println(nomes[0]+" "+ nomes[1]+" "+ nomes[2]);
    }
}



