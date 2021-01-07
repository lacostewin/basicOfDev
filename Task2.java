import java.io.*;
import java.util.Arrays;
import java.util.stream.Stream;

public class Task2 {
        public static void task1() throws IOException {
            InputStream inputStream = System.in;
            Reader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            System.out.println("Введите первый угол треугольника");
            String x = bufferedReader.readLine();
            System.out.println("Введите второй угол треугольника");
            String y = bufferedReader.readLine();
            int z = Integer.parseInt(x) + Integer.parseInt(y);
            if (!x.matches("^[A-Za-z А-Яа-я].*$") & !y.matches("^[A-Za-z А-Яа-я].*$")) {
                if (Integer.parseInt(x) != 0 & Integer.parseInt(y) != 0)  {
                    if (Integer.parseInt(x) > 0 & Integer.parseInt(y) > 0) {
                        if (z <= 179) {
                            if (Integer.parseInt(x) == 90 || Integer.parseInt(y) == 90) {
                                System.out.println("Треугольник существует.");
                                System.out.println("Треугольник прямоугольный.");
                            } else {
                                System.out.println("Треугольник существует.");
                                System.out.println("Треугольник не прямоугольный.");
                            }
                    } else
                        System.out.println("Сумма углов не должна превышать 179 градусов!");
                } else
                    System.out.println("Треугольника не существует c отрицательным углом!");
            } else
                System.out.println("Треугольника не существует с 0 углом!");
        } else
            System.out.println("Введите число!");
        }


    public static void task2() {
        double[] ar1 = {73, 26};
        double[] ar2 = {194, 105};
        double min1 = Arrays.stream(ar1).min().orElse(0);
        double min2 = Arrays.stream(ar2).min().orElse(0);
        double[] ar0 = {min1, min2};
        double max0 = Arrays.stream(ar0).min().orElse(0);
        System.out.println(max0);
    }

    public static void task3() throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.println("Введите координаты первой точки, через запятую.");
        String a = bufferedReader.readLine();
        System.out.println("Введите координаты второй точки, через запятую.");
        String b = bufferedReader.readLine();
        System.out.println("Введите координаты третьей точки, через запятую.");
        String c = bufferedReader.readLine();
        if (!a.matches("^[A-Za-z А-Яа-я].*$") & !b.matches("^[A-Za-z А-Яа-я].*$") & !c.matches("^[A-Za-z А-Яа-я].*$")) {
            String [] stringaTokens = a.split(",");
            String [] stringbTokens = b.split(",");
            String [] stringcTokens = c.split(",");
            int[] intArra = Stream.of(stringaTokens).mapToInt(Integer::parseInt).toArray();
            int[] intArrb = Stream.of(stringbTokens).mapToInt(Integer::parseInt).toArray();
            int[] intArrc = Stream.of(stringcTokens).mapToInt(Integer::parseInt).toArray();
            if ((intArra[0] - intArrc[0]) * (intArrb[1] - intArrc[1]) - (intArrb[0] - intArrc[0]) * (intArra[1] - intArrc[1]) == 0) {
                System.out.println("Точки лежат на одной прямой.");
            } else
                System.out.println("Точки не лежат на одной прямой.");
        } else
            System.out.println("Введите число!");
    }


    public static void task4() throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.println("Введите длину стороны a отверстия.");
        String a = bufferedReader.readLine();
        System.out.println("Введите длину стороны b отверстия");
        String b = bufferedReader.readLine();
        System.out.println("Введите длину x предмета");
        String x = bufferedReader.readLine();
        System.out.println("Введите ширину y предмета");
        String y = bufferedReader.readLine();
        System.out.println("Введите высоту z предмета");
        String z = bufferedReader.readLine();
        if (!a.matches("^[A-Za-z А-Яа-я].*$") &
                !b.matches("^[A-Za-z А-Яа-я].*$") &
                !x.matches("^[A-Za-z А-Яа-я].*$") &
                !y.matches("^[A-Za-z А-Яа-я].*$") &
                !z.matches("^[A-Za-z А-Яа-я].*$")) {
            final int max = Math.max(Integer.parseInt(a), Integer.parseInt(b));
            if ((Integer.parseInt(x) <= max & Integer.parseInt(y) <= max) ||
                    (Integer.parseInt(x) <= max & Integer.parseInt(z) <= max) ||
                    (Integer.parseInt(y) <= max & Integer.parseInt(z) <= max)) {
                System.out.println("Фигура пролезет в отверстие.");
            }
            else
                System.out.println("Фигура не пролезет в отверстие!");
        } else
            System.out.println("Введите число!");
    }

    public static void task5() throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.println("Введите заначение x, при условии, что 3 < x <= 3.");
        String x = bufferedReader.readLine();
        if (!x.matches("^[A-Za-z А-Яа-я].*$")) {
            if (Double.parseDouble(x) <= 3) {
                double Fx = Math.pow(Double.parseDouble(x), 2) - 3 * Double.parseDouble(x) + 9;
                System.out.print("F(x) = " + Fx);
            } else if (Double.parseDouble(x) > 3) {
                double Fx2 = 1 / (Math.pow(Double.parseDouble(x), 3) + 6);
                System.out.print("F(x) = " + Fx2);
            } else
                System.out.print("(x) за пределами!");
        } else
            System.out.println("Введите число!");
    }
}