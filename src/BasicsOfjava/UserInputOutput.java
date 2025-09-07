package BasicsOfjava;

import java.util.Scanner;

public class UserInputOutput {
    public static void main(String arg[]){
        System.out.println("enter the number between 1 t0 100 ");
//        system is the class in java  .in is input stream
        Scanner sc= new Scanner(System.in);
        int number =  sc.nextInt();
        System.out.println("the number u entere is "+ number+ "       "+sc.nextInt() );
    }
}
