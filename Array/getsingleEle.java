



public class getsingleEle {
    public static int getsingleElement(int arr[]){
        int n = arr.length;
        int xor = 0 ;
        for(int i = 0 ; i < n ; i++){
            xor = xor^ arr[i];

        }
        return xor;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 2, 1};
        int ans = getsingleElement(arr);
        System.out.println("The single element is: " + ans);
    }    
}
