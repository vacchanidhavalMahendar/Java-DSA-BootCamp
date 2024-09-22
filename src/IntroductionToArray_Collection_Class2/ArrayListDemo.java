package IntroductionToArray_Collection_Class2;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        int arr[]= new int[10]; //Array

        //Creating an ArrayList
        ArrayList<Integer> arrayList= new ArrayList<>();
        //Adding the Object
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);
        arrayList.add(60);

        System.out.println("ArrayList is"+arrayList);
        arrayList.remove(4);
        for(int i=0;i<arrayList.size();i++) {
            System.out.println(arrayList.get(i));
        }

        for(Integer data: arrayList){
            System.out.println(arrayList);

        }

    }
}
