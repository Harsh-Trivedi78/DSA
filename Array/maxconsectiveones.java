import java.util.*;

public class maxconsectiveones {
    static int maxconsectiveones(int [] nums){
        int count = 0 ;
        int max = 0 ; 
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 1 ){
                count ++;
                
            }
            else{
                count = 0 ;
            }
            max = Math.max(max, count);
        }
        return max;
    }




    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1,1};
        int ans = maxconsectiveones(nums);
        System.out.println("the max consective ones are: "+ ans);
    }
}
