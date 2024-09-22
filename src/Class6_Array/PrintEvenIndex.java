package Class6_Array;

//Array Print Even Index
public class PrintEvenIndex {
    public static void main(String[] args) {

        int arr[]={10,20,30,40,50};


        //Display Even index value
        for(int i=0;i<5;i++){

            //A number which is divisble by 2 is called even number
            if(i%2==0){
                System.out.println("The Even Index value is"+arr[i]);
            }


        }

        System.out.println("***************************");

        for(int i=0;i<5;i++){

            if(i%2!=0){
                System.out.println("Its an odd number"+arr[i]);
            }
        }
    }
}
