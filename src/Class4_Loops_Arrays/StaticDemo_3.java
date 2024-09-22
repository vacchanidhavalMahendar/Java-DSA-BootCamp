package Class4_Loops_Arrays;

public class StaticDemo_3 {
    //Army Area
    public static void main(String[] args) {

        System.out.println("Hello world");

        StaticDemo_3 obj= new StaticDemo_3();
        obj.m1();
        //Non-static method 'm1()' cannot be referenced from a static context
       // m1();

    }


    //Aam Aadmi or Normal person
    public void m1(){
        System.out.println("m1");

    }

    //Army ka aadmi
    public void m2(){
        System.out.println("m2");
    }
}
