import java.util.Scanner;
public class percentage{
    public static void main(String[] args){
        float obtained,total,div;
        Scanner sc = new Scanner (System.in);

        System.out.println("type the marks you obtained");
        obtained = sc.nextFloat();
       
        System.out.println("type the total numbers");
        total = sc.nextFloat();
        div = ((obtained/total)*100);
        System.out.println(div);
    }
}