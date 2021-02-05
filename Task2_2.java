import java.io.*;

public class Task2_2 {
    public static void Task1() {
        System.out.println("Задание 2.1");
        int[][] matrixA = new int[6][];
        int[][] matrixB = new int[6][];
        for (int i = 0; i < matrixA.length; i++) {
            matrixA[i] = new int[6];
            matrixB[i] = new int[6];
            for (int j = 0; j < matrixA[i].length; j++) {
                matrixA[i][j] = (int) Math.round(Math.random() * 249);
            }
        }
        System.out.println();
        for (int i = 0; i < matrixB.length; i++) {
            for (int j = 0; j < matrixB[i].length; j++) {
                matrixB[i][j] = matrixB[j][i];
            }
        }
        for (int i = 0; i < matrixB.length; i++) {
            for (int j = 0; j < matrixB[i].length; j++) {
                if (j % 2 == 0 & matrixB[0][i] < matrixA[matrixA.length - 1][i]) {
                    System.out.print(matrixA[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void Task2() {
        System.out.println("Задание 2.2");
        int len = 6;
        int[][] matrixA = new int[len][len];
        for (int i = 0; i < len; i++) {
            matrixA[i][i] = (int) Math.round(Math.random() * 249);
        }
            for (int i = 0; i < len; i++) {
                for (int j = 0; j < len; j++) {
                    System.out.print(matrixA[i][j] + " ");
                }
                System.out.println();
        }
        System.out.println();
    }

    public static void Task3() {
        System.out.println("Задание 2.3");
        int len = 6;
        int[][] matrixA = new int[len][len];

        for (int i = 0; i < matrixA.length; i ++) {
            for (int j = 0; j < matrixA.length; j++) {
                matrixA[i][j] = (int) Math.round(Math.random() * 249);
                if (j == 2) {
                    System.out.print(matrixA[i][j] + "\t");
                }
                if (i == 4) {
                    System.out.print(matrixA[i][j] + "\t");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void Task4() {
        System.out.println("Задание 2.4");
        int len = 6;
        int[][] matrixA = new int[len][len];

        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA.length; j++) {
                if (i % 2 == 0) {
                    matrixA[i][j] = j + 1;
                } else {
                    matrixA[i][j] = len - j;
                }
                System.out.print(matrixA[i][j] + "\t");
            }
            System.out.println();
        }
    }


    public static void Task5() {
        System.out.println("\nЗадание 2.5");
        int len = 7;
        int[][] matrixA = new int[len][len];

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (j == len - 1 - i || i < len / 2 - j + 3) {
                    matrixA[i][j] = 1 + i;
                }
            }
        }
        for (int[] ints : matrixA) {
            for (int j = 0; j < ints.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void Task6() {
        System.out.println("Задание 2.6");
        int len = 7;
        int[][] matrixA = new int[len][len];

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (j == i || j == len - 1 - i)
                    matrixA[i][j] = 1;
            }
        }
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                System.out.print(matrixA[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }


    public static void Task7() {
        System.out.println("Задание 2.7");
        int count = 0;
        double len = 9.0;
        double[][] matrixA = new double[(int) len][(int) len];
        for (double i = 0; i < matrixA.length; i ++) {
            for (double j = 0; j < matrixA.length; j++) {
                matrixA[(int) i][(int) j] = Math.sin((i * i - j * j) / len);
                    System.out.print(matrixA[(int) i][(int) j] + "\t");
                    if (matrixA[(int) i][(int) j] > 0) {
                        count++;
                    }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Положительных чисел: " + count);
    }

    public static void Task8() throws IOException {
        System.out.println("\nЗадание 2.8");
        System.out.println("Дана матрица 10 x 10. Введите номера столбцов которые нужно поменять местами.");
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.println("Номер первого столбца:");
        String x = bufferedReader.readLine();
        System.out.println("Номер второго столбца:");
        String y = bufferedReader.readLine();

        int len = 6;
        int[][] matrixA = new int[len][len];

        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA.length; j++) {
                if (i % 2 == 0) {
                    matrixA[i][j] = j + 1;
                } else {
                    matrixA[i][j] = len - j;
                }
                System.out.print(matrixA[i][j] + "\t");
            }
            System.out.println();
        }
    }
}