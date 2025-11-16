import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * <a href="https://acm.timus.ru/problem.aspx?space=1&num=1100">1100. Таблица результатов.</a>
 * <p>
 * Старое программное обеспечение для проведения соревнований использует пузырьковую сортировку для создания таблицы
 * результатов. Однако сейчас команд слишком много, и программное обеспечение работает слишком медленно. Вас попросили
 * написать программу, которая создаёт такую же таблицу результатов, как и старое программное обеспечение, но быстро.<br>
 * <br>
 * <b>Исходные данные</b> <br>
 * Первая строка входных данных содержит только целое число 1 < N ≤ 150 000 — количество команд. Каждая из следующих
 * N строк содержит два целых числа: 1 ≤ ID ≤ 107 и 0 ≤ M ≤ 100. ID — уникальный номер команды, а M — количество решённых
 * этой командой задач.
 * <br><br>
 * <b>Результат</b><br>
 * Вывод должен содержать N строк с двумя целыми числами ID и M в каждой. Строки должны идти по убыванию M в порядке,
 * полученном с помощью пузырьковой сортировки (см. ниже).
 * <br><br>
 * <b>Замечания</b><br>
 * Пузырьковая сортировка работает следующим образом:
 * пока существуют A[i] и A[i+1], такие что A[i] < A[i+1],
 *    обменять(A[i], A[i+1]);
 */

public class Task1100 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int teamsCnt = in.nextInt();

        @SuppressWarnings("unchecked")
        ArrayList<Integer>[] teams = new ArrayList[101]; // id, ArrayList(i1, i2...)
        try {
            for (int i = 0; i <= 100; i++) {
                teams[i] = new ArrayList<>();
            }

            for (int i = 0; i < teamsCnt; i++) {
                int id = in.nextInt();
                int score = in.nextInt();
                teams[score].add(id);
            }

            for (int j = 100; j >= 0 ; j--) {
                for (Integer i : teams[j]) {
                    out.println(String.format("%d %d", i, j));
                }
            }
        } finally {
            in.close();
            out.flush();
        }
    }
}
