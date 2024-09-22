package Chapter4_Sorting_Recursion;

public class FactorialRecursion {

    public static void main(String[] args) {

        System.out.println(factorial(5));
    }

    private static int factorial(int n) {

        if(n==0) return 1;

        return n* factorial(n-1);   //factorail(n-1) is your best friend.
    }
}
