package UdemyJava;

import java.util.Scanner;

public class UdemyControlFlow___5 {
    public static void main(String[] args) {

//        Passing String to another DataType

        String numberString = "2018";
        System.out.println("number as String = " + numberString + 1);

        int num = Integer.parseInt(numberString);

        System.out.println(num + 1);

        sum3And5Numbers();


//        Reading User Input Challenge

//        Scanner scanner = new Scanner(System.in);
//
//        int counter = 0;
//        int sum = 0;
//
//        while (true){
//            int oder = counter + 1;
//            System.out.println("Enter number #" + oder + ":");
//
//            boolean isAnInt = scanner.hasNextInt();
//
//            if(isAnInt){
//                int number = scanner.nextInt();
//                counter++;
//                sum += number;
//                if(counter == 10){
//                    break;
//                }
//            } else{
//                System.out.println("Invalid number");
//            }
//            scanner.hasNextLine();
//        }
//        System.out.println("sum = " + sum);
//        scanner.close();


//        Min and Max input challenge


        Scanner scanner = new Scanner(System.in);


        int minNumber = 2147483647;
        int maxNumber = -2147483648;
//        boolean first = true;

        while(true){

            System.out.println("Enter number: ");

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt){
                int nums = scanner.nextInt();

//                if(first){
//                    first = false;
//                    minNumber = nums;
//                    maxNumber = nums;
//                }
                if(nums > maxNumber){
                maxNumber = nums;
            }

                if(nums < minNumber){
                minNumber = nums;
            }

            }else {
                break;
            }
            scanner.hasNextLine();
        }
        System.out.println("Minimum number = " + minNumber + "," + "Maximum = " + maxNumber);
        scanner.close();




//        System.out.println("10,000 at 2% interest = " + calculateInterestRate(10000.0,2.0));
//        System.out.println("10,000 at 3% interest = " + calculateInterestRate(10000.0,3.0));
//        System.out.println("10,000 at 4% interest = " + calculateInterestRate(10000.0,4.0));
//        System.out.println("10,000 at 5% interest = " + calculateInterestRate(10000.0,5.0));


        for (int i = 1; i <= 8; i++) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.6f", calculateInterestRate(10000.0, i)));
        }

        System.out.println("*******************************");

        for (int i = 8; i >= 0; i--) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.6f", calculateInterestRate(10000.0, i)));
        }

        System.out.println("********************************");













        int count = 0;


        for (int i = 10; i < 50; i++) {
            if (isPrime(i)) {
                count++;

                System.out.println("number " + i + " is a prime number ");
                if (count == 3) {
                    System.out.println("Existing for loop");
                    break;
                }
            }

        }
//        count = 1;
//
//        while (count != 6){
//            System.out.println("count can be incremented to " + count);
//
//            count++;
//            if(count > 20){
//                break;
//            }
//        }












        count = 6;

        do {
            System.out.println("count can be incremented to " + count);
            count++;
            if (count > 20) {
                break;
            }
        } while (count != 6);







        System.out.println("*******************************************");

        int number = 4;
        int finishedNumber = 20;
        int evenNumFound= 0;

        while(number <= finishedNumber){
            number++;

            if(!isEvenNumber(number)){
                continue;

            }
            System.out.println(" even numbers " + number);

             evenNumFound++;
            if(evenNumFound >= 5){
                break;
            }

    }
        evenNumFound += number;
        System.out.println("Total even numbers found = " + evenNumFound);


        System.out.println("*********************************************");


        System.out.println(sumDigits(-333));
}










    public static boolean isPrime(int n) {
        if (n == 1){
            return false;
        }

//    we can also use this for loop for(int i = 2; i <= (long) Math.sqrt(n); i++)
        for(int i = 2; i <= n/2; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }










    public static void sum3And5Numbers(){
        int count = 0;

        int sum = 0;

        for(int i = 1; i <= 1000; i++){
            if((i % 3 == 0) && (i % 5 == 0)){
                count++;
                sum += i;

                System.out.println("Found number = " + i);
            }
            if(count == 5){
                break;
            }

        }
        System.out.println("Sum = " + sum);
    }











    public static double calculateInterestRate(double amount, double interestRate){
        return (amount * (interestRate/100));
    }










    public static boolean isEvenNumber(int num){
        if(num % 2 ==0){
            return true;
        }
        return false;
    }






    public static int sumDigits(int number){


        if(number < 10){
            return -1;
        }


        int digit = 0;
         int sum = 0;

         while(number > 0 ){

             digit = number % 10;

             sum = sum + digit;
              number =number/10;



         }

        return sum;
    }
}
