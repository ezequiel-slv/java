package com.ezequiel;

import java.util.Scanner;

    public class Conversao {
    public static void main(String[] args) {

        double xx = 55.30;
        short ss = 20;

        float y = (float) xx/ss; //como float é menor que double, precisou converter as variáveis para float

        Scanner scanner = new Scanner(System.in);
        int z = (int) scanner.nextDouble(); //uma variável int foi declarada em um scanner.nextDouble, dando conflito
        // entre int e double, necessitando converter em int

        System.out.println(z);
    }
}
