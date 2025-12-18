package lab5;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * <a href="https://acm.timus.ru/problem.aspx?space=1&num=1263">1263. Выборы</a><br><br>
 */

public class Task1263 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        try {
            int candidates = in.nextInt();
            int voters = in.nextInt();

            int[] votes = new int[candidates];
            while(in.hasNextInt()){
                votes[in.nextInt() - 1]++;
            }

            for (int vote : votes) {
                out.println(String.format("%.2f%%", (float) vote / voters * 100));
            }
        } finally {
            in.close();
            out.flush();
        }
    }
}
