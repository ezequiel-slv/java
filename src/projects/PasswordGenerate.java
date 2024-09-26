package projects; //pasta do projeto

import java.util.Random; // Importação da classe Random do pacote java.util

public class PasswordGenerate {

    public static void main(String[] args) {
        int x; //Declara a variavel x em inteiro
        Random generated = new Random(); //instância criada para gerar números aleatórios

        while (true) { //inicia um loop infinito
            int number = generated.nextInt(100);//É criada uma variável number do tipo inteiro usando o metodo nextInt da classe random, onde gerará numeros inteiros de 1 a 100
            System.out.println(number);
        }
    }

}
