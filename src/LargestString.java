import java.util.ArrayList;

public class LargestString {
    public static void main(String[] args) {


        //Created ArrayList String
        ArrayList<String> list = new ArrayList<String>();

        //Adding elements into String array
        list.add("name of ");
        list.add("3                                   ");
        list.add("22222           ");

        //Variable for storage size
        int largestString = list.get(0).length();
        int index = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() > largestString) {
                largestString = list.get(i).length();
                index = i;

            }
        }

        System.out.println("Largest String is: " + list.get(index) + ". Score is: " + largestString);
    }
}
