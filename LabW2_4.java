package labw2_4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class LabW2_4 {

    private static BufferedReader br = null;
    private static String st = null;
    private static int p = 0;
    private static String a, b;
    private static String[] s = null;
    private static String pat = "son";//строка образец

    private static void Work() throws FileNotFoundException, IOException {
        br = new BufferedReader(new FileReader("D:\\КПО\\LabW2_4\\z1.txt"));
        String tmp = "";
        System.out.println("Последовательность строк:");//вывести последовательности строк
        while ((tmp = br.readLine()) != null) {// пробел использовать как разделитель 
            s = tmp.split("\\s");// вывести полученне строки 
            p = s.length;
            System.out.println(tmp);
            for (int t = 0; t < p; t++) {  //поделить на отдельные слова
                String res = s[t];
                Find(res);

            }
        }
    }
    
//метод для поиска слова и записи его в новый файл
    private static void Find(String res) throws FileNotFoundException, IOException {
        if (res.equals(pat)) {
            File file = new File("z2.txt");
            //проверяем, что если файл не существует то создаем его
            if (!file.exists()) {
                file.createNewFile();
            }
            PrintWriter out = new PrintWriter(file.getAbsoluteFile());
            //записать слово в файл
            out.print(res + "\n");
        }
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {
        try {
            Work();
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
