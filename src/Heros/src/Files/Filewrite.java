package src.Heros.src.Files;

import java.io.FileWriter;
import java.io.IOException;

public class Filewrite {
    public static void main(String[] args) {
        try {
            FileWriter file = new FileWriter("test.txt");
            file.write("Hello Java");
            file.write(" Hello Java 2");
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
