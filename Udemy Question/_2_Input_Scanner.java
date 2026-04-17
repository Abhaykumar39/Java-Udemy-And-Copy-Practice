import java.util.Scanner;

public class _2_Input_Scanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two  number: ");
        int a=sc.nextInt();
        int b=sc.nextInt();

        System.out.println("Sum: "+(a+b));
        sc.nextLine();

        System.out.println("May I know your Name: ");
        String name=sc.nextLine();
         
        System.out.println("Welcome "+name);

        sc.close();

        //sc.useRadux() :- Base if Give sc.useRadix(2) It takes Binary number as input.Ex- 101:-5

        
    }
    
}
