package org.example.functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {

//        FUNCTION TAKES ONE ARGUMENT AND PRODUCE ONE RESULT
            int number =  incrementByOne(9);
        System.out.println(number);

            int number2 = incrementByOneFunction.apply(6);
        System.out.println(number2);

            int multiply = multiplyByTenFunction.apply(number2);
        System.out.println(multiply);

//        OR WE CAN

        Function<Integer, Integer> addByOneAndThenMultiplyByTen =
                incrementByOneFunction.andThen(multiplyByTenFunction);
        System.out.println(addByOneAndThenMultiplyByTen.apply(multiply+number2));

//        BI_FUNCTION TAKES TWO ARGUMENTS AND PRODUCE ONE RESULT NORMAL FUNCTION
        System.out.println(incrementByOneAndMultiply(8,2));

//        OR WE CAN USE THE BI_FUNCTION
        System.out.println(incrementByOneAndMultiply.apply(8,10));


    }

   static Function<Integer, Integer> incrementByOneFunction = num -> num +1;
    static Function<Integer, Integer> multiplyByTenFunction = num -> num *10;
    static int incrementByOne(int num){
        return num + 1;
    }
        static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiply =
        (numberToIncrementBy, numberToMultiplyBy)-> (numberToIncrementBy + 1) * numberToMultiplyBy;

    static int incrementByOneAndMultiply(int num, int numToMultiplyBy){
        return (num + 1)*numToMultiplyBy;

    }
}
