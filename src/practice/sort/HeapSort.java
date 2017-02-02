package practice.sort;

import java.sql.SQLNonTransientConnectionException;

public class HeapSort {

	public static void sort(double[] a){
		//1.�����һ����Ҷ��㿪ʼ������
		int lastRoot = (a.length-2) / 2;
		for (int i=lastRoot;i>=0;i--){
			adjustHeap(a, i, a.length);
		}
		
		//2.�����Ѷ��Ͷ����һ��Ԫ�أ������µ�����
		for (int i=a.length;i>1;i--){
			swap(a, 0, i-1);
			adjustHeap(a, 0, i-1);
		}
	}
	
	private static void swap(double[] a,int i,int j){
		double temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	/**
	 * Ԫ���³�������heap
	 * @param a
	 * @param pos
	 * @param len
	 */
	private static void adjustHeap(double[] a,int pos,int len){
		double child;
		while (2*pos+1 < len){
			int leftChild = 2*pos + 1;
			int rightChild = leftChild + 1;
			
			if (rightChild < len){
				//pos�ڵ��������ӽڵ�
				boolean isLeftMax = a[leftChild] >= a[rightChild] ? true:false;
				if (isLeftMax){
					if (a[pos] < a[leftChild]){
						swap(a, pos, leftChild);
						pos = leftChild;
					}else{
						break;
					}
				}else{
					if (a[pos] < a[rightChild]){
						swap(a, pos, rightChild);
						pos = rightChild;
					}else{
						break;
					}
				}
			}else{
				//posֻ������
				if (a[pos] < a[leftChild]){
					swap(a, pos, leftChild);
				}
				break;
			}
		}
		
	}
	
	 
}
