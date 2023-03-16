package Udemy__LambdaExpression__16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Streams_Main {
    public static void main(String[] args) {
        List<String> someBingoNumbers = Arrays.asList(
                "N40", "N43",
                "B77", "B97",
                "G32", "G94", "G43", "G66", "g86",
                "I23","I74","I13",
                "O86");
        List<String> gNumbers = new ArrayList<>();
//        someBingoNumbers.forEach(number -> {
//            if (number.toUpperCase().startsWith("G")){
//                gNumbers.add(number);
////                System.out.println(number);
//            }
//        });
//        gNumbers.sort((String s1, String s2) -> s1.compareTo(s2));
//        gNumbers.forEach((String s)-> System.out.println(s));

        someBingoNumbers.stream().map(String::toUpperCase).filter(s -> s.startsWith("G")).sorted().forEach(System.out::println);
    }
}
