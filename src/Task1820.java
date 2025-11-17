import java.io.PrintWriter;
import java.util.Scanner;

/**
 * <a href="https://acm.timus.ru/problem.aspx?space=1&num=1820">1820. Уральские бифштексы</a><br><br>
 */

public class Task1820 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            int steaks = in.nextInt(), threads = in.nextInt();
            float time = (float) (steaks * 2) / threads;
            out.println(Math.max(((int) Math.ceil(time)), 2));
        } finally {
            in.close();
            out.flush();
        }
    }
}
