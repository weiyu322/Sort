package practice.sort;

public class MergeSort {
	
	private static double[] aux;
	
	public static void sort(double[] a){
		aux = new double[a.length];
		sort(a,0,a.length-1);
	}
	
	private static void sort(double[] a,int lo,int hi){
		if (hi<=lo) return;
		int mid = lo + (hi-lo)/2;
		sort(a,lo,mid);
		sort(a,mid+1,hi);
		merge(a,lo,mid,hi);
	}
	
	public static void merge(double[] a,int lo,int mid,int hi){
		int i = lo,j = mid + 1;
		for (int k=lo;k<=hi;k++)
			aux[k] = a[k];
		
		for (int k=lo;k<=hi;k++){
			if (i>mid) a[k] = aux[j++];
			else if (j>hi) a[k] = aux[i++];
			else if (aux[j]<aux[i]) a[k] = aux[j++];
			else a[k] = aux[i++];
		}
	}
}
