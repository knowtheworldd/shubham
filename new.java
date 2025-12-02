import java.util.Scanner;
public class New{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
            System.out.println("enter number you obtained");
            int a = sc.nextInt();
            System.out.println("enter total number");
            int b = sc.nextInt();
            int c = ((a/b)*100);
            System.out.println(c);

        }
    }
