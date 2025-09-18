/*
 * 
 */
import java.util.*;

public class main {
    public static void main(String[] args) {
        
        int Heights[] = {6,7,3,2,4,9,8,1,5};
        List<Integer> sol = Q2.solution(Heights);
        System.out.println("\nQ2" + Arrays.toString(Heights) + "\tSolution: " + sol);

        //only values allowed in the matrix are 0,1,2
        //NxN matrix where N is always odd
        int[][]Ymatrix = {
            {2,1,1},
            {2,2,2},
            {2,2,2}
        };
        //print matrix in a matrix format
        System.out.println("\nQ3 Matrix:");
        for(int i = 0; i < Ymatrix.length; i++){
            System.out.println(Arrays.toString(Ymatrix[i]));
        }

        Q3 q3sol = new Q3();
        int[][] result = q3sol.solution(Ymatrix);
        System.out.println("\nQ3 Solution:");
        for(int i = 0; i < result.length; i++){
            System.out.println(Arrays.toString(result[i]));
        }
    }
}
