import java.util.Scanner;
public class sumofdigitofnumbers {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = Sc.nextInt();
        System.out.println("The original number is: " + num);
        int sum = 0;
        while (num != 0) {
            int digit = num % 10; 
            sum += digit; 
            num = num / 10; 
        }
        
        System.out.println("Sum of digits is: " + sum);
    }
    
}
