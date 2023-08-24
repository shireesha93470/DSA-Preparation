public class Fibonacci {
    public static void main(String[] args) {
        int num = 10;
        System.out.println(fibonacci(num));
    }
     public static int fibonacci(int num) {
        if (num <= 1) { 
            return num;
        }
        int prev = 0;
        int curr = 1;
        for (int i = 2; i <= num; i++) {
            int temp = curr;
            curr = prev + curr;
            prev = temp;
        }
        return curr;
    
}
}