package src.utils;

import java.util.Arrays;
import java.util.Random;

public class ArrayHandler {
    public static <T> void shuffleArray(T[] arr) {
        Random r = new Random();

        for (int i = arr.length - 1; i > 0; i--) {
            int j = r.nextInt(i + 1);
            T temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }
    }

    public static boolean isSorted(int[] array, int n) {
        if (n == 1 || n == 0)
            return true;
        return array[n - 2] <= array[n - 1] && isSorted(array, n - 1);
    }

    public static String[] pushIntoArray(String[] arr, String element) {
       
        String[] newArray = new String[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }
       
        newArray[newArray.length - 1] = element;
        //System.out.println(Arrays.toString(newArray));
        return newArray;
    }

    public static int[] pushIntoArray(int[] arr, int element) {
       
        int[] newArray = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }
       
        newArray[newArray.length - 1] = element;
        //System.out.println(Arrays.toString(newArray));
        return newArray;
    }
}