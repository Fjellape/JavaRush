public class Sum {
    public static void main(String[] args) {
        int[] list = {1, 7, 3, 2 ,3 ,4};

        int sum = 0;

        for (int i = 0; i < list.length; i++) {
            sum += list[i];
            System.out.print(sum + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
