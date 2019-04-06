import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EvenOddShortVersion {

    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        String evenOdd = (n % 2 == 0) ? "even":"odd";
        String positiveNegative = (n > 0) ? "positive":"negative";

        System.out.println(positiveNegative + " " + evenOdd);

    }
}
