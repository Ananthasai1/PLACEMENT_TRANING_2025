import java.util.Scanner;
public class reversenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        System.out.println("The original number is: " + num);
        int reverse = 0;
        while (num != 0) {
            int digit = num % 10; 
             reverse = reverse*10 + digit;
             num = num /10;

        }
         
        System.out.println("Reversed number is: " + reverse);
    }
}
