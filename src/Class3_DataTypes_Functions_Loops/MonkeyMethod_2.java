package Class3_DataTypes_Functions_Loops;

public class MonkeyMethod_2 {
    public static void main(String[] args) {
        System.out.println("This is main method");
        //MonkeyMethod_2  m= new MonkeyMethod_2();
        //m.m1();  //Calling the m1 method
        MonkeyMethod_2.m1();
    }

    static void m1(){
        System.out.println("Iam inside the m1 method");
        m2();
    }

    static void m2(){
        System.out.println("Iam inside the m2 method");

    }


}
