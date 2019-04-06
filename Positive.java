
/* 
Цель установлена!
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class Positive {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String koordin1 = reader.readLine();
        String koordin2 = reader.readLine();
        String koordin3 = reader.readLine();

        int a = Integer.parseInt(koordin1);
        int b = Integer.parseInt(koordin2);
        int c = Integer.parseInt(koordin3);

        List<Integer> numbers = new ArrayList<>();


            numbers.add(a);
            numbers.add(b);
            numbers.add(c);

        List<Integer> positiveNumbers = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) > 0) {
                positiveNumbers.add(numbers.get(i));
            }
        }


        System.out.println(positiveNumbers.size());


    }
}
