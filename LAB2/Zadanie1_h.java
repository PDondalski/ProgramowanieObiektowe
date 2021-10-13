package pl.edu.uwm.wmii.kotewa.laboratorium00;

import java.util.Scanner;

public class Zadanie1_h {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj długość ciągu: \n");
        int suma=0;
        int a = scan.nextInt();
        int n = 1;
        while(n>0){
            int b = scan.nextInt();
            if((n+1)%2 != 0){
                a*=-1;
            }
            n+=1;
            suma+=a;
            n-=1;
        }
        System.out.println("Suma: " + suma);
    }
}
