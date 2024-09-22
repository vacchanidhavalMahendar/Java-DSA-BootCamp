package Class5_Switch_Loops_Operators;

public class Operators {
    //Operators are symboles that tells the compiler do to some task
    public static void main(String[] args) {

        //Arithmetic operators

        int a=100;
        int b=2;
        System.out.println(a+1);  //101
        System.out.println(++a); //101
        System.out.println(a++); //101
        System.out.println(++a);  //103


        System.out.println(a/2); //50
        System.out.println(a%2);//0

        System.out.println(a+b);
        System.out.println(a-b);

        System.out.println("***********************************************");
        int k=10;
        int l=2;

        int x=++k + l + k++ +  ++k;  //  11  + 2  + 11 + 13
        System.out.println(x);


        int p=10;
        int q=3;
        int w=q++ + p++ + p++ + p++ + ++q + q++ + q;
        System.out.println(w);




    }
}
