public class AorB {

    public static int min(int a, int b, int c, int d) {
        int[] list = new int[4];

        list[0] = a;
        list[1] = b;
        list[2] = c;
        list[3] = d;

        int minimum = list[0];



        for (int i = 0; i < list.length; i++) {
            if (list[i] < minimum )
                minimum = list[i];
        }

        return minimum;
    }

    public static void main(String[] args) {

        System.out.println(min(80, 0, 42, 2));


    }
}
