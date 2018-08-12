package com.shivani.algo.sorting;

class BubbleSort{

	public static void main(String[] args){
	
		int[] a = {2,3,5,1,6,4,8,10,9,33,24};
		BubbleSort b = new BubbleSort();
		b.sort(a);
		for(int element: a){
			System.out.print(element+ " ");
		}
	}
	
	public int sort(int[] a){

		int n = a.length;
		for(int i = 0; i < n-1; i++)
			for(int j = 0; j < n-i-1; j++)
				if(a[j] > a[j+1]){
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}	
	return -1;
	}
}
