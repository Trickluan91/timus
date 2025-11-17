import java.io.PrintWriter;
import java.util.Scanner;

/**
 * <a href="https://acm.timus.ru/problem.aspx?space=1&num=2001">2001. Математики и ягоды</a><br><br>
 */

public class Task2001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            int a = in.nextInt(), b = in.nextInt();
            int c = in.nextInt(), d = in.nextInt();
            int e = in.nextInt(), f = in.nextInt();

            out.println(String.format("%d %d", a - e, b - d));
        } finally {
            in.close();
            out.flush();
        }
    }
}
