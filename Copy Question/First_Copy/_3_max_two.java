import java.util.Scanner;

public class _3_max_two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two number: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();

        if(num1>num2)
        {
            System.out.println(num1+" is greater");
        }
        else{
            System.out.println(num2+" is greater");
        }

        System.out.println("Max number is : "+Math.max(num1, num2));

        sc.close();
    }
    
}
