import java.util.Arrays;

public class p3 {
    public static void p3(int[][] arr) {
        int numRows = arr.length;
        int numCols = arr[0].length;
        
    
        for (int i = 0; i < numRows / 2; i++) {
            int[] temp = arr[i];
            arr[i] = arr[numRows - i - 1];
            arr[numRows - i - 1] = temp;
        }
        
        
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols / 2; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][numCols - j - 1];
                arr[i][numCols - j - 1] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Original array:");
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }

        p3(arr); 

        System.out.println("Reversed 2D array:");
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }
}
