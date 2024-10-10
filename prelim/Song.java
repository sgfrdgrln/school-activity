import java.util.*;

public class Song {
    
    public static void main(String[] args) {
        
        LinkedList<String> songs = new LinkedList<>();
        LinkedList<String> artists = new LinkedList<>();
        LinkedList<String> playlist = new LinkedList<>();

        // 5 songs

        songs.add("Talk that Talk");
        songs.add("Enemy");
        songs.add("OMG");
        songs.add("all the kids are depressed");
        songs.add("Fallen");

        // 5 artists
        artists.add("TWICE");
        artists.add("Imagine Dragons");
        artists.add("Newjeans");
        artists.add("Jeremy Zucker");
        artists.add("Lola Amour");

        System.out.println(songs);
        System.out.println(artists);

        // create a playlist

        for(int i = 0;  i < songs.size(); i++){
            playlist.add(songs.get(i) + " - " + artists.get(i));
        }
       
        for(int i = 0; i < playlist.size(); i++) {
            System.out.println(playlist.get(i));
        }



    }


}