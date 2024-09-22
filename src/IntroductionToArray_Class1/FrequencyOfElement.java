package IntroductionToArray_Class1;

public class FrequencyOfElement {
    public static void main(String[] args) {

       int arr[]= {10,2,3,10,2};   //length=5
       int res[]= new int[11];


       for(int i=0;i<arr.length;i++){

           int indexValue= arr[i];    //i=1-->2
           int updateIndexValue=res[indexValue] +1;  //res[10]=0   10--1  2---1,3--1
           res[indexValue]=updateIndexValue;

           //res[arr[i]]= res[arr[i]]+1;
           //arr[0]==>10/ res[10] =res[10]+1;
        }


       for(int i=0;i<res.length;i++){
           System.out.println(i+ "Frequency----->"+res[i]);
       }





    }
}
