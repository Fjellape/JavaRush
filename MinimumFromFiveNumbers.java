
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
Совершенствуем функциональность
*/

public class MinimumFromFiveNumbers {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        int minimum = min(a, b, c, d, e);

        System.out.println("Minimum = " + minimum);
    }


    public static int min(int a, int b, int c, int d, int e) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(a);
        numbers.add(b);
        numbers.add(c);
        numbers.add(d);
        numbers.add(e);
        int smallest = numbers.get(0);

        for (int x : numbers) {
            if (x < smallest) {
                smallest = x;
            }
        }

        return smallest;
    }
}
