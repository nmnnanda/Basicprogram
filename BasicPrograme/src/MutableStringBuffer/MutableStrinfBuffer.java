package MutableStringBuffer;

public class MutableStrinfBuffer {
                                              //string buffer consturuture
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("java");
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb));
		sb.append("code");
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb));
	}

}
