package pl.edu.uwm.wmii.kotewa.laboratorium00;
import java.util.Scanner;


public class Zadanie1_e {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj długość ciągu: \n");
        int n = scan.nextInt();
        int iloczyn = 1;
        System.out.println("Podaj elementy ciągu: \n");
        while(n>0){
            int myinput = scan.nextInt();
            if(myinput < 0){
                myinput *= -1;
                iloczyn = iloczyn * myinput;
                n = n-1;
            }else{
                iloczyn = iloczyn * myinput;
                n = n-1;
            }
        }
        System.out.println("Iloczyn ciągu = " + iloczyn);
    }
}
