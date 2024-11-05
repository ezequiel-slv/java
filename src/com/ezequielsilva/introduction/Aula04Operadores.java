package com.ezequielsilva.introduction;

import java.sql.SQLOutput;

public class Aula04Operadores {
    public static void main(String[] args) {
        // - + / *

        int Numero01 = 10;
        double Numero02 = 20;
        var Resultado = (Numero01 + Numero02);
        System.out.println(Resultado);

        //%
        int resto = 20 % 3;
        System.out.println(resto);

        // booleans: < > <= == !=

        boolean DezmaiorVinte = 10 > 20;
        System.out.println("Dez é maior que vinte? "+ DezmaiorVinte);

        int idade = 29;
        float salario = 3500;

        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 3500;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3500;
        System.out.println("isDentroDaLeiMaiorQueTrinta" + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta" + isDentroDaLeiMenorQueTrinta);
    }
}
