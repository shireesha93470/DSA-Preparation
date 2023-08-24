public class SumOfBorderElements {
    public static void main(String[] args) {
        int arr[][] = {{1, 3, 4}, {6, 3, 2}, {9, 2, 10}};
        int sum = 0;
        
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == 0 || i == arr.length - 1 || j == 0 || j == arr[i].length - 1) {
                    sum += arr[i][j];
                }
            }
        }
        
        System.out.println(sum);
    }
}
