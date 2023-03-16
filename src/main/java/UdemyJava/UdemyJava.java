package UdemyJava;

public class UdemyJava {
    public static void main(String[] args) {
//        int myValue = 10000;
//
//        int myMinIntValue = Integer.MIN_VALUE;
//        int myMaxIntValue = Integer.MAX_VALUE;
//
//        System.out.println("Integer minimum Value = " + myMinIntValue);
//        System.out.println("Integer maximum Value = " + myMaxIntValue);
//
////        Value overflow
//        System.out.println("Busted Max Value = " + (myMaxIntValue + 1));
//
////        Value Underflow
//        System.out.println("Busted Min Value = " + (myMinIntValue - 1));
//
//        int maxIntValue = 2147483647;
//        byte myMinByteValue = Byte.MIN_VALUE;
//        byte myMaxByteValue = Byte.MAX_VALUE;
//        System.out.println("Byte Min Value = " + myMinByteValue);
//        System.out.println("Byte Max Value = " + myMaxByteValue);
//
//        double myMinDoubleValue = Double.MIN_VALUE;
//        double myMaxDoubleValue = Double.MAX_VALUE;
//
//
//        System.out.println("Double Min Value = " + myMinDoubleValue);
//        System.out.println("Double Max Value = " + myMaxDoubleValue);
//
//        float myMinFloatValue = Float.MIN_VALUE;
//        float myMaxFloatValue = Float.MAX_VALUE;
//
//
//        System.out.println("Float Min Value = " + myMinFloatValue);
//        System.out.println("Float Max Value = " + myMaxFloatValue);
//
//
//        float myFloatValue = (float) 5.55;
//        double myDoubleValue = 5.88d;


//        Java keywords
//        Java expressions
//        the data do not form part of an expression, so it contains the variable the operators and operand

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore(true, 800, 7, 100);
        calculateScore(true, 10000, 8, 200);


        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Peter", highScorePosition);

        int newScore = calculateScore("Tim", 500);
        System.out.println("new Score is " + newScore);

        int newOverload = calculateScore(70);
        System.out.println("new overloaded method has " + newOverload);


        calculateScore();

        System.out.println( getDurationString(65,59));

        System.out.println(getDurationString(600000));

        printDayOfTheWeek(4);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("your final score was = " + finalScore);

            return finalScore;
        }
        return -1;

    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " Managed to get into position " + position);

    }

    public static int calculateHighScorePosition(int score) {
        if (score > 1000) {
            return 1;
        } else if ((score > 500) && (score < 1000)) {
            return 2;
        } else if ((score > 100) && (score < 500)) {
            return 3;

        } else {
            return 4;
        }
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("player " + playerName + " scored " + score + " points");
        return score * 100;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player  scored " + score + " points");
        return score * 100;
    }

    public static int calculateScore() {
        System.out.println("no player name or Score");
        return 0;
    }
// Converting inputes to mins hours and seconds
    public static String getDurationString(int minutes, int seconds) {
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return "Invalid Value";

        }
        long hours = minutes / 60;
         long remainingMins = minutes % 60;

         String hourString = hours + "h";
         if (hours < 10 ){
             hourString =  "0" + hourString;
         }

        String minutesString = remainingMins + "m";
        if (remainingMins < 10 ){
            minutesString = "0" + minutesString;
        }
        String secondsString = seconds + "s";
        if (seconds < 10 ){
            secondsString =  "0" + secondsString;
        }

        return hourString + " " + minutesString + " " + secondsString;
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "invalid value";

        }

        int minutes = seconds / 60;

        int remainderSeconds = seconds % 60;

        return getDurationString(minutes, remainderSeconds);

    }
    public static void printDayOfTheWeek(int day){
        switch (day){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3: case 4: case 5: case 6:
                System.out.println("the day is "+ day);
                break;
            default:
                System.out.println("Invalid day");
        }
    }


}


