package projects;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        Random generate = new Random();

        while (i < 6){
            int number  = generate.nextInt(100);
            i++;
            System.out.println("Digie seu nome: ");

            String name = scanner.nextLine();
            System.out.println("Olá " + name + " sua senha é " + number);
        }
    }
}
