import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task2_1 {
    public static void main(String[] args) throws IOException {
        Task1();
        Task2();
        Task3();
        Task4();
        Task5();
        Task6();
        Task7();
        Task8();
        Task9();
        Task10();
        Task2_2.Task1();
        Task2_2.Task2();
        Task2_2.Task3();
        Task2_2.Task4();
        Task2_2.Task5();
        Task2_2.Task6();
        Task2_2.Task7();
        Task2_2.Task8();
//        Task2.Task9();
//        Task2.Task10();
//        Task2.Task11();
//        Task2.Task12();
//        Task2.Task13();
//        Task2.Task14();
//        Task2.Task15();
//        Task2.Task16();
    }

    public static void Task1() {
        System.out.println("Задание 1");
        int m = 100;
        int summ = 0;
        int[] arr1 = new int[] {10, 11, 100, 32, 10, 34, 54, 100, 61, 14, 90, 16, 29, 5};
        for (int k : arr1) {     // для чтения можно использовать for такой конструкции
            for (int j = k; j == m; j++) {
                summ = summ + j;
            }
        }
        System.out.println(summ);
    }

    public static void Task2() {
        System.out.println("Задание 2");
        int z = 20;
        int y = 0;
        String[] arr = new String[] {"101", "10", "11", "100", "32", "10", "34", "54", "100", "61", "14", "90", "16", "29", "5"};
        for (int i = 0; i < arr.length; i++) {
            if (Integer.parseInt(arr[i]) > z) {
                System.out.print(arr[i].replace(arr[i], "20" + " "));
                y++;
            } else {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println("\nЧисло замен: " + y);
    }


    public static void Task3() {
        System.out.println("Задание 3");
        int zer = 0;
        int poz = 0;
        int neg = 0;
        int[] arr1 = new int[] {10, -11, 100, 32, 0, 34, -54, -100, 61, 0, 90, 16, 29, 5};
        for (int k : arr1) {     // для чтения можно использовать for такой конструкции
            if (k == 0) {
                zer++;
            } else if (k > 0) {
                    poz++;
                } else {
                    neg++;
                }
        }
        System.out.println("Нулевых значений: " + zer);
        System.out.println("Положительный значений: " + poz);
        System.out.println("Отрицательных значений: " + neg);
    }

    public static void Task4() {
        System.out.println("Задание 4");
        int[] arr = new int[] {101, 10, 11, 100, 32, 10, 34, 54, 100, -61, 14, 90, 16, 29, -5};
        int max = arr[0];
        int min = arr[0];
        int maxInd = 0;
        int minInd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max > arr[i]) {
                maxInd = i;
                max = arr[i];
            }
            if (min < arr[i]) {
                minInd = i;
                min = arr[i];
            }
        }
        int temp = arr[minInd];
        arr[minInd] = arr[maxInd];
        arr[maxInd] = temp;
        Arrays.stream(arr).forEach(e-> System.out.println(e)); //   вывод массива
        System.out.println("\n");
    }

    public static void Task5() {
        System.out.println("Задание 5");
        int[] arr = new int[] {101, 10, 11, 100, 32, 10, 34, 54, 100, -61, 14, 90, 16, 29, -5};
        for (int i = 0; i < arr.length; i++) {
            if (arr.length < arr[i]) {
                System.out.println(arr[i]);
            }
        }
        System.out.println("\n");
    }

    public static void Task6() {
        System.out.println("Задание 6");
        int[] arr = new int[] {101, 10, 2, 100, 32, 10, 34, 67, 3, 61, 14, 90, 7, 29, 5};
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 > 0 || arr[i] == 2 || arr[i] == 3) {
                res = res + arr[i];
            }
        }
        System.out.println(res + "\n");
    }

    public static void Task7() {
        System.out.println("Задание 7");
        int[] arr = new int[] {101, 10, 2, 100, 32, 10, 34, 67, 3, 61, 14, 90, 7, 29};
        int maxSum = arr[0] + arr[arr.length - 1];
        for(int i = 1; i < arr.length / 2; i++){
            if((arr[i] + arr[arr.length - i - 1]) > maxSum){
                maxSum = arr[i] + arr[arr.length - i - 1];
            }
        }
        System.out.println(maxSum);
    }

    public static void Task8() {
        System.out.println("Задание 8");
        int[] arr = new int[]{101, 10, 2, 100, 32, 10, 34, 67, 3, 61, 14, 90, 7, 29};
        for (int i = 0; i < arr.length; i++) {
            arr[i]++;
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        int minVal = Integer.MAX_VALUE;
        for (int tmp : arr) {
            minVal = Math.min(minVal, tmp);
        }
        int countMinEl = 0;
        for (int tmp : arr) {
            if (tmp == minVal) countMinEl++;
        }

        int[] newA = new int[arr.length - countMinEl];
        int indexNewArray = 0;
        for (int tmp : arr) {
            if (tmp != minVal) {
                newA[indexNewArray++] = tmp;
                System.out.print(tmp + "\t");
            }
        }
        System.out.println("\n");
    }


    public static void Task9() {
        System.out.println("Задание 9");
        int[] arr = new int[] {101, 10, 2, 100, 32, 10, 34, 67, 3, 61, 10, 90, 7, 29, 30, 10, 101, 32, 67, 10, 101};
        Map<Integer, Integer> countMap = new HashMap<>();
        for(int i = 1; i < arr.length; i++) {
            if (countMap.containsKey(arr[i])) {
                countMap.put(arr[i], countMap.get(arr[i]) + 1);
            } else {
                countMap.put(arr[i], 1);
            }
        }
        int maxKey = 0;
        int maxVal = 0;
        for (Integer i : countMap.keySet()) {
            if (countMap.get(i) > maxKey && countMap.get(i) > 1) {
                maxVal = i;
                maxKey = countMap.get(i);
            }
//            System.out.println(i + " Найдено " + countMap.get(i) + " раз");
        }
        System.out.println("Число " + maxVal + " повторяется " + maxKey + " раз.\n");
    }

    public static void Task10() {
        System.out.println("Задание 10");
        int[] arr = new int[] {101, 10, 2, -100, 32, 10, 34, 67, 3, 61, 14, 90, 7, 29};
        for(int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                System.out.print(" 0 ");
            } else {
                System.out.print(" " + arr[i] + " ");
            }
        }
        System.out.println("\n");
    }
}