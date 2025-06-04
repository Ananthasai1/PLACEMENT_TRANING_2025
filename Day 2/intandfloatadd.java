import java.util.Scanner;
public class intandfloatadd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter an integer: ");
        int intValue = sc.nextInt();

        System.out.print("Enter a float: ");
        float floatValue = sc.nextFloat();
        float sum = intValue + floatValue;
        System.out.println("The sum of " + intValue + " and " + floatValue + " is: " + sum);

        
        sc.close();
        // anthor code single print means 10 only duble means 11
        int a = 10;
        System.out.println(a++);
        System.out.println(a++);
    }
}
