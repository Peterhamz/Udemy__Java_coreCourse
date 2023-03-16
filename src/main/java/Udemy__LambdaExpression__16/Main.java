//package Udemy__LambdaExpression__16;
//
//import java.util.*;
//import java.util.stream.Collectors;
//
//public class Main {
//    public static void main(String[] args) {
////        List<Integer> numbers = Arrays.asList(3,2,5,7,8,9,4,6,8,22);
////
////        List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
////        System.out.println(evenNumbers);
//
//        new Thread(()-> {
//            System.out.println("Printing from the Runnable");
//            System.out.println("line 2");
//        }).start();
//
//
//        Employee john = new Employee("john", 33);
//        Employee peter = new Employee("peter", 32);
//        Employee sule = new Employee("sule", 43);
//        Employee samuel = new Employee("amuel", 23);
//
//        List<Employee> employees = new ArrayList<>();
//
//        employees.add(john);
//        employees.add(peter);
//        employees.add(sule);
//        employees.add(samuel);
//
//        employees.forEach(employee -> {
//            System.out.println(employee.getName());
//            System.out.println(employee.getAge());
//        });
//
////        Collections.sort(employees, new Comparator<Employee>() {
////            @Override
////            public int compare(Employee employee1, Employee employee2) {
////                return employee1.getName().compareTo(employee2.getName());
////            }
////        });
//        Collections.sort(employees, (Employee employee1, Employee employee2)->
//                employee1.getName().compareTo(employee2.getName()));
//
//
//        for (Employee employee : employees){
//            System.out.println(employee.getName());
//        }
//
////        String sillyString = doStringStuff(new UpperContact() {
////            @Override
////            public String upperAndConcat(String s1, String s2) {
////                return s1.toUpperCase() + s2.toUpperCase();
////            }
////        },
////        employees.get(0).getName(), employees.get(1).getName());
////        System.out.println(sillyString);
//
//        UpperContact uc = (String s1, String s2) -> s1.toUpperCase() + s2.toUpperCase();
//        String sillString = doStringStuff(uc,employees.get(0).getName(), employees.get(1).getName());
//        System.out.println(sillString);
//    }
//    public final static String doStringStuff(UpperContact uc, String s1, String s2){
//        return  uc.upperAndConcat(s1, s2);
//    }
//
//
//}
////class codeToRun implements Runnable{
////    @Override
////    public void run() {
////        System.out.println("Printing from the runnable");
////    }
////}
//class Employee{
//    private String name;
//    private int age;
//
//    public Employee(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//}
//interface UpperContact{
//    public String upperAndConcat(String s1, String s2);
//}
