package jobsheet7;
import java.util.Scanner;
public class tugas1 {
    public static void main(String[] args)
    {
        int [] nominal = new int[] {5000,2000,1000,500,100};
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan jumlah: ");
        int uang = scan.nextInt();
        
        for (int i=0; i<5; i++){
            int jumlah = uang/nominal[i];
            uang = uang - (nominal[i]*jumlah);
            
            System.out.println("lembar" + nominal[i]+ "=" + jumlah);
        }
    }
    
}
