package streams;


import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class _Streams {
    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("John", Gender.MALE),
                new Person("John", Gender.MALE),
                new Person("JOAN", Gender.FEMALE),
                new Person("John", Gender.MALE),
                new Person("OJOMA", Gender.FEMALE)

        );
//            people.stream()
//                    .map(person -> person.name)
//                    .collect(Collectors.toSet())
//                    .forEach(System.out::println);
//
//            people.stream()
//                            .map(person -> person.name)
//                            .mapToInt(name -> name.length())
//                            .forEach(System.out::println);
        Predicate<Person> femalePredicate = person -> Gender.FEMALE.equals(person.gender);

       boolean conainsOnlyFemale =  people.stream()
               .allMatch(femalePredicate);
        boolean conainsOnlyFemale2 =  people.stream()
                .anyMatch(femalePredicate);

        System.out.println(conainsOnlyFemale);
        System.out.println(conainsOnlyFemale2);
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
