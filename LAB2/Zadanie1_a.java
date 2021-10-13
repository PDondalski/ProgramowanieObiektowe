package pl.edu.uwm.wmii.kotewa.laboratorium00;
import java.util.Scanner;
public class Zadanie1_a {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
        System.out.println("Podaj długość ciągu: \n");
        int n = scan.nextInt();
        int suma = 0;
        System.out.println("Podaj elementy ciągu: \n");
        while(n>0){
            int myinput = scan.nextInt();
            suma = suma + myinput;
            n = n-1;
        }
        System.out.println("Suma ciągu = " + suma);
    }
}
