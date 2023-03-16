package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TutorClass {
    public static void main(String[] args) {


        //                                                                              REVERSE A NUMBER IN JAVA

        //   ALGORYTHM

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int number = sc.nextInt();
//
//        int org_num = number;
//        int rev = 0;
//        while(number!=0){
//            rev = rev*10 + number%10;
//            number = number/10;
//
//           // System.out.println("reverse number:" + rev);
//        }
//        if(org_num == rev){
//            System.out.println("This number is Palidrom");
//        }else {
//            System.out.println("Not Palidome");
//        }

//

//              PALIDOME WORD

//        Scanner words = new Scanner(System.in);
//        System.out.println("Say something: ");
//
//        String wed = words.nextLine();
//
//
//        String org_string = wed;
//        String rev = "";
//        int len = wed.length();
//        for(int i = len-1; i >=0; i--){
//            rev = rev + wed.charAt(i);
//        }
//
//            if (org_string.equals(rev)){
//                System.out.println("This word is Palid");
//            }else {
//                System.out.println("Palidrome is not");
//            }

//            String = "racecar";
//            String rev = "";
//            int leng = string.length();
//
//            for(int i = leng-1; i >=0; i--){
//            rev = rev + string.charAt(i);
//                System.out.println(i);
//        }
//            if(string.equals(rev)){
//                System.out.print("  This word is Palid" );
//            }else {
//                System.out.println("Palidrome is not");
//
//            }
        ;
//            System.out.println("reverse number:" + rev);


//                  USING THE STRING BUILDER

//        StringBuilder sbl = new StringBuilder();
//
//        sbl.append(number);
//        StringBuilder rev = sbl.reverse();
//        System.out.println("reverse number:" + rev);

//                                                                               REVERSE A STRING
//
//
//     USING ALGORITHMS TO CONCATENATE

//        String string = "ABCD";
//        String vers = "";
//        System.out.println("Before reversing:" + string);
//        int len = string.length();
//
//        for(int i = len-1; i >=0; i--){
//            vers = vers + string.charAt(i);
//            System.out.println("After reversing: " + vers);
//        }


//        char a[] = string.toCharArray();
//        int len = a.length;
//
//        for (int i = len - 1; i >= 0; i--) {
//
//            vers = vers + a[i];
//
//
//            System.out.println("After reversing: " + vers);
//        }

//        USING STRING BUFFER CLASS(BUILDER AND BUFFER)
//        StringBuffer rev = new StringBuffer(string);
////              rev.append(string);
//        StringBuffer verse = rev.reverse();
//
//        System.out.println("After reversing: " + verse);

//        FINDING THE COUNT OF A NUMBER
//        int numb = 123456;
//        int count = 0;
//        while (numb >0){
//                   numb = numb/10;
//                count++;
//
//        }
//        System.out.println(count);


//                                                                                        PRODUCT ARRAY
        // }

//    public class RangeCompactArray {
//        public static String rangeCompact(ArrayList<Integer> arr) {
//            System.out.println(arr);
//            String ans = "";
//            int count = 1;
//            //[-6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20]
//            //-6,-3-1,3-5,7-11,14,15,17-20
//            for (int j = 1, k = 0; j < arr.size(); j++) {
//                if (arr.get(j) - arr.get(j - 1) != 1 || j == arr.size() - 1) {
//                    if (j == arr.size() - 1 && arr.get(j) - arr.get(j - 1) == 1) //checks if we're at the last element
//                        count++;
//                    if (count < 3) {
//                        while (k < j) //print from k to j-1
//                            ans += (k == 0) ? arr.get(k++) : "," + arr.get(k++);
//                    } else if (count >= 3 && k == 0) //don't add comma while printing the first element
//                        ans += arr.get(k) + "-" + arr.get(j - 1);
//                    else //print from k - j if you're at the last element or from k - j-1 otherwise
//                        ans += (j == arr.size() - 1) ? "," + arr.get(k) + "-" + arr.get(j) : "," + arr.get(k) + "-" + arr.get(j - 1);
//                    k = j; //move you starting point to your current position
//                    count = 1; //reset your count and continue
//                    continue;
//                }
//                count++;
//            }
//            System.out.println(ans + "\n");
//            return ans;
//        }
//
//        public static void main(String[] args) {
//            rangeCompact(new ArrayList<Integer>(Arrays.asList(-6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20)));
//            rangeCompact(new ArrayList<Integer>(Arrays.asList(-3, -2, -1, 2, 10, 15, 16, 18, 19, 20)));
//        }


      int num  = 12345;

        int sum  = 0;

        while (num>0){
            sum  += num%10;

            num = num/10;

            System.out.println(sum);


        }










    }
}
