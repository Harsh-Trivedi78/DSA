public class RotateArray {
    public static void rotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // Handle cases where k is greater than n
        int[] rotated = new int[n]; // Fixed spelling

        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = arr[i];
        }

        for (int i = 0; i < n; i++) {
            arr[i] = rotated[i];
        }
    }

    // Utility method to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3; // Number of positions to rotate

        System.out.println("Original Array:");
        printArray(arr); // Print before rotation

        rotateArray(arr, k);

        System.out.println("Rotated Array:");
        printArray(arr); // Print after rotation
    }
}
