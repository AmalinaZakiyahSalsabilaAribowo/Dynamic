package jobsheet7;
import java.util.Scanner;
public class tugas2 {
    public static void main(String[] args)
    {

            Scanner sistem = new Scanner(System.in);
            int arr[]= {7, 5, 4, 3, 2};
            int arr1[]= {10000, 7000, 5000, 3000, 2000};
            int bayaran = 0;
            
            System.out.println("Jumlah berat maksimal : ");
            int n = sistem.nextInt();
            
            for(int i = 0; i < arr.length; i++)
            {
                
                int hasil = n/arr[i];
                n = n - (arr[i]*hasil);
                bayaran += hasil*arr[1];
        }
                System.out.println("Bayaran yang didapat: " + bayaran);
            }
        }
    
   


          
                

