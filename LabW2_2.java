package labw2_2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LabW2_2 {

    private static BufferedReader br = null;
    private static String st = null;
    private static int p = 0;
    private static String a, b;
    private static String[] s = null;
    static String pat = "public";
    static String pat1 = "private";

    private static void Work() throws FileNotFoundException, IOException {
        br = new BufferedReader(new FileReader("D:\\КПО\\LabW2_2\\LabW2_1.txt"));

        String tmp = "";
        while ((tmp = br.readLine()) != null) {// пробел использовать как разделитель 
            s = tmp.split("\\s");// вывести полученне строки 
            p = s.length;

            for (int t = 1; t < p; t++) {  //поделить на отдельные слова
                System.out.println(s[t]);
                Files.write(path, new String(Files.readAllBytes(path), StandardCharsets.UTF_8).replace(pat, pat1).getBytes(StandardCharsets.UTF_8));
            }
        }
    }

    public static void main(String[] args) {
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
