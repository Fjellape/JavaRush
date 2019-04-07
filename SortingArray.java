
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*
Числа по возрастанию
*/

public class SortingArray {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int number = Integer.parseInt(reader.readLine());
            numbers.add(0, number);
        }

        //using Collection to sort our ArrayList
        Collections.sort(numbers);

        //using Interpreter go through all list
        System.out.println(numbers);
        for (int counter : numbers) {
            System.out.println(counter);
        }

    }
}
