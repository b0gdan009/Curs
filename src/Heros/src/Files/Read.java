package src.Heros.src.Files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Read {
    public static void main(String[] args) {
        try {
            FileInputStream file= new FileInputStream("src/Heros/src/Files/Read.java");
           int c = file.read();
           while((c =file.read())!= -1){
               System.out.print((char)c);
           }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
