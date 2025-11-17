import java.io.PrintWriter;
import java.util.Scanner;

/**
 * <a href="https://acm.timus.ru/problem.aspx?space=1&num=2100">2100. Свадебный обед</a><br><br>
 */

public class Task2100 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            int invites = in.nextInt(), people = 2;
            for (int i = 0; i < invites; i++) {
                people += in.next().contains("+") ? 2 : 1;
            }
            out.println(people == 13 ? 14 * 100 : people * 100);
        } finally {
            in.close();
            out.flush();
        }
    }
}
