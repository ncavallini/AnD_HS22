import java.util.Arrays;

public class MaximumSubarraySum {
	
	
	private static int mssRecursive(int[] a) {
		int s = Integer.MIN_VALUE;
		final int n = a.length;
		int[] r = new int[n];
		r[0] = a[0];
		for(int i=1; i<n; i++) {
			if(r[i-1] >= 0) r[i] = a[i] + r[i-1];
			else r[i] = a[i];
			if(r[i] > s) s = r[i];
		}
		
		return s;
	}
	
	public static void main(String[] args) {
		
		// Testing program for known output
		int[] a = new int[] {-2, -5, 6, -2, -3, 1, 5, -6};
		System.out.println("Array: " + Arrays.toString(a));
		int mss = mssRecursive(a);
		System.out.println("Maximum Subarray Sum: " + mss);
		assert(mss == 7);
	}
}
