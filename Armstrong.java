public class Armstrong {
    public static void main(String[] args) {
        int num = 153;
        int sum = 0;
        String numString = " "+num; 
        int temp = num;
        int numDigits = numString.length(); 
        for (int i = 0; i < numDigits; i++) {
            int digit = numString.charAt(i) - '0'; 
            sum += Math.pow(digit, numDigits); 
        }
        
        if (sum == temp) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}
