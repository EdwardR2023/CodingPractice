/*
 * 
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Q2 test
        int[] heights = {6,7,3,2,4,9,8,1,5};
        List<Integer> highlights = Q2.solution(heights);
        System.out.println("\nQ2 original: " + Arrays.toString(heights) + "\tQ2 result: " + highlights);

        // Q3 test
        int[][] matrix = {
            {1,1,2,0,1},
            {1,2,0,1,2},
            {2,0,1,2,0},
            {0,1,2,0,1},
            {1,2,1,1,2}
        };


        Q3 q3 = new Q3();
        int[][] transformed = q3.solution(matrix);

        System.out.println("\nQ3 original: \t\t transformed:");
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]) + "\t\t" + Arrays.toString(transformed[i]));
        }
    }
}

