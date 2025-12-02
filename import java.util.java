import java.util.Scanner;
public class myClass {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("type fist number");
        int a = sc.nextInt();
        System.out.println("type second line");
        int b = sc.nextInt();
        int sum = a*b;

        System.out.println("the sum is "+ sum);
}
}