import java.util.Scanner;

public class _1_Sum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Number: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("Sum is: " + (num1 + num2));

        sc.close();

    }

}
