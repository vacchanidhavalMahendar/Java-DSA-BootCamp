package Class5_Switch_Loops_Operators;

import java.util.Scanner;

public class ScannerInput {
    int x=10;
    public static void main(String[] args) {


    //Taking input from the user
    Scanner sc= new Scanner(System.in);
    System.out.println("Please Enter the Number");
    int a=sc.nextInt();
    System.out.println(a);

    //Taking Input from the String
    System.out.println("Enter the String");
    String s= sc.nextLine();
        System.out.println(s);
        System.out.println('a');

        char c= sc.next().charAt(0);
        System.out.println(c);



    }
}
