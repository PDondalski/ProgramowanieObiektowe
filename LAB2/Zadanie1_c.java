package pl.edu.uwm.wmii.kotewa.laboratorium00;
import java.util.Scanner;


public class Zadanie1_c {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj długość ciągu: \n");
        int n = scan.nextInt();
        int suma = 0;
        System.out.println("Podaj elementy ciągu: \n");
        while (n > 0) {
            int myinput = scan.nextInt();
            if (myinput < 0) {
                myinput *= -1;
                suma = suma + myinput;
                n = n - 1;
            } else{
                suma = suma + myinput;
                n = n - 1;
            }
        }
        System.out.println("Suma ciągu wynosi: " + suma);
    }
}
