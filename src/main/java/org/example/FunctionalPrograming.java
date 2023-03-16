package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FunctionalPrograming {
    public static void main(String[] args) {

          List<Person> people = List.of(
            new Person("John",Gender.MALE),
            new Person("John",Gender.MALE),
            new Person("JOAN",Gender.FEMALE),
            new Person("John",Gender.MALE),
            new Person("OJOMA",Gender.FEMALE)

          );
//        IMPERATIVE METHOD
        List<Person> female = new ArrayList<>();

        for(Person person : people){
            if(person.gender.equals(Gender.FEMALE)){
                female.add(person);
               // System.out.println(female);
            }
        }
        for(Person child : female){
           // System.out.println(child);
        }
//          DECLARATIVE APPROACH
        Predicate<Person> personPredicate = person->Gender.FEMALE.equals(person.gender);
        List<Person> female2 = people.stream()
                .filter(personPredicate)
                .collect(Collectors.toList());
                female2.forEach(System.out::println);


    }

    static class Person{
        final String name;
        final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }
    enum Gender {
        MALE, FEMALE
    }
}
