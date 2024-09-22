package Class5_Switch_Loops_Operators;

public class AssignmentOperator {
    public static void main(String[] args) {
        int a=10;
        a=a-1;
        a-=1;
        a--;
        a=a*10;
        a*=10;
        a=a/2;
        a/=2;

        System.out.println(a);


        int b=2;
        int x=a>b? 100: 200;
        System.out.println(x);
    }
}
