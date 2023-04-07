package MutableStringBuffer.Decision.control.statements;

public class Whileloop {
        
	public static void reverseNumber (int number) {
		int rev = 0;
		while(number>0){int rem = number%10;
		int quo = number/10;
		number = quo;
		rev = rev*10+rem;
		}
		System.out.println("reverse ="+rev);
	}
	public static void main(String[] args) {
		int num = 123456789;
		reverseNumber(num);
	}

}
