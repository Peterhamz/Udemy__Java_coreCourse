package Udemy__Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays__sorts {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        int[] array = new int[]{4,8,6,2,7,4,7,3,5,7,8,4,7,4,3};
//        int temp = 0;
//
//
//        System.out.println("To display the previous array!");
//
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i] + " ");
//        }
//
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = i + 1; j < array.length ; j++) {
//
//                if(array[i] > array[j]){
//                    temp = array[i];
//                    array[i] = array[j];
//                    array[j] = temp;
//                }
//
//            }
//
//        }
//
//        System.out.println("***********************************");
//        System.out.println("Displaying the sorted in Ascending oder");
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i] + " ");
//
//        }
//
//
//        System.out.println(" sorting the array in descending ode4334r");
//        for (int i = 0; i < array.length; i++) {
//            for (int j = i + 1; j < array.length ; j++) {
//
//                if(array[i] < array[j]){
//                    temp = array[i];
//                    array[i] = array[j];
//                    array[j] = temp;
//                }
//
//            }
//
//        }
//        System.out.println("***********************************");
//        System.out.println(" Displaying the sorted array in descending");
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i] + " ");


//
//        }

        int[] myIntegers = getIntegers(5);
        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);
    }
    public static int[] getIntegers(int capacity){
        int[] array = new int[capacity];

        System.out.println("Enter " + capacity + " Integer values: \r");

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();

        }
        return array;
    }
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " Content " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array){
//        int[] sortedArray = new int[array.length];
//        for (int i = 0; i < array.length; i++) {
//            sortedArray[i] = array[i];
//        }
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;


        while (flag){
            flag = false;
            for (int i = 0; i < sortedArray.length-1; i++) {
                if(sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;

                }
            }
        }
        return sortedArray;
    }
}
























