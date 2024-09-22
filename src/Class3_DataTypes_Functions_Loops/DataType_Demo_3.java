package Class3_DataTypes_Functions_Loops;

public class DataType_Demo_3 {
    public static void main(String[] args) {

        int a=10;
        int b=20;

        DataType_Demo_3 object = new DataType_Demo_3();
        int result=object.sum(20,30);//During calling we need to declare argument value

        System.out.println("Hello World");
        System.out.println("The result is"+result);

        float f=10.5f;
        double d= 10.6;
        short s=10;
        byte b1=1;
        boolean b2= true;
        String string="dhavalMahendar";
        char ch='a';

        object.print();
    }


    int sum(int a,int b){
        int c=a+b;
        return c;
    }

     void print(){
        int a=40;
        int b=3;
        int res=sum(a,b);
        System.out.println(res);
    }
}
