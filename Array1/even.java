package Array1;
import java.util.Scanner;
public class even {
    public static void main (String[] args){
        System.out.println("enter the size of array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("enter the values:");
        for(int i=0; i<size; i++){
             arr[i] = sc.nextInt();       
        }
        
        for(int i=0; i<size; i++){
        if(arr[i] % 2 ==0 ){
        System.out.println("the even no. are: "+ arr[i]);
        }
    }
        sc.close();
    }
}
