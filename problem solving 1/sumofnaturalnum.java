import java.util.Scanner;
public class sumofnaturalnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.err.println("sum of natural number of  "+ n + " is " +(n*(n+1))/2 );

        
    }
    
}
