package forloop;
import java.util.*;
public class ForLoop {

    public static void main(String[] args) {
        Scanner etc = new Scanner(System.in);
        String ETC ;
        Scanner userinput = new Scanner(System.in) ;
        int Z ;
        int A ;
            System.out.println("Input a number to be guessed ");
            A = userinput.nextInt();
                        System.out.println(""
                                + "");
                            System.out.println(""
                                    + "");
                               System.out.println(""
                                       + "");
                            System.out.println(""
                                    + "");
                               System.out.println(""
                                       + "");
                            System.out.println(""
                                    + "");
                               System.out.println(""
                                       + "");
                            System.out.println(""
                                    + "");
                               System.out.println(""
                                       + "");
                            System.out.println(""
                                    + "");
                               System.out.println(""
                                       + "");
                            System.out.println(""
                                    + "");
                               System.out.println(""
                                       + "");
                            System.out.println(""
                                    + "");
                               System.out.println(""
                                       + "");
                            System.out.println(""
                                    + "");
                               System.out.println(""
                                       + "");
                            System.out.println(""
                                    + "");
        do{ 
            System.out.println("Guess a number from 1 - 1000");                
       
            Z = etc.nextInt();
                        if ( Z == A ){
                System.out.println("Correct");    
            }
            else if ( Z < A ){
                System.out.println("Incorrect The Guessed number is lower than the correct number");
            }
            else if ( Z > A ){
                System.out.println("Incorrect The Guessed number is Higher than the correct number ");
            }
            if (Z % 2 != 0 && A % 2 == 0 ){
                System.out.println("Correct Number is an even number");    
            }
            if ( Z % 2 == 0 && A % 2 != 0){
                System.out.println("the correct Number is an odd number");
            }
             }while (Z != A );{




