
package com.shivani.algo.sorting;

class InsertionSort{

	public static void main(String[] args){
	
		int[] a = {2,3,5,1,6,4,8,10,9,33,24};
		InsertionSort s = new InsertionSort();
		s.sort(a);
		for(int element: a){
			System.out.print(element+ " ");
		}
	}
	
	public int sort(int[] a){

		int n = a.length;
		for(int i = 1; i < n; i++){
			int temp = a[i];
			int j = i-1;
			while(j >= 0 && a[j] > temp){
				a[j+1] = a[j];
				j = j-1;
			}
			a[j+1] = temp;
		}
		return -1;
	}
}
