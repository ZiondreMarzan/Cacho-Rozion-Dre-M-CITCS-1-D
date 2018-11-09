package backup;
import java.util.*;

public class Backup {

    public static void main(String[] args) {
                System.out.println("ODD \t EVEN" );
                int list[]={3,9,15,20,65,23,18,4,2,14};
                Arrays.sort(list);
                int[] odd = new int[list.length];
                int[] even = new int[list.length];
                
                int oddCount = 0;
                    int evenCount = 0 ;
            for (int I = 0; I < list.length; I++) {
                
                if (list[I]%2 == 0 ){
                    even [evenCount] = list [I];
                    evenCount ++;
                    
                }
                else {
                    odd [oddCount] = list[I];
                    oddCount++;
                }
            }
          
            
            for(int I = 0; I <oddCount; I++) {
                System.out.println(odd[I]+"\t "+even[I]);
            }
    }
}
