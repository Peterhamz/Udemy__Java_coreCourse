//package Udemy__Collection_12;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//public class Main {
//    public static void main(String[] args){
//        Theatre theatre = new Theatre("Olympian", 8, 12);
//        List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);
//        printList(seatCopy);
//
//        seatCopy.get(1).reserve();
//        if (theatre.reserveSeat("A02")){
//            System.out.println("Please Pay for A02");
//        }else {
//            System.out.println("seat already reserved ");
//        }
////        Collections.reverse(seatCopy);
//        Collections.shuffle(seatCopy);
//        System.out.println("printing seatCopy");
//        printList(seatCopy);
//        System.out.println("Printing Theatre.seat");
//        printList(theatre.seats);
//
//        Theatre.Seat minSeat = Collections.min(seatCopy);
//        Theatre.Seat maxSeat = Collections.max(seatCopy);
//        System.out.println("Min seat is " + minSeat.getSeatNumber());
//        System.out.println("Max seat is " + maxSeat.getSeatNumber());
//
//        sortList(seatCopy);
//        System.out.println("Printing sorted seatCopy");
//        printList(seatCopy);
//    }
//    public static void printList(List<Theatre.Seat> list){
//        for (Theatre.Seat seat : list){
//            System.out.print(" " + seat.getSeatNumber());
//        }
//        System.out.println();
//        System.out.println("===================================================================");
//    }
//
//    public static void sortList(List<? extends Theatre.Seat> list){
//        for (int i = 0; i < list.size()-1; i++) {
//            for (int j =i+1; j < list.size(); j++) {
//                if (list.get(i).compareTo(list.get(j)) > 0){
//                    Collections.swap(list,i,j);
//                }
//            }
//        }
//    }
//}
