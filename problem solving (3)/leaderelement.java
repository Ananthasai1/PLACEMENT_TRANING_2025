import java.util.*;
public class leaderelement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("enter the elements of array");
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Leader elements are:");
        int arr = a[n-1];
        System.out.print(arr + " ");
        for(int i = n-2; i >= 0; i--) {
            if(a[i] > arr) {
                arr = a[i];
                System.out.print(arr + " ");
            }
        }
    }
}