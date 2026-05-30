
import java.util.Scanner;

public class avg {
    public static void main(String[] args) {
        System.out.println("enter the size of array:");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] numbers = new int[size];

        System.out.println("Enter the values in array:");
        int sum = 0;
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
            sum += numbers[i];
        }
        float avg = (float) sum / size;
        System.out.println("Average of array elements: " + avg);
        sc.close();
    }
}