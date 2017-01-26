package practice.sort;

/*
 * —°‘Ò≈≈–Ú
 */
public class SelectionSort {
	
	public static void sort(double[] a){
		for (int i=0;i<a.length;i++){
			int minIndex = i;
			for (int j=i+1;j<a.length;j++){
				if (a[j] < a[minIndex]){					
					minIndex = j;
				}
			}
			swap(a, minIndex, i);
		}
	}
	
	private static void swap(double[] a,int i,int j){
		double temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	
}
