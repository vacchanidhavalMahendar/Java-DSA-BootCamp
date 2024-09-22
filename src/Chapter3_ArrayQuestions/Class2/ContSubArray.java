package Chapter3_ArrayQuestions.Class2;

import java.util.HashMap;
import java.util.Map;

public class ContSubArray {
    public static void main(String[] args) {

     int k=6;
     int arr[]={23,2,4,6,7};
        System.out.println(checkSubArraySum(arr,k));
    }

    public static boolean checkSubArraySum(int arr[],int k){

        Map<Integer,Integer> map= new HashMap<>();
        map.put(0,-1); //Using -1,Because to easily count the length
        int sum=0;

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            int rem=sum%k; //here rem is the remainder

            //conditoin
            if(map.containsKey(rem)){

            if(i-map.get(rem)>=1){
                return true;

            }
            else{
                map.put(rem,i);
            }
            }



        }

    return false;
    }
}
