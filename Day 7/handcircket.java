import java.util.Scanner;
public class handcircket {
    public static int player() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Player (enter 1-6): ");
        int z = sc.nextInt();
        return z; 
    }
    public static int cpu() {
        int z = (int)(Math.random() * 6) + 1;
        System.out.println("cpu: " + z);
        return z; 
    }
    public static void main(String[] args) {
        int tscore = 0;
        int score = 0;
        int cpuscore = 0;
        while (true) {
            score = player();
            cpuscore = cpu();
            if (score != cpuscore) {
                tscore += score;
            } else {
                System.out.println("Total score: " + tscore);
                break;
            }
        }
    }
}