package IntroductionToArray_Class4;

class A{
    public void m1(){
        System.out.println("Hello Genie Ashwani");
    }

    public void m2(){
        System.out.println("Radhe Radhe");
    }
}

class B extends A{

    public void m1(){
        System.out.println("Ram Ram Bhai Shaeb");
    }

}


public class InheritanceDemo {
    public static void main(String[] args) {
B b=new B();
b.m1();
b.m2();
    }
}
