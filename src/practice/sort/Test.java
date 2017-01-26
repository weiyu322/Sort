package practice.sort;

import java.util.Arrays;
import java.util.function.DoublePredicate;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//生成数组
		double[] a = new double[1024*100];
		genRandomArray(a);
		//genSortedArray(a);
		
		//排序
		double start = System.currentTimeMillis();
		//InsertSort.sort(a);
		//SelectionSort.sort(a);
		//Arrays.sort(a);
		//BubbleSort.sort(a);
		ShellSort.sort(a);
		double end = System.currentTimeMillis();
		
		show(a, 10);
		System.out.println("\n"+isSorted(a));
		System.out.println("sort time: "+(end-start)/1000);
	}

	public static void genRandomArray(double[] a){
		for (int i=0;i<a.length;i++){
			a[i] = Math.random() * 100;
		}
	}
	
	public static void genSortedArray(double[] a){
		genRandomArray(a);
		Arrays.sort(a);
	}
	
	/**
	 * 数组a的前num个数
	 * @param a
	 * @param num
	 */
	public static void show(double[] a,int num){
		if (num > a.length){
			System.out.println("out of bound");
			return;
		}
		
		for (int i=0;i<num;i++){
			System.out.print(a[i]+" ");
		}

	}
	
	public static boolean isSorted(double[] a){
		for (int i=0;i<a.length-1;i++){
			if (a[i] > a[i+1])
				return false;
		}
		return true;
	}
}
