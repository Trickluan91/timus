import java.io.PrintWriter;
import java.util.Scanner;

/**
 * <a href="https://acm.timus.ru/problem.aspx?space=1&num=1787">1787. Поворот на МЕГУ</a><br><br>
 */

public class Task1787 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            int carsPerMinute = in.nextInt();
            int remainingTime = in.nextInt();
            int allCars = 0;

            for (int i = 0; i < remainingTime; i++) {
                allCars = Math.max((allCars + in.nextInt()) - carsPerMinute, 0);
            }

            out.println(allCars);
        } finally {
            in.close();
            out.flush();
        }
    }
}
