public class Pattern2 {
    public static void main(String[] args) {
        int size = 5; 

        for (int i = 1; i <= size; i++) {
            for (int j = size; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
