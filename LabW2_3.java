package labw2_3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LabW2_3 {

    private static BufferedReader br = null;
    private static int p = 0;
    private static String[] s = null;
    public static int array[][] = null;
//чтение матрицы из файла

    private static void aWork(int p) throws FileNotFoundException, IOException {
        System.out.println("Исходная матрица:");
        br = new BufferedReader(new FileReader("D:\\КПО\\LabW2_3\\matr.txt"));
        array = new int[p][p]; // создали массив который вернем из метода
        for (int i = 0; i < p; i++) {
            String[] strArr = br.readLine().trim().split(" ");
            for (int j = 0; j < p; j++) {
                array[i][j] = Integer.parseInt(strArr[j]);
                System.out.print("  " + array[i][j]);
            }
            System.out.println();
        }
    }
//транспонирование матрицы

    public static void Transp(int[][] array1) {
        System.out.println("Транспонированная матрица:");
        int[][] array = array1.clone();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
                System.out.print(" " + array[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        try {
            br = new BufferedReader(new FileReader("D:\\КПО\\LabW2_3\\matr.txt"));
            String tmp = "";
            while ((tmp = br.readLine()) != null) {// пробел использовать как разделитель 
                s = tmp.split("\\s");// вывести полученне строки 
                p = s.length;
                aWork(p);
                System.out.println();
                Transp(array);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();

                }
            }
        }

    }
}
