import java.io.*;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Task3 {
    public static void task1() throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.println("\nВведите любое число.");
        String x = bufferedReader.readLine();
        if (!x.matches("^[A-Za-z А-Яа-я].*$")) {
            int[] n = java.util.stream.IntStream.rangeClosed(1, Integer.parseInt(x)).toArray();
            int sum = IntStream.of(n).sum();
            System.out.println("Сумма чисел от 1 до " + x + " = "+ sum + " \n или через цикл:");
            int strt = 0;
            for(int i:n) {
                strt += i;
            }
            System.out.println("Сумма чисел от 1 до " + x + " = "+ sum);
        } else
            System.out.println("Введите число!");
    }

    public static void task2() {
        int min = 1;
        int max = 2;
        int step = 1;

        for (int i = min; i<max; i = i + step) {
            if (i > 2) {
                System.out.println(i + "; ");
            } else {
                System.out.println(-i + "; ");
            }
        }
    }

    public static void task3() {
        int n;
        int x = 1;
        int summ = 0;
        while (x <= 100) {
            n =  x * x;
            x++;
            summ = (summ + n);
        }
        System.out.println("Сумма квадратов чисел от 1 до 100: "+summ);
    }

    public static void task4() {
        BigInteger n;
        BigInteger cou = BigInteger.valueOf(200);
        BigInteger x = BigInteger.ONE;
        BigInteger summ = BigInteger.ONE;
        while (!x.equals(cou)) {
            n =  x.multiply(x);
            x = x.add(BigInteger.ONE);
            summ = (summ.multiply(n));
        }
        System.out.println("Произведение квадратов чисел от 1 до 200: "+summ);
    }

    public static void task5() throws IOException{
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.println("Введите начальное число.");
        String x = bufferedReader.readLine();
        System.out.println("Введите конечное число.");
        String y = bufferedReader.readLine();
        System.out.println("Введите любое число.");
        String z = bufferedReader.readLine();
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        for (int i = Integer.parseInt(x); i <= Integer.parseInt(y); i++) {
            if ((Math.abs(Integer.parseInt(String.valueOf(i)))) >= Integer.parseInt(z)) {
                list.add(i);
            }
        }
        for (int xx : list) {
            sum = xx + sum;
        }
        System.out.println(sum);
        System.out.println(list);
    }

    public static void task6() {
        String s = "Hello, EPAM!";
        byte[] z = s.getBytes(StandardCharsets.UTF_8);
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i) + " Значение символа: " + z[i]);
        }
    }

    public static void task7() throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.println("Введите начальное число.");
        String x = bufferedReader.readLine();
        System.out.println("Введите конечное число.");
        String y = bufferedReader.readLine();

        for (int j = Integer.parseInt(x); j <= Integer.parseInt(y); j++) {
            System.out.print("Число " + j + " имеет делители: ");
            for (int i = 2; i < j; i++) {
                if (0 == (j % i)) {
                    System.out.print(i + ",");
                }
            }
            System.out.println();
        }
    }
    public static void task8() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите а: ");
        int a = in.nextInt();
        System.out.println("Введите b: ");
        int b = in.nextInt();
        int[] arr = new int[10];
        while(a != 0){
            arr[a % 10]++;
            a /=10;
        }
        while(b != 0){
            if(arr[b % 10] != 0)
                System.out.print(b % 10 + " ");
            b /=10;
        }
    }
}