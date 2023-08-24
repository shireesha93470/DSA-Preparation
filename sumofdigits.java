public class sumofdigits {
    public static void main(String[] args) {
        int number = 12345; 
        int sum = SumOfDigits(number);
        System.out.println(sum);
    }

    public static int SumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            sum += rem;
            num /= 10;
        }
        return sum;
    }
}
