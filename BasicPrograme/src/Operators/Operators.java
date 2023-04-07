package Operators;

public class Operators {

	public static void main(String[] args) {
		///////arthematic operators
		int a=10;
		int b=5;
		System.out.println("add "+(a+b));
		System.out.println("sub "+(a-b));
		System.out.println("multiply "+(a*b));
		System.out.println("div "+(a%b));
		System.out.println("moduls "+(a/b));
		
		
		
		/////unary operators
		
		//pre-increment ++a    
		
		int c = 20;
		int d = ++c;
		System.out.println(c+d);
		System.out.println(c+" "+d);

		
		//post increment a++
		
		int f = 20;
		int h = c++;
		System.out.println(f+h);
		System.out.println(f+" "+h);
		
		
		// ~ operator
		
		int x = 8;    //  -(x+1) the condition
		System.out.println(~(x));
		
		
		
		/////////  Relation operators
		
		int x1=20;
		int y1=21;
		
		System.out.println(x1=y1);
		System.out.println(x1<y1);
		System.out.println(x1<=y1);
		System.out.println(x1>=y1);
		System.out.println(x1==y1);
		System.out.println(x1!=y1);
		System.out.println(x1>y1);
		
		
		/////// logical operators 
		// has to refer truth tables for AND OR , NOT to easy understand of this 
		
		int x2= 100;
		int y2=22;
		
		System.out.println((x2>y1)&&(x2==y2));  /// && refers to AND 
		System.out.println((x2>y1)||(x2==y2));  /// || refers to OR
		
		
		//// bitwise 
		int n = 5;      // binary: 0101
		int y = 3;      // binary: 0011
		System.out.println(n&y);  // bitwise AND 
		System.out.println(n|y);  // bitwise OR
		System.out.println(~y);  // bitwise NOT
		System.out.println(n^y);  // bitwise XOR 
		System.out.println(n>>y);  // bitwise  Right Shift
		System.out.println(n<<y);  // bitwise  Left Shift
		
		
		//// Ternary operaror
		// condition ? case1 :case2
		
		int r=10;
		int o=20;
		System.out.println((r>=o)?"condition is true":"condition is false");
		System.out.println((r<=o)?"condition is true":"condition is false");

		
	}

}
