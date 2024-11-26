import java.util.Arrays;
import java.util.Scanner;

public class Sort_6_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array;

        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();
        array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));

        int sum = 0;
        for (int num : array) {
            sum += num;
        }


        double average = (double) sum / array.length;

        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + average);

    }
}
