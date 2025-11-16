import java.io.PrintWriter;
import java.util.Scanner;

/**
 * <a href="https://acm.timus.ru/problem.aspx?space=1&num=1785">1785. Трудности локализации.</a>
 * <p>
 * Компания Lavin Interactive, разработчик пошаговой стратегии Losers-V, постоянно расширяет рынки сбыта и создаёт
 * локализации своей игры даже на самые малоизвестные языки. В том числе, их заинтересовал язык племени австралийских
 * аборигенов аниндилъяква.
 * Но в языке аниндилъяква нет числительных. Как же, например, перевести на него фразу «у вас семь чёрных драконов,
 * а у вашего врага — сорок»? Локализаторы решили перевести её так: «у вас немного чёрных драконов, а у вашего врага —
 * толпа». Они составили таблицу, в которой указали правила замены чисел, обозначающих количество монстров, на
 * существительные и местоимения:
 * <table border="1" cellspacing="0" cellpadding="6">
 *   <thead>
 *       <tr>
 *         <th>Количество</th>
 *         <th>Обозначение на русском языке</th>
 *         <th>Обозначение на языке аниндилъяква</th>
 *       </tr>
 *   </thead>
 *   <tbody>
 *       <tr><td>от 1 до 4</td><td>несколько</td><td>few</td></tr>
 *       <tr><td>от 5 до 9</td><td>немного</td><td>several</td></tr>
 *       <tr><td>от 10 до 19</td><td>отряд</td><td>pack</td></tr>
 *       <tr><td>от 20 до 49</td><td>толпа</td><td>lots</td></tr>
 *       <tr><td>от 50 до 99</td><td>орда</td><td>horde</td></tr>
 *       <tr><td>от 100 до 249</td><td>множество</td><td>throng</td></tr>
 *       <tr><td>от 250 до 499</td><td>сонмище</td><td>swarm</td></tr>
 *       <tr><td>от 500 до 999</td><td>полчище</td><td>zounds</td></tr>
 *       <tr><td>от 1000</td><td>легион</td><td>legion</td></tr>
 *   </tbody>
 * </table>
 * Помогите локализаторам автоматизировать процесс — напишите программу, которая по количеству монстров выдаст
 * соответствующее этому количеству слово.<br>
 * <br>
 * <b>Исходные данные</b> <br>
 * В единственной строке записано целое число n (1 ≤ n ≤ 2000) — количество монстров.
 * <br><br>
 * <b>Результат</b><br>
 * Выведите слово, соответствующее данному количеству монстров на языке аниндилъяква.
 *
 */

public class Task1785 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            while (in.hasNext()) {
                int monsters = in.nextInt();
                if (monsters <= 4) out.println("few");
                else if (monsters <= 9) out.println("several");
                else if (monsters <= 19) out.println("pack");
                else if (monsters <= 49) out.println("lots");
                else if (monsters <= 99) out.println("horde");
                else if (monsters <= 249) out.println("throng");
                else if (monsters <= 499) out.println("swarm");
                else if (monsters <= 999) out.println("zounds");
                else out.println("legion");
            }
        } finally {
            in.close();
            out.flush();
        }
    }
}
