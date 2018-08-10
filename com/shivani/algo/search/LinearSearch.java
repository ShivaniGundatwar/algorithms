package com.shivani.algo.search;

public class LinearSearch {

	public static void main(String[] args){
	
		int[] a = { 1,3,6,9,78,99,222, 567};
	        int element = 199;	
		LinearSearch lsearch = new LinearSearch();
		int index = lsearch.search(a, element);
		System.out.println("Element Present at index "+index);
	}

	public int search(int[] input, int element){

		int index = 0;
		for ( int n : input ){

			if(n == element){
				return index;	
			}
			index++;
		}
		return -1;
	}
}
