package Udemy__Packages_11;

public class Series {
    public static long addSum(int num){
        return ((long) num * (num + 1))/2;
    }
    public static long factorial(int n){
        if (n == 0){
            return 1;
        }
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    public static long fibonacci(int n){
        if (n == 0){
            return 0;
        } else if (n == 1) {
            return 1;
        }
        int prev = 0;
        int current = 1;
        int next;
        for (int i = 2; i <= n; i++) {
            next = prev + current;
            prev = current;
            current = next;

        }
        return current;
    }
}
