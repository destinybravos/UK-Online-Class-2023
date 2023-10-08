import java.util.Scanner;

public class HelloRGU {
    public static void main(String[] args) {
        String st1 = "Welcome to ";        
        String st2 = "Object Oreinted Programming";
        
        System.out.print(st1);
        System.out.println(st2);

        /** 
         * Instatiating (Creating) an object of the Sccanner Class
         * This object is used to recieve input from the user and store them.
         */
        Scanner input = new Scanner(System.in);

        double x, y, z;
        double result;

        System.out.println("Enter a value for x");
        x =  input.nextDouble();
        System.out.println("Enter a value for y");
        y =  input.nextDouble();
        System.out.println("Enter a value for z");
        z =  input.nextDouble();

        result = x * y  * z;

        System.out.printf("Result is: %.2f", result);
    }
}
