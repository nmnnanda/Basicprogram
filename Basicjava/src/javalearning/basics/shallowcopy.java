package javalearning.basics;

public class shallowcopy {
//shallow copy 
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		int[]b=arr;
		
		for(int element:arr) {
			System.out.println(element);
		}
		for(int ment:b) {
			System.out.println(ment);
		}
	}

}
