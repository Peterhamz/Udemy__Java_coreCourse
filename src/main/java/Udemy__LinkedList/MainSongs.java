package Udemy__LinkedList;

import java.util.*;

public class MainSongs {
    private static ArrayList<Album> albums = new ArrayList<>();
    public static void main(String[] args) {
        Album album = new Album("Storm-bringer", "Deep Purple");
        album.addSong("Awake", 3.4);
        album.addSong("Made a way", 4);
        album.addSong("hello", 2.5);
        album.addSong("me and you", 5);
        album.addSong("Put me thru", 4.1);
        album.addSong("Hosanna", 4.3);
        album.addSong("Hallelujah", 3.5);
        albums.add(album);

        album = new Album("made in new ", "AC/DC");
        album.addSong("Me to you", 8);
        album.addSong("Smiling hard", 2.3);
        albums.add(album);


        LinkedList<Song> playList = new LinkedList<>();

        albums.get(0).addToPlayList("Awake",playList);
        albums.get(0).addToPlayList("hello",playList);
        albums.get(0).addToPlayList("Hosanna",playList);

        albums.get(0).addToPlayList(5, playList);
        albums.get(1).addToPlayList(1, playList);
        albums.get(1).addToPlayList(2, playList);

            play(playList);

    }

    private static void play(LinkedList<Song> playList){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();

        if (playList.size() == 0){
            System.out.println("No song in Playlist");
        }else {
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }
        while (!quit){
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;
                case 1:
                    if (!forward){
                        if (listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()){
                        System.out.println("Now playing " + listIterator.next().toString());
                    }else {
                        System.out.println("We have reached the end of the list");
                        forward = false;
                    }
                    break;
                case 2:
                    if (forward){
                        if (listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()){
                        System.out.println("Now playing " + listIterator.previous().toString());
                    }else {
                        System.out.println("We have reached the start of the list");
                        forward = true;
                    }
                    break;
                case 3:
                    if (forward){
                        if (listIterator.hasPrevious()){
                            System.out.println("Now playing " + listIterator.previous().toString());
                            forward = false;
                        }else {
                            System.out.println("We are at the start of the list");
                            }
                        }else {
                        if (listIterator.hasNext()) {
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true;
                        } else{
                            System.out.println("We have reached the end of the list");
                        }
                    }
                    break;
                case 4:
                  printList(playList);
                    break;
                case 5:
                   printMenu();
                    break;
                case 6:
                    if (playList.size() > 0){
                        listIterator.remove();
                        if (listIterator.hasNext()){
                            System.out.println("Now playing " + listIterator.next());
                        } else if (listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
                    break;
            }
        }

    }

    private static void printMenu(){
        System.out.println("Available actions:\npress");
        System.out.println("0  - to quit\n" +
                "1  - to play next song\n" +
                "2  - to play previous song\n" +
                "3  - to replay the current song\n" +
                "4  - list songs in the playlist\n" +
                "5  - print available Actions\n" +
                "6  - delete current song from playlist");
    }

    private static void printList(LinkedList<Song> playList){

        Iterator<Song> iterator = playList.iterator();

        System.out.println("****************************");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("****************************");

    }
}
