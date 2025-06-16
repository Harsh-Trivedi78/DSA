public class largestinarray {
    public static int largest(int [] arr){
        int max = arr[0];
        for (int i = 0 ; i < arr.length; i++){
            if (arr[i] > max){
                max =  arr[i];
            }

        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int largestNumber = largest(arr);
        System.out.println("Largest number in the array is: " +largestNumber);

    }
    
}
