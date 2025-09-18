/*
Q3 – Y-Shape Majority in a Matrix

Description:
You’re given an odd-dimensioned 𝑁×𝑁 matrix containing only values 0, 1, or 2. 

A “Y-shape” is defined as:

Left diagonal (from top-left to center),
Right diagonal (from top-right to center),
Vertical line down from the center to the bottom.

The task is to identify the most frequent value inside the Y-shape and the most frequent value in the background (everything else). 
Then, transform the matrix with the minimal changes so that all Y-shape cells have the same value, and all background cells have a the same value different from the Y-shape value.

Constraints: N ≥ 3, always odd.

Key Challenges:
Correctly identifying Y-shape cells, separating frequency counts, and handling ties. Your implementation also avoids double-counting junction cells.
 */

import java.util.*;

public class Q3 {

    private int matrixLen;
    private int[] yFrequency = new int[3];
    private int[] bkgrdFrequency = new int[3];
    private List<Integer> numUnavailable = new ArrayList<>();

    private boolean inY(int i, int j) {
        //left diagonal 
        if (i == j && i <= (matrixLen / 2)) {
            return true;

        } //right diagonal 
        else if (i + j == matrixLen - 1 && i <= (matrixLen / 2)) {
            return true;

        } //middle column 
        else if (j == (matrixLen / 2) && i >= (matrixLen / 2)) {
            return true;

        }
        return false;
    }

    public int[][] solution(int[][] matrix) {
        matrixLen = matrix.length;
        int result[][] = new int[matrixLen][matrixLen];

        //interates through the matrix to find the value most repeated in the Y shape and in the background respectively
        for (int i = 0; i < matrixLen; i++) {
            for (int j = 0; j < matrixLen; j++) {
                //System.out.println("i: " + i + " j: " + j + " inY: " + inY(i, j) + " value: " + matrix[i][j]);
                int value = matrix[i][j];
                if (inY(i, j)) {
                    yFrequency[value]++;

                } else {
                    bkgrdFrequency[value]++;
                }

            }
            //System.out.println("\n");
        }

        int highestBkgrdfreq = Math.max(bkgrdFrequency[0], Math.max(bkgrdFrequency[1], bkgrdFrequency[2]));
        int bkgrdIndex = 0;
        int yIndex = 0;

        //check if all background frequencies are the same
        //if they are then the y frequency is the deciding factor
        if (bkgrdFrequency[0] == bkgrdFrequency[1] && bkgrdFrequency[1] == bkgrdFrequency[2]) {
            
            int highestYfreq = Math.max(yFrequency[0], Math.max(yFrequency[1], yFrequency[2]));
            for (int i = 0; i < yFrequency.length; i++) {
                
                if (yFrequency[i] == highestYfreq) {
                    yIndex = i;
                } else {
                    bkgrdIndex = i;
                }

            }
        } else {
            for (int i = 0; i < bkgrdFrequency.length; i++) {
                if (bkgrdFrequency[i] == highestBkgrdfreq) {
                    bkgrdIndex = i;
                    yFrequency[i] = -1000;
                }
            }

            int highestYfreq = Math.max(yFrequency[0], Math.max(yFrequency[1], yFrequency[2]));

            for (int i = 0; i < yFrequency.length; i++) {
                if (yFrequency[i] == highestYfreq) {
                    yIndex = i;
                }
            }

        }

        

        int change = 0;
        for (int i = 0; i < matrixLen; i++) {
            for (int j = 0; j < matrixLen; j++) {
                
                if (inY(i, j) && matrix[i][j] != yIndex) {
                    
                    result[i][j] = yIndex;
                    change++;

                } else if( !inY(i, j) && matrix[i][j] != bkgrdIndex){
                    
                    result[i][j] = bkgrdIndex;
                    change++;
                } 
                else {
                    result[i][j] = matrix[i][j];
                }

            }

        }
        System.out.println("Changes made: " + change);

        return result;
    }

}
