package projects;

import java.util.Random;

public class PasswordLimitedGenerate {
    public static void main(String[] args) {
        int i = 0; //começara do 0 a 5
        Random generate = new Random();

        while(i < 6){ //O loop foi instanciado até 6 e se repetirar 6 vezes
           int number = generate.nextInt(100);
           System.out.println(number);
           i++;
        }
    }
}
