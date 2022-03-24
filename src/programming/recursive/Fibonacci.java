package programming.recursive;

public class Fibonacci {

    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }

    public static int fibNonRecursive(int n){

        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[0] = 0;
        for(int i = 2; i <= n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(fib(10));
        System.out.println(fibNonRecursive(10));
    }

}
