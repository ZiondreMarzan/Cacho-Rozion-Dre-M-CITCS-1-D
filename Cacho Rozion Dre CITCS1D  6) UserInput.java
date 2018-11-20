package pkg2dactv;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      
        int r;
        int c;
           System.out.print("Enter Row Size  : ");
       r = scan.nextInt();
       System.out.print("Enter Column Size  : ");
       c= scan.nextInt();
    
       int [][]elements = new int[r][];
       int d;
        for(int x = 0; x< r; x++){   
            elements[x] = new int[c];
        for (int z = 0; z<c; z++){
            System.out.print("\n Array Row : " +x+ ", Array Column  "+z+" : "  );
        d = scan.nextInt();
        elements[x][z] = d;
       }
        }
        System.out.println("");
         System.out.println("");
          System.out.println("");
           System.out.println("");
            System.out.println("");
             System.out.println("");

        for (int x = 0;x<elements.length; x++){
        for (int z=0;z<elements[x].length; z++){
               System.out.print(elements[x][z]+"\t");
               }
                System.out.println("");
                 System.out.println("");
        }
    }    
}    

