package jobsheet7;

import java.util.Scanner;

public class HitungFibonacci {
    private static void tampilJudul(String identitas)
    {
        System.out.println("Identitas : "+ identitas);
        System.out.println("\nHitung Fibonacci");
        System.out.println("1, 1, 2, 3, 5, 8, 13, 21, ...dst\n");
    }
    public static void main(String[] args){
     String identitas = "Amalina Zakiyah Salsabila Aribowo / XR2 / 04";
    tampilJudul(identitas);
    int n = tampilInput();
    }
    private static int tampilInput(){
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Bilangan ke-: ");
        int n = scanner.nextInt();
        return n;
        
    }

}