package Strings;

public class StringMethods {

	public static void main(String[] args) {
		String str = "Encylopodia";
		String str2 = "Nanda";
		System.out.println(str.toLowerCase());
	    System.out.println(str.toUpperCase());
		System.out.println(str.charAt(1));
		System.out.println(str.indexOf('n'));
		System.out.println(str.endsWith("Encylopodia"));
		System.out.println(str.equalsIgnoreCase("Encylopodia"));
		System.out.println(str==str2);
		System.out.println(str.length());
		
		//split
		
		String s4 = "Java Program";
		String arr5[] = s4.split(" ");
		for(String data:arr5) {
			System.out.println(data);
		}
	}
}