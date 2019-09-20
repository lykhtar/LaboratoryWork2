package labw2_5;

import java.util.Scanner;

public class LabW2_5 {
//является ли числом
    public static boolean checkString(String string) {
        try {
            Integer.parseInt(string);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Введите строку");
        Scanner in = new Scanner(System.in);
        int num = 0, max = 0;
        String input = in.nextLine();
        int p = input.length();//длина строки
        while (p != 0) {// пробел использовать как разделитель   
            String[] s = input.split("\\s");// вывести полученне строки 
            for (int i = 0; i < s.length; i++) {  //поделить на отдельные слова
                p = p - 2;
                String res = s[i];
                if (checkString(res) == true) {
                    num++;
                } else {
                    if (num > max) {
                        max = num;
                        num = 0;
                    }
                }
            }
        }
        System.out.println("Наибольшее число подряд идущих цифр=" + max);
    }
}
