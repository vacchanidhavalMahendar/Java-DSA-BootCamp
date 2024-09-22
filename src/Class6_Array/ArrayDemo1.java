package Class6_Array;

//CLASS 6 Introduction to array

import java.util.Scanner;

public class ArrayDemo1 {

    public static void main(String[] args) {

      //Create an Array
/*      int arr[]= new int[5];
   int[] arr1= new int[5];
   int[] arr =new int[5];
   int arr4[]={1,2,3,4,5};*/

       //Storing the Value in an array
    /*  arr[0]=10; //Right value is given to Left or assignment operator
      arr[1]=20;
      arr[2]=30;
      arr[3]=40;
      arr[4]=50;

     //Fetching the value From array
     System.out.println(arr[2]) ;*/

int[] arr= new int[5];

    Scanner sc= new Scanner(System.in);
     System.out.println("**********Storing value*****************");
     for(int i=0;i<5;i++){
         System.out.println("Enter the Value from Index"+ i);
         arr[i]= sc.nextInt();
     }


        System.out.println("**********Fetching value*****************");
        for(int i=0;i<5;i++){
            System.out.println(" Value from Index"+ i +" "+arr[i]);

        }
    }

}
