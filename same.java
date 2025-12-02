import java.util.Scanner;
public class same{
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int n;
        System.out.println("please type the  number you want");
        n = sc.nextInt();
        if(n%2==0){
            System.out.println("the number is even");
            
        }else{
            System.out.println("the number is odd");
        }
        
    }
}