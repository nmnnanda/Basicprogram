package javalearning.basics;

public class program2 {

	public static void cube(int[] a) {
		for(int i=0; i<a.length; i++) {
			int cube=a[i]*a[i]*a[i];
			a[i]=cube;
		}
		for(int cube:a) {
			System.out.println(cube+" ");
		}
	}
	public static void main(String[] args) {
            int arr[]= {1,2,3,4,5,6,7,8};
               program2.cube(arr);

	}

}
+