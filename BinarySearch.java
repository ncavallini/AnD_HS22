public class BinarySearch {
 
  public static int binarySearch(int[] input, int key) {
        int l = 0;
        int r = input.length;
        while(r-l >= 1) {
            int mid = (r+l)/2;
            if(input[mid] == key) return mid;
            else if(input[mid] < key) l = mid;
            else r = mid;
        }
        return -1; // not found
    }
  
}
