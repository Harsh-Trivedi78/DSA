public class SearchXinSortedarray {
    public int search(int[] n, int k){
        int s = 0 , e = n.length - 1;
        while (s <= e){
            int mid = (s + e) / 2;
            if (n[mid] == k){
                return mid;
            }
            if (n[mid] < k){
                s = mid + 1;
            } else {
                e = mid - 1;
            }

            
        }
        return -1;
    }

    public static void main(String[] args) {
        SearchXinSortedarray obj = new SearchXinSortedarray();
        int n[] = {-1,0,3,5,9,12};
        int k = 9;
        System.out.println("index for key is : " + obj.search(n, k));
    }
}
