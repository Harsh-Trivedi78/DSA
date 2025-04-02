public class missingNumber {
    public static int missingnum (int a[] ,int N){
        int sum = (N *(N+1))/2;
        int s2 = 0 ;
        for(int i = 0 ; i < N-1 ;i++){
            s2 += a[i];

        }
        int missingnum = sum -s2;
        return missingnum;
    }
    public static void main(String[] args) {
        int N = 5;
        int a[] = {1, 2, 4, 5};

        int ans = missingnum(a, N);
        System.out.println("The missing number is: " + ans);
    }
    
}
