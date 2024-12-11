package com.ezequielsilva.introduction;

public class LacoContinue {
    public static void main(String[] args) {
        double valorCarro = 50000;

        for (int parcela = (int) valorCarro; parcela >= 1; parcela--) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000) {
                continue;
            }      
            System.out.println("parcela " + parcela + " R$ " + valorParcela);                
        }
    }
}
