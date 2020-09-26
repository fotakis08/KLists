import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class KLists {

	public static double [] mergeArr(double [] a, double [] b) {
		double[] c = new double[a.length + b.length];
		int i = 0, j = 0, k = 0;

		// Traversing the arrays
		while (i < a.length && j < b.length) {
			// If the a index is smaller store element in C array then increment.
			// Else do the opposite
			if (a[i] <= b[j]) {
				c[k++] = a[i++];
			}
			else {
				c[k++] = b[j++];
			}
		}
		// Go through the length of the a array
		while(i < a.length) {
			c[k++] = a[i++];
		}
		// Go through length of b array
		while(j < b.length) {
			c[k++] = b[j++];
		}
		// return c, which represents the sorted output array.
		return c;
	}

	public static double[] mergeKLists (double [][] outerArray) {
		double [] m = outerArray[0];
		for(int i = 1; i < outerArray.length; i++) {
			m = mergeArr(m, outerArray[i]);
		}
		return m;
	}

	public static void main(String args []) {

		// Example 4
		double [][] outerArray = {{9.7, 17.1}, {15.8}, {12.7, 18.5, 21.27}};
		System.out.println(Arrays.toString(mergeKLists(outerArray)));
	}
}