package Udemy__Collection_12;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        if(languages.containsKey("Java")){
            System.out.println("Java already exist");
        }else {
            languages.put("Java", "An object oriented, platform independent language");
            System.out.println("Java added successfully");
        }

        languages.put("Python", "An object oriented language with dynamic semantics");
        languages.put("Algo", "an algorithmic language");
        languages.put("BASIC", "Beginners All Purpose Symbolic Instruction Code");
        languages.put("Lisp", "An object oriented, platform independent language");

        if(languages.containsKey("Java")){
            System.out.println("Java already exist");
        }else {
            languages.put("Java", "An object oriented, platform independent language");
            System.out.println("Java added successfully");
        }
        if (languages.remove("Java", "An object oriented, platform independent language")){
            System.out.println("Removed");
        }else {
            languages.replace("Java", "Java", "Golang");
            System.out.println("replaced successfully");
        }
        System.out.println(languages.replace("Algo", "daily practice is encouraged"));
        for (String keys : languages.keySet()){
            System.out.println(keys + " : " + languages.get(keys));
        }

    }
}
