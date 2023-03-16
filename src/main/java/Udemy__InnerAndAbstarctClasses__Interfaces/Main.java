package Udemy__InnerAndAbstarctClasses__Interfaces;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Button button = new Button("print");
    public static void main(String[] args) {

        Player tim = new Player("Tim", 10, 15);
        System.out.println(tim.toString());
        savedObject(tim);

        tim.setHitPoints(6);
        System.out.println(tim);

        savedObject(tim);
//        loadObject(tim);

        System.out.println(tim);

        ISaveable wolf = new Monster("werewolf", 20, 44);
        System.out.println(wolf);
        savedObject(wolf);


    }

    public static ArrayList<String> readValues(){
        ArrayList<String> values = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        boolean quit = false;
        int index = 0;

        System.out.println("Choose\n" +
                            "1 to enter a String\n" +
                            "0 to quit");

        while(!quit){
            System.out.println("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static  void savedObject(ISaveable objectToSave){
        for (int i = 0; i < objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");

        }
    }

    public static void loadObject(ISaveable objectToLoad){
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }

















}
