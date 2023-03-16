package Udemy__AbstractClassChallenge;

public class Main {
    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList(null);

        list.traverse(list.getRoot());

        String stringData = "4 5 6 5 3 5 8 9 0";

        String[] data = stringData.split(" ");
        for (String s : data){
            //create new item with value set to the String s
            list.addItem(new Node(s));
        }
        list.traverse(list.getRoot());
    }
}
