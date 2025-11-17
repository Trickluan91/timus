import java.io.PrintWriter;
import java.util.Scanner;

/**
 * <a href="https://acm.timus.ru/problem.aspx?space=1&num=2066">2066. Простое выражение</a><br><br>
 */

public class Task2066 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            int a = in.nextInt(), b  = in.nextInt(), c = in.nextInt();
            int answer = a - b * c, answer2 = a - b - c;
            out.println(Math.min(answer, answer2));
        } finally {
            in.close();
            out.flush();
        }
    }
}
