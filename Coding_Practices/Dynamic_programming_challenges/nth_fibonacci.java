package Dynamic_programming_challenges;

class nth_fibonacci{
    public static void main(String[] args){
        int n = 10;
        int[] arr = new int[n+1];
        System.out.println(fibo(n,arr));
        System.out.println(fiboseed(n));
    }
    public static int fibo(int n, int[] arr){
        if (n == 0) {
            return n;
        }
        if(n == 1){
            return n;
        }
        if(arr[n] != 0){
            return arr[n];
        }
        int fib1 = fibo(n-1,arr);
        int fib2 = fibo(n-2,arr);
        int fib = fib1 + fib2;
        arr[n] = fib;
        return fib;
    }
    public static int fiboseed(int n){
        int[] arr = new int[n+1];
        //seed
        arr[0] = 0;
        arr[1] = 1;
        for(int i=2 ; i<=n ; i++){
            arr[i] = arr[i-1]+arr[i-2];
        }
        return arr[n];
    }
}