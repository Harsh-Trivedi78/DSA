
public class LinearSearch {
    public static int LinearSearch(int Numbers[], int key) {
        for (int i = 0; i < Numbers.length; i++){
            if (Numbers[i] == key) {
                return i; // return the index of the found element
            }
        }
        return -1; // return -1 if the element is not found
    }
    
    public static void main(String[] args) {
        int Numbers[] = {1,2,3,4,5,6,7,8};   
        // String menu[] = {"d"}
        int key = 7;
        int index = LinearSearch(Numbers,key);
        if(index == -1){
            System.out.println("Key is not found in the array");
        }else{
            System.out.println("Key is found at index: " + index);
        }
    }
}