import java.util.Scanner;
    public class factoral {
        public static void main(String [] args) {
            Scanner sc = new Scanner (System.in);
            System .out.println("enter the number ");
            int number = sc.nextInt();
            int a = 1;
            for(int i=1; i<=number; i++){
                a *= i;
            }
            System.out.println("factorial of " + number + " is " + a);
    
        }
    }
