package lab7;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * <a href="https://acm.timus.ru/problem.aspx?space=1&num=1893">1893. A380</a>
 */

public class Task1893 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        try {
            String seat = in.nextLine();
            int row = Integer.parseInt(seat.substring(0, seat.length() - 1));
            char col = seat.charAt(seat.length() - 1);

            if(row < 3) {
                if(col == 'A' || col == 'D') out.println("window");
                else out.println("aisle");
            } else if(row < 21) {
                if(col == 'A' || col == 'F') out.println("window");
                else out.println("aisle");
            } else {
                if(col == 'A' || col == 'K') out.println("window");
                else if(col == 'C' || col == 'D' || col == 'G' || col == 'H') out.println("aisle");
                else out.println("neither");
            }
        } finally {
            in.close();
            out.flush();
        }
    }
}
