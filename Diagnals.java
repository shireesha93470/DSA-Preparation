public class Diagnals {
    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int row = 4;
        int col = 4;
        int t = 0;
        int b = row - 1;
        int l = 0;
        int r = col - 1;
        String result = "";

        while (t <= b && l <= r) {
            for (int i = l; i <= r; i++) {
                result += matrix[t][i] + " ";
            }
            for (int i = t + 1; i <= b; i++) {
                result += matrix[i][r] + " ";
            }
            if (t < b) {
                for (int i = r - 1; i >= l; i--) {
                    result += matrix[b][i] + " ";
                }
            }
            if (l < r) {
                for (int i = b - 1; i > t; i--) {
                    result += matrix[i][l] + " ";
                }
            }
            t++;
            b--;
            l++;
            r--;
        }
        
        System.out.println(result);
    }
}
