import java.util.Scanner;
public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m=5;
        
       for(int i=1;i<=n;i++){
        for(int j=1;j<=m;j++){
            if(i==1||j==1||n==1||m==i){

            
            System.out.print("*");

        }else{
            System.out.println(" ");
        }
    }
    }
       System.out.println();
    }


}