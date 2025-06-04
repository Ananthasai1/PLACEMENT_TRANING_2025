import java.util.Scanner;
public class largestnumber {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of element:");
    int num1 = sc.nextInt();
     String[] number = new String[num1];
    System.out.println("Enter the numbers:");
    for (int i = 0; i < num1; i++) {
        number[i] = sc.next();

       }
       int max = Integer.MIN_VALUE;
       for (String num : number) {
             max = Math.max(max, Integer.parseInt(num));
           }
         System.out.println("Largest number is: " + max);
       }
    }


    