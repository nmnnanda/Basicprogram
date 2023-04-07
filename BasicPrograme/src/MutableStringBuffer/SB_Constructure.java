package MutableStringBuffer;

public class SB_Constructure {

	public static void main(String[] args) {
		// StringBuffer(str)
		StringBuffer sb = new StringBuffer("Java");                    //once the 16 charters value is exceeds then automatically it will use this formula (16*2)+2 = 34 and keepon
		System.out.println(sb.capacity());
		
		//StringBuffer()
		StringBuffer sb1 = new StringBuffer();
		System.out.println(sb1.capacity());                           //by default it should take the 16 charters Capacity
		
		//StringBuffer(int)
		StringBuffer sb2 = new StringBuffer(30);
		System.out.println(sb2.capacity());                           //by default it should take the 30 charters( because we created the value 30)

	}

}
