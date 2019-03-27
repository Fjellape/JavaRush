import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class InputNumberUsingArrayList {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < 3; i++) {
            System.out.println("Number please: ");
            String s = reader.readLine();
            list.add(s);
        }

        for (int i = 0; i < list.size(); i++) {
           int j = list.size() - i - 1;
            System.out.println(list.get(j));
        }
        //We need to use special method for ArrayList. What we used for Array, it doesnt work in ArrayList.
        System.out.println(Arrays.deepToString(list.toArray()));
    }
}
