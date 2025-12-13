package lab4;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * <a href="https://acm.timus.ru/problem.aspx?space=1&num=2056">2056. Стипендия</a><br><br>
 */

public class Task2056 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        try {
            int exams = in.nextInt();
            int sum = 0;
            for (int i = 0; i < exams; i++) {
                int grade = in.nextInt();
                if (grade == 3) {
                    out.println("None");
                    return;
                }

                sum += grade;
            }

            float GPA = ((float) sum) / exams;
            if(GPA == 5.0){
                out.println("Named");
            } else if(GPA >= 4.5) {
                out.println("High");
            } else {
                out.println("Common");
            }
        } finally {
            in.close();
            out.flush();
        }
    }
}
