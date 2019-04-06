
/*
Положительные и отрицательные числа
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EvenOddLongVersion {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please insert number below");
        int number = Integer.parseInt(reader.readLine());

        if (number == 0) {
            System.out.println("ноль");
        }

        else if (number % 2 == 0) {
            if (number > 0) {
                System.out.println("положительное четное число");
            } else
                System.out.println("отрицательное четное число");
        }

        else if ((Math.abs(number)) % 2 == 1) {
            if (number > 0 ) {
                System.out.println("положительное нечетное число");
            } else
                System.out.println("отрицательное нечетное число");
        }
        else
            System.out.println("Error");

    }
}

