package com.shivani.algo.search;

public class BinarySearch {

	public static void main(String[] args){
	
		int[] a = {1,3,6,8,9,33,45,56,67,78};
		int r = a.length;
		int l = 0;
		int num = 9;
		BinarySearch bsearch = new BinarySearch();
		int index = bsearch.binsearch(a, l, r, num);
		System.out.println("num Present at index "+index);
	}
	
	public int binsearch(int[] a, int l, int r, int num){

		while(l <= r){

			int mid = (l + r)/2;
			
			if(a[mid] < num){
				l = mid + 1;
			}

			else if(a[mid] > num){
				r = mid - 1;
			}

			else{
				return mid;
			}
		}
		return -1;
	}
}
