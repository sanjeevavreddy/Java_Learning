import java.util.*;
import java.io.*;

public class Learn_Combinations_Array {


    static class Combination {

        static void combinationUtil(int arr[], int combinationArray[], int start, int end, int index, int r) {

            if (index == r) {

                for (int j = 0; j < r; j++) {
                            System.out.print(combinationArray[j]+" ");
                }
                System.out.println();
                return;
            }

            for (int i = start; i <= end && end - i + 1 >= r - index; i++) {
                combinationArray[index] = arr[i];
                combinationUtil(arr, combinationArray, i + 1, end, index + 1, r);
            }
        }

        static void printCombination(int arr[], int n, int r) {
            int combination[] = new int[r];
            combinationUtil(arr, combination, 0, n - 1, 0, r);
        }

        public static void main(String[] args) {
            int arr[] = {1,
                    2,
                    3,
                    4,
                    5,
                    6,
                    7,
                    8,
                    9
            };
            int r = 5;
            int n = arr.length;
            printCombination(arr, n, r);
        }
    }

}
