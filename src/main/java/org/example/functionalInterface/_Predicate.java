package org.example.functionalInterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println("WITHOUT PREDICATE");
        System.out.println(isPhoneNumberValid("09033210661"));
        System.out.println(isPhoneNumberValid("07033210661"));
        System.out.println(isPhoneNumberValid("070033210661"));

        System.out.println("WITH PREDICATE");
        System.out.println(isPhoneNumberValidPredicate.test("09033210661"));
        System.out.println(isPhoneNumberValidPredicate.test("07033210661"));
        System.out.println(isPhoneNumberValidPredicate.test("07000210061"));


        System.out.println("Is phone number valid and contains number three");
        System.out.println(isPhoneNumberValidPredicate.and(contains3).test("07033210061"));

    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber->
            phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    static Predicate<String> contains3 = phoneNumber ->
            phoneNumber.contains("3");
    static Boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }
}
