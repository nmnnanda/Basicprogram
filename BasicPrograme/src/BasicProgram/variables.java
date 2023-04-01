package BasicProgram;

public class variables {
	
	int studentId = 101;
	String studentName = "Arjun";
	static String collegeName = "ABC";
	double abc = 6.09;
	
	public void show(){
		int deptId = 121;
		System.out.println(deptId);
}
	public static void main(String[] args) {
		                                      //creating an obj
		                                      //ClassName objName = new ClassName();
		variables s1 = new variables();
		                                      //access instance variable:
		                                      //objName.variableName
	System.out.println(s1.studentId);
	System.out.println(s1.studentName);
		                                      //using classname
	System.out.println(variables.collegeName);
	                                          //Using object	
	System.out.println(s1.collegeName);	
	s1.show();
}
}