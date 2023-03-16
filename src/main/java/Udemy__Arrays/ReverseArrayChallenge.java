package Udemy__Arrays;

import java.util.Arrays;

public class ReverseArrayChallenge {
    public static void main(String[] args) {


//        String[] array = {"Yellow", "Knowledge"};
//        StringBuilder reversed = new StringBuilder();
//
//        for (int i = array.length; i > 0; i--) {
//            reversed.append(array[i - 1]).append(" ");
//        }
//            String[] reversedArray = reversed.toString().split(" ");
//
//            System.out.println(Arrays.toString(reversedArray));
        int[] array = {2,34,6,8,4,4,6,8,9};
        System.out.println("Array = " + Arrays.toString(array));
        reversed(array);
        System.out.println("Array = " + Arrays.toString(array));




    }


    private static void reversed(int[] array){
       int maxIndex = array.length-1;
       int halfLength = array.length/2;

        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex-i];
            array[maxIndex-i] = temp;


        }
    }
}












