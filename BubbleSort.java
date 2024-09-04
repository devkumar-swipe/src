    import java.util.Scanner;

    public class BubbleSort {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.println("Enter the number of elements:");
            int n = scanner.nextInt();
            int[] arr = new int[n];
            scanner.close();
            System.out.println("Enter the elements:");
            for (int i = 0; i < n; ++i) {
                arr[i] = scanner.nextInt();
            }
    
            // Bubble sort algorithm
            for (int i = 0; i < n - 1; ++i) {
                for (int j = 0; j < n - 1 - i; ++j) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
    
            System.out.println("Sorted array:");
            for (int i : arr) {
                System.out.print(i + " ");
            }
        }
    }
    

