package lab6;

import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * <a href="https://acm.timus.ru/problem.aspx?space=1&num=1196">1196. Экзамен по истории</a>
 */

public class Task1196 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        try {
            int teacherYearsC = in.nextInt();
            Set<String> teacherYears = new HashSet<>();

            for (int i = 0; i < teacherYearsC; i++) {
                teacherYears.add(in.next());
            }

            int studentYearsC = in.nextInt();
            int correctYears = 0;
            for (int i = 0; i < studentYearsC; i++) {
                if (teacherYears.contains(in.next())) {
                    correctYears++;
                }
            }

            out.println(correctYears);
        } finally {
            in.close();
            out.flush();
        }
    }
}
