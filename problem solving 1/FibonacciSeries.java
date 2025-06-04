import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the number");
        int a = sc.nextInt();
        int first = 1, second = 1;
        System.out.println(first);
        System.out.println(second);
        for (int i=3; i<=a; i++) 
        {
            int next = first + second;
            System.out.println(next);
            first = second;
            second = next;
        }



    }
    
}
