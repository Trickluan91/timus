import java.io.PrintWriter;
import java.util.Scanner;

/** <a href="https://acm.timus.ru/problem.aspx?space=1&num=1264">1264. Трудовые будни</a><br><br>
 */

public class Task1264 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            int n = in.nextInt();
            int m = in.nextInt();
            out.println(n * (m + 1));
        } finally {
            in.close();
            out.flush();
        }
    }
}
