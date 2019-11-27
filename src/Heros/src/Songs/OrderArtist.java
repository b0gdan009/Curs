package src.Heros.src.Songs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class OrderArtist {
    public static void main(String[] args) {
        try {
            BufferedReader file =new BufferedReader(new FileReader("title.txt"));
            String line;
            ArrayList<Song> song = new ArrayList<Song>();
//            int i = 0;
            while ((line = file.readLine()) != null);{
                String[] parts= line.split("/");
            Song songs = new Song(parts[0],parts[1]);
            songs.add(songs);
            }
            System.out.print(song.size());
            System.out.println(song);

            Collections.sort(song,new ArtistComparator());
            System.out.println(song);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
