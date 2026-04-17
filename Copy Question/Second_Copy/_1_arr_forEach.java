public class _1_arr_forEach {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5 };
        int sum = 0;
        for (int a : arr) {
            sum += a;
        }
        System.out.println("Sum: " + sum);
    }

}
