import java.util.Arrays;

public class TwoSumSorted {
    public static int[] twoSum(int[] arr, int target) {
        int left = 0, right = arr.length - 1; // Correct variable declaration

        while (left < right) {
            int currentSum = arr[left] + arr[right];

            if (currentSum == target) {
                return new int[]{left, right}; // Return indices if sum matches
            } else if (currentSum < target) {
                left++; // Move left pointer forward
            } else {
                right--; // Move right pointer backward
            }
        }

        return new int[]{}; // Return an empty array if no pair is found
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 4;

        int[] result = twoSum(arr, target);

        if (result.length > 0) {
            System.out.println("Indices: " + Arrays.toString(result)); // Fixed: Imported Arrays
        } else {
            System.out.println("No pair found.");
        }
    }
}
