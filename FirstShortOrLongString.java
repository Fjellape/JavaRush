import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Самые-самые
*/

public class FirstShortOrLongString {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();


        for (int i = 0; i < 4; i++) {
            list.add(reader.readLine());
        }


        String minimum = list.get(0);

        for (int i = 0; i < list.size(); i++) {
            if (minimum.length() > list.get(i).length()) {
                minimum = list.get(i);
            }
        }

        //System.out.println(minimum);

        String maximux = list.get(0);


        for (int i = 0; i < list.size(); i++) {
            if (maximux.length() < list.get(i).length()) {
                maximux = list.get(i);
            }
        }

        //System.out.println(maximux);


        for (int i = 0; i < list.size(); i++) {
            if (minimum == list.get(i)) {
                System.out.println(minimum);
                break;
            } else if (maximux == list.get(i)) {
                System.out.println(maximux);
                break;
            }
        }


    }

}