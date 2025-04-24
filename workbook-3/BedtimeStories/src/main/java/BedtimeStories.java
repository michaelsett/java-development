import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class BedtimeStories {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("goldilocks.txt");

            Scanner scanner = new Scanner(fis);
            String line;
            int lineNumber = 1;

            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                System.out.printf(%d line, lineNumber);
                lineNumber++;
            }

            scanner.close();
        } catch (Exception e){
            System.out.println("Something went wrong!");

        }

    }
    }