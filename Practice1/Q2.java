package Practice1;

import java.io.*;
import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            PrintWriter writer = new PrintWriter("./Practice1/inputDataFile.txt");

            System.out.print("Name: ");
            String name = sc.nextLine();

            for (int i = 1; i <= 4; i++) {
                System.out.printf("Score %d: ", i);
                writer.println(sc.nextInt());
            }
            sc.close();
            writer.close();

            FileReader reader = new FileReader("./Practice1/inputDataFile.txt");
            Scanner scores = new Scanner(reader);
            PrintWriter averageFile = new PrintWriter("./Practice1/averageMark.txt");
            averageFile.printf("Name: %s%n", name);

            int num = 0;
            double average = 0;
            while (scores.hasNext()) {
                num++;
                int score = Integer.parseInt(scores.nextLine());
                average += score;
                averageFile.printf("Score %d: %d%n", num, score);
            }
            average /= num;
            averageFile.printf("Average: %.2f", average);

            reader.close();
            scores.close();
            averageFile.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}