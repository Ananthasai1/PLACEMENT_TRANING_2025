import java.util.Scanner;
public class greather {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int pass = 35;
        System.out.println("Name: Anantha Sai    Reg: 992200518");
        System.out.println("enter maths marks :");
        int a = sc.nextInt();
        System.out.println("enter physic marks :");
        int b = sc.nextInt();
        System.out.println(" maths "+   a+ (a >= pass ? "     pass" : "   fail"));
        System.out.println(" physic "+   b+ (b >= pass ? "     pass" : "   fail"));
        
        System.out.println("-----------------------------------------------");
        if (a >= pass && b >= pass) {
            if (a>= 90 ) {
                System.out.println("S Grade");
            }  if (a >= 80 ) {
                System.out.println("A Grade");
            }  if (a >= 70 ) {
                System.out.println("B Grade");
            }  if (a >= 60 ) {
                System.out.println("C Grade");
            }  if (a >= 50 ) {
                System.out.println("D Grade");
            } else {
                System.out.println("E Grade");
            }
             if (b>= 90 ) {
                System.out.println("S Grade");
            }  if (b >= 80 ) {
                System.out.println("A Grade");
            }  if (b >= 70 ) {
                System.out.println("B Grade");
            }  if (b >= 60 ) {
                System.out.println("C Grade");
            }  if (b >= 50 ) {
                System.out.println("D Grade");
            } else {
                System.out.println("E Grade");
            }
            
            
            System.out.println(" overal      pass");
        } else {
            
            System.out.println("overal        fail");
            System.out.println("-----------------------------------------------");
            
        }
    }
}
