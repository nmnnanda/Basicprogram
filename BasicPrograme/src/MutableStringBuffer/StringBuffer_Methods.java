package MutableStringBuffer;

public class StringBuffer_Methods {

	public static void main(String[] args) {
		
		//append() method
		StringBuffer sb = new StringBuffer(" ");
		sb.append("java is a ");
		System.out.println(sb);
		
		//insert() Method
		StringBuffer sb1 = new StringBuffer("python is  ");
		sb1.insert(4, "Java");
		System.out.println(sb1);
		
		//reverse() Method
		StringBuffer sb2 = new StringBuffer("python is  ");
		sb2.reverse();
		System.out.println(sb2);
	}

}
