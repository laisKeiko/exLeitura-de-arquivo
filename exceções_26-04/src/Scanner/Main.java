import java.io.*;
import java.util.*;

public class Main {
    public static void main(String [] args) throws IOException {
        String fileName = "my-file.txt";
        Scanner scan = new Scanner(new File(fileName));
        while(scan.hasNextLine()){
            String line = scan.nextLine();
            System.out.println(line);
        }
    }
}