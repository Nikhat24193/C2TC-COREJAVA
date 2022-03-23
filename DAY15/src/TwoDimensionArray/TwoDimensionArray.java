package TwoDimensionArray;

public class TwoDimensionArray {
	public static void main(String args[]) {
		int myarray[][]=new int[3][2];
		myarray[0][0]=33;
		myarray[0][1]=71;
		myarray[1][0]=-16;
		myarray[1][1]=45;
		myarray[2][0]=99;
		myarray[2][1]=27;
		System.out.println("myarray.length="+ myarray.length);
		System.out.println(myarray[0][0]);
		System.out.println(myarray[0][1]);
		System.out.println(myarray[1][0]);
		System.out.println(myarray[1][1]);
		System.out.println(myarray[2][0]);
		System.out.println(myarray[2][1]);
	}

}
