
/*
Описываем числа
*/

import java.io.*;

public class EvenOddHowManyDigits {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(reader.readLine());

        //possible numbers can be 1-999
        if (number < 1000 && number > 0 ) {


        String evenOdd = (number % 2 == 0) ? "even":"odd";

        int length = String.valueOf(number).length();


        if (length == 1) {
            System.out.println(evenOdd + " 1 digits");
        } else if (length == 2) {
            System.out.println(evenOdd + " 2 digits");
        } else
            System.out.println(evenOdd + " 3 digits");
        }
    }
}
