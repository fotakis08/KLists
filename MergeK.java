import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MergeK {

	public static double [] mergeArr(double [] a, double [] b) {
		double[] c = new double[a.length + b.length];
		int i = 0, j = 0, k = 0;
		while (i < a.length && j < b.length) {
			if (a[i] <= b[j]) {
				c[k++] = a[i++];
			}
			else {
				c[k++] = b[j++];
			}
		}
		while(i < a.length) {
			c[k++] = a[i++];
		}
		while(j < b.length) {
			c[k++] = b[j++];
		}
		return c;
	}

	public static double[] mergeKLists (double [][] outerArray) {
		double [] t = outerArray[0];
		for(int i = 1; i < outerArray.length; i++) {
			t = mergeArr(t, outerArray[i]);
		}
		return t;
	}

	public static void main(String args []) {

		double [][] outerArray = {{ 1.1, 4.4, 5.5 }, { 1.1, 3.3, 4.4}, { 2.2, 6.6 }};
		System.out.println(Arrays.toString(mergeKLists(outerArray)));


	}




}