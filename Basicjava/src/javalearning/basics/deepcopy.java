package javalearning.basics;

public class deepcopy {
	
	public static void main(String[] args) {
		int arr[]= {2,5,6,7,8,4};
		int[] b=arr.clone();
		
		for(int element:arr) {
			System.out.println(element);
		}
		for(int ment:b) {
			System.out.println(ment);
	}

}
	
}
