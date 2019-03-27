import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;

public class InputNumberUsingArray {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] list = new String[3];

        for (int i = 0; i < list.length; i++) {

            System.out.println("Write a number: ");
            String s = reader.readLine();
            list[i] = s;
        }

        System.out.println(Arrays.toString(list));

        for (int i = 0; i < list.length; i++) {
            int j = list.length - i - 1;
            System.out.println(list[j]);

        }
    }
}
