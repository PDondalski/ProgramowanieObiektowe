package com.company;

public class Zadanie4 {
    public static void main(String[] args) {
        double saldo = 1000*1.06;
        double saldo2 = saldo*1.06;
        double saldo3 = saldo2*1.06;

        saldo=Math.round(saldo);
        saldo2=Math.round(saldo2);
        saldo3=Math.round(saldo3);

        System.out.println("Saldo po pierwszym roku: "+saldo);
        System.out.println("Saldo po drugim roku: "+saldo2);
        System.out.println("Saldo po trzecim roku: "+saldo3);
    }
}
