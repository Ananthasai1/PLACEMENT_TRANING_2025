import java.util.Scanner;
 public class switchcase {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter swithch number: ");
        int number = sc.nextInt();
        switch (number) {
            case 1:
                System.out.println("fan ");
                break;
            case 2:
                System.out.println("ac ");
                break;
            case 3:
                System.out.println("tv ");
                break;
            default:
                System.out.println("Invalid option selected");
        }
    
    }
}