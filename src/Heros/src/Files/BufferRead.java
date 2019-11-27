package src.Heros.src.Files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferRead {
    public static void main(String[] args) {
        try {
            BufferedReader file= new BufferedReader(new FileReader("src/Heros/src/Files/Read.java"));
            String line;
            while((line=file.readLine())!= null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
