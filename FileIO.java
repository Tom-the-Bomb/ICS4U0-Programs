
import java.io.*;

public class FileIO {
    public static void main(String[] args) {
        try {
            PrintWriter output = new PrintWriter("output.txt");

            output.print("test1");
            output.println("test2");
            output.println("test3");

            output.close();

            System.out.printf("[%10s%7s", "Done", "]");
        } catch(Exception err) {
            err.printStackTrace();
        }
    }
}