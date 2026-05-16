package Array1;
import java.util.Scanner;
public class positive {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();
        int num[] = new int[size];

        System.out.println("enter the elements");
        int a = 0;
        for(int i=0; i<size; i++){
            num[i] = sc.nextInt();
            if(num[i] > 0){
                a++;
            }
    }
    System.out.print("positive numbers are : "+ a);
    sc.close();
 }
}
