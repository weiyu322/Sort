package practice.sort;

/*
 * ≤Â»Î≈≈–Ú
 */
public class InsertSort {
	
	public static void sort(double[] a){
		for (int i=1;i<a.length;i++){
			for (int j=i;j>0 && (a[j]<a[j-1]);j--){
				swap(a, j, j-1);
			}
		}
	}
	
	public static void swap(double[] a,int i,int j){
		double temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
