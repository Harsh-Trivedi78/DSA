
//Brute force

import java.util.Arrays;

public class TwoSum {
    public int[] TwoSum (int[] nums, int target) {
        int n = nums.length;
        for(int i  = 0 ; i < n ; i++){
            for(int j = i+1 ; j< n ; j++){
                if(nums[i] + nums[j] == target){
                    return new int[] {i , j};
                }
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;

        TwoSum obj = new TwoSum();
        int[] result = obj.TwoSum(arr, target); 

        if (result.length > 0) {
            System.out.println("Indices: " + Arrays.toString(result)); // Fixed: Imported Arrays
        } else {
            System.out.println("No pair found.");
        }
    }
    
}
