package MutableStringBuffer.Decision.control.statements;

public class VotingSystem {
	                                               //decision control statements
	public static void ageVerifier(int age) {
		if(age>=18) {
			System.out.println("Age is varified");
		}else if(age<=60){
			System.out.println("varification is failed");
		}
	}

	public static void main(String[] args) {
		VotingSystem.ageVerifier(70);
		
	}

}
