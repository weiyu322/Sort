package practice.sort;

public class BubbleSort {
	public static void sort(double[] a){
		for (int i=a.length-1;i>0;i--){
			for (int j=0;j<i;j++){
				if (a[j] > a[j+1])
					swap(a, j, j+1);
			}
				
		}
	}
	
	private static void swap(double[] a,int i,int j){
		double temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
