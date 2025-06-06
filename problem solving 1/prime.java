import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("entere the number :");
        int n = sc.nextInt();
        int temp = 0; 

        for(int i = 2; i < Math.sqrt(n); i++) {
            if(n % i == 0){
                temp = 1;
                break; 
            }
        }
        if (temp == 1) {
            System.out.println(n + " is not a prime number.");
        } else {
            System.out.println(n + " is a prime number.");
        }
    }
}