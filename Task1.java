import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Task1 {
    private static String[] str;

    public static void main (String[] args) throws IOException {
        System.out.println("Task 1");
        int a = 1;
        int b = 3;
        int c = 5;
        int z = ((a - 3) * b / 2 ) + c;
        System.out.println(z);
        task2();
        task3();
        task4();
        task5();
        task6();
        Task2.task1();
        Task2.task2();
        Task2.task3();
        Task2.task4();
        Task2.task5();
        Task3.task1();
        Task3.task2();
        Task3.task3();
        Task3.task4();
        Task3.task5();
        Task3.task6();
        Task3.task7();
        Task3.task8();
    }

public static void task2 () {
        double b = 2;
        double a = 4;
        double c = 6;
        double z = b + Math.sqrt((b * b) + (4 * a * c)) / 2 * a - (Math.pow(a,3) * c) + Math.pow(b, -2);
    System.out.println(z);
}

    public static void task3 () {
        double x = 4;
        double y = 6;
        double z = Math.sin(x) + Math.cos(y) / Math.sin(x) - Math.cos(y);
        System.out.println(z);
    }

    public static void task4 () {
        Double x = 482.916;
        StringBuffer rev = new StringBuffer(((Object)x).toString()).reverse();
        System.out.println(x);
        System.out.println(rev);
        String rev2 = x.toString().replaceAll("482", "916");
        System.out.println(rev2.replaceAll(".916", ".482"));
    }

    public static void task5 () {
        long datex = 1601511261868L;
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date(datex);
        System.out.println(formatter.format(date));
    }

    public static void task6 () throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.println("Введите число x");
        String x = bufferedReader.readLine();
        System.out.println("Введите число y");
        String y = bufferedReader.readLine();
        if (!x.matches("^[A-Za-z А-Яа-я].*$")) {
            if (Integer.parseInt(x) <= 4 & Integer.parseInt(y) <= 4 && Integer.parseInt(x) >= -4 & Integer.parseInt(y) >= -3) {
                if (Integer.parseInt(x) >= -2 ) {
                    if (Integer.parseInt(x) <= 2 ) {
                            System.out.println("Точка в заданной области.");
                        } else
                            System.out.println("Точка не в заданной области!");
                    } else
                        System.out.println("Точка не в заданной области!");
                } else
                    System.out.println("Точка не в заданной области!");
        } else
            System.out.println("Введите именно число!");
    }
}