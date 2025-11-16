import java.io.PrintWriter;
import java.util.Scanner;

/**
 * <a href="https://acm.timus.ru/problem.aspx?space=1&num=1197">1197. Один в поле воин.</a>
 * <p>
 * Условие этой задачи очень простое: вам всего лишь надо определить, сколько клеток находится под боем шахматного коня,
 * одиноко стоящего на шахматной доске. На всякий случай напомним, что конь ходит буквой «Г» — на две клетки по горизонтали
 * или вертикали в любом направлении, и потом на одну клетку в направлении, перпендикулярном первоначальному.<br>
 * <br>
 * <b>Исходные данные</b> <br>
 * В первой строке находится единственное число N, 1 ≤ N ≤ 64 — количество тестов. В каждой из последующих N строк
 * содержится очередной тест: два символа (маленькая латинская буква от 'a' до 'h' и цифра от 1 до 8) — стандартное шахматное
 * обозначение клетки, на которой стоит конь. При этом буква обозначает вертикаль, а цифра — горизонталь.
 * <br><br>
 * <b>Результат</b><br>
 * Выведите N строк: в каждой из них должно находиться единственное число — количество клеток шахматной доски, находящихся под боем коня.
 *
 */

public class Task1197 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        in.nextInt();

        try {
            while (in.hasNext()) {
                String position = in.next();
                char posX = position.charAt(0); //буква
                int posY = Character.getNumericValue(position.charAt(1)); //цифра

                int count = 0;
                count += move(posX, posY, 1, 2);
                count += move(posX, posY, -1, 2);

                count += move(posX, posY, 1, -2);
                count += move(posX, posY, -1, -2);

                count += move(posX, posY, 2, 1);
                count += move(posX, posY, 2, -1);

                count += move(posX, posY, -2, 1);
                count += move(posX, posY, -2, -1);

                out.println(count);
            }

        } finally {
            in.close();
            out.flush();
        }
    }

    private static int move (char x, int y, int moveX, int moveY) {
        char newX = (char) (x + moveX);
        int newY = y + moveY;
        if(newX >= 'a' && newX <= 'h' && newY >= 1 && newY <= 8) { return 1; }
        return 0;
    }
}
