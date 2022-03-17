package DataType_Demo;

public class TypeCasting {

	public static void main(String[] args) 
	{
		//1) Widening Casting (automatically)
		// byte -> short -> char -> int -> long -> float -> double
		
		int myInt = 9;
	    double myDouble = myInt; // Automatic casting: int to double

	    System.out.println(myInt);      // Outputs 9
	    System.out.println(myDouble);   // Outputs 9.0
		
		//2) Narrowing Casting (manually)
// double -> float -> long -> int -> char -> short -> byte
		
	    double myDouble1 = 9.78d;
	    int myInt1 = (int) myDouble1; // Manual casting: double to int

	    System.out.println(myDouble1);   // Outputs 9.78
	    System.out.println(myInt1);      // Outputs 9
	    
	}

}