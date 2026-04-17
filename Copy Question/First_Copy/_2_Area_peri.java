import java.util.Scanner;

public class _2_Area_peri {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length and Breadth of Rectangle: ");
        int Length=sc.nextInt();
        int Breadth=sc.nextInt();

        System.out.println("Area of Rectangle is: "+(Length*Breadth));
        System.out.println("Perimetre of Rectangle: "+(2*(Length+Breadth)));

        System.out.println("Enter the Radius: ");
        int Radius=sc.nextInt();
        System.out.println("Area of Circle: "+ Math.PI*Radius*Radius);
        System.out.println("Perimetre of Circle: "+2*Math.PI*Radius);

        sc.close();
    }
    
}
