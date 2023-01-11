public class Sorting {
  
  public static void bubbleSort(int[] input) {
       for(int i=0; i < input.length; i++) {
           for(int j=i+1; j < input.length; j++) {
               if(input[i] > input[j]) swap(i, j, input);
           }
       }
    }
    
    private static void swap(int i, int j, int[] a) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
  
}
