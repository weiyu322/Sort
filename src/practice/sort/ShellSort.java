package practice.sort;

public class ShellSort {
	
	public static void sort(double[] a){
		int N = a.length;
		int h = 1;
		while(h<N/3) h = 3*h + 1;
		
		while(h>=1){
			for (int i=h;i<N;i++){
				for (int j=i;j>=h && (a[j]<a[j-h]);j-=h){
					swap(a, j-h, j);
				}
			}
			h = h/3;
		}
	}
	
	private static void swap(double[] a,int i,int j){
		double temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
