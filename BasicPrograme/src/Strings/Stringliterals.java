package Strings;
                                 // there are two ways of creating an object 
                                 // 1) using literals  2) using new
public class Stringliterals {

	public static void main(String[] args) {
		String str = "javacode";
		System.out.println(System.identityHashCode(str));
		
		String str1 = "javacode";
		System.out.println(System.identityHashCode(str));
		
		
		String st1 = "java";     // string literals
		String st2= st1;
		
		String st3 = new String("java");      // string New
		String st4 = new String("java");

		System.out.println(st1==st2);
		System.out.println(st3==st1);
		System.out.println(st3==st4);

		
	}

}
