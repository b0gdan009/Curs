package src.Heros.src.Songs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class OrderSongs {
    public static void main(String[] args) {
        try {
            BufferedReader file =new BufferedReader(new FileReader("songs.txt"));
            String line;
            ArrayList<String> song = new ArrayList<String>();
//            int i = 0;
            while ((line = file.readLine()) != null);{
            song.add(line);
            }
            System.out.print(song.size());
            System.out.println(song);

            Collections.sort(song);
            System.out.println(song);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
