package Strings;

public class ImmutableString {
                                                  // immutable string : we cant cnagahe the aobject 
	public static void main(String[] args) {
		String str = "java";
		System.out.println(str);
		str.concat("is programming language ");  // string is not getting changed here 
		System.out.println(str);
		
		
		str = str.concat("is programming language");
		System.out.println(str);
		System.out.println(System.identityHashCode(str));
	}

}
