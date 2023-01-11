public class Sorting {
  
  public static void bubbleSort(int[] input) {
       for(int i=0; i < input.length; i++) {
           for(int j=i+1; j < input.length; j++) {
               if(input[i] > input[j]) swap(i, j, input);
           }
       }
    }
    
  public static void selectionSort(int[] input) {
        for(int i=0; i < input.length; i++) {
            int minIndex = minIndex(input, i);
            swap(i, minIndex, input);
        }
    }
    
  
    // Returns the index of the minimum element in a[i...n-1]
    private static int minIndex(int[] a, int i) {
        int min = Integer.MAX_VALUE;
        int minIndex = i;
        for(int j=i; j < a.length; j++) {
            min = Math.min(min, a[j]);
            if(min == a[j]) minIndex = j;
        }
        return minIndex;
    }
  
    private static void swap(int i, int j, int[] a) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
  
}
