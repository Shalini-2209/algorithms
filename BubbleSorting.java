import java.util.Arrays;
import java.util.Scanner;

class SortMethod {
    int iCount = 0;
    int rCount = 0;

    void bubbleSortRecursive(int arr[], int n) {
        rCount += 1;
        if (n == 1)
            return;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        bubbleSortRecursive(arr, n - 1);
    }

    void bubbleSortIterative(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                iCount++;
            }
        }
    }

    public void timeComplexity(int n) {
        //System.out.print(rCount);
        if (rCount == n) {
            System.out.println("\nTime complexity of recursive function is O(N)");
        }

        if (iCount == (n*(n-1)/2)){
            System.out.println("\nTime complexity of iterative function is O(N^2)");
        }
    }
}

public class BubbleSorting{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        SortMethod m = new SortMethod();
        System.out.println("BUBBLE SORT");
        System.out.println("-----------");
        System.out.println("Enter the length of an array: ");
        int size = scan.nextInt();

        int[] array = new int[size];

        for(int i=0; i<size; i++){
            System.out.println("Enter element " + i + ":");
            array[i] = scan.nextInt();
        }
        System.out.println("Sorted array Using Recursion: ");
        m.bubbleSortRecursive(array, size);
        System.out.println(Arrays.toString(array));


        System.out.println("Sorted array Using Iteration: ");
        m.bubbleSortIterative(array, size);
        System.out.println(Arrays.toString(array));

        m.timeComplexity(size);

    }
}




