import java.util.Scanner;
public class muitiplication {
    public static void main(String [] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the number :");
        int number = sc.nextInt();
          for( int i=0; i<10; i++) {
            System.out.println(number+ " * " + i + "= " +(number * i));
          }

    }
    
}
