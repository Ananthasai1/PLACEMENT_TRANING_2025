import java.util.Scanner;
public class largenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp =0;

        for(int i = 0; i < 3; i++) {
            System.out.println("Enter the number " + (i + 1) + ":");
           int z =sc.nextInt();
           if(temp < z) {
               temp = z;              
            }
            System.out.println("the largest number is :" +temp);
        }
    }
}
