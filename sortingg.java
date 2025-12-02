import java.util.Scanner;
public class sortingg{
    public static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
            
        }
        System.out.println();
    }
    public static void main (String[]args){
        int arr[] = {1,5,3,7,4,6,8,4,9,4,8,};
        for(int i=0;i<arr.length-1;i++){
            
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    
                
            
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
        }
    }
}
        printarray(arr);
    }
}
    