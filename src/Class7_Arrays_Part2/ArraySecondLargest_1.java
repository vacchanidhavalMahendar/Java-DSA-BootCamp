package Class7_Arrays_Part2;

public class ArraySecondLargest_1 {
    public static void main(String[] args) {

        int arr[]={1,34,12,10,11};
        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){

            if(arr[i]>max)
            {
                max = arr[i];
            }
            //those value which is less than max value

            else if(arr[i]> secondMax){
                secondMax=arr[i];
            }
        }
        System.out.println("The Maximum value in an array "+max);

        System.out.println("The Second Maximum value in an array "+secondMax);



    }
}
