package practice.sort;


public class QuickSort {
	
	public static void sort(double[] a){
		sort(a, 0, a.length-1);
	}
	
	private static void sort(double[] a,int lo,int hi){
		if (hi<=lo)
			return;
		
		int j = partition(a, lo, hi);
		sort(a,lo,j-1);
		sort(a,j+1,hi);
	}
	
	private static void swap(double[] a,int i,int j){
		
		double temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	private static int partition(double[] a,int lo,int hi){
		
		double pivot = a[lo];
		int i = lo,j = hi + 1;
		while (true){
			while (a[++i] < pivot){
				if (i == hi)
					break;
			}
			while (pivot < a[--j]){
				if (j == lo)
					break;
			}
			if (i>=j)
				break;
			swap(a, i, j);
		}
		swap(a, lo, j);
		return j;
	}
}
