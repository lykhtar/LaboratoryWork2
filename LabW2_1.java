package labw2_1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LabW2_1 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader br = null;
        String st = null;
        int p = 0;
        String a, b;
        String[] s = null;
        try {
            br = new BufferedReader(new FileReader("D:\\КПО\\LabW2_1\\z1.txt"));
            String tmp = "";
            while ((tmp = br.readLine()) != null) {// пробел использовать как разделитель 
                s = tmp.split("\\s");// вывести полученне строки 
                p = s.length;
                for (int t = 1; t < p; t++) {  //поделить на отдельные слова
                    String res = s[t - 1];//взять первое слово
                    String res1 = s[t];//взять следующее за ним слово
                    char[] la = res.toCharArray();//разбить первое слово на символы
                    char[] la1 = res1.toCharArray();//разбить второе слово на символы
                    a = Character.toString(la[res.length() - 1]);//перевести последний символ первого слова в троку
                    b = Character.toString(la1[0]);//перевести первый символ сторого слова в строку
                    if (a.equals(b)) {//если последний и первый строки равны
                        System.out.println(s[t - 1]);//вывести первое слово
                    }
                }
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
