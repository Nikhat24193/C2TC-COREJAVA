package LambdaExpression;


	import java.util.LinkedList;

	public class Lambdaforeach {

		public static void main(String[] args) 
		{
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("amjad");
		ll.add("imtiyaz");
		ll.add("farhat");
		ll.add("nikhat");
		ll.forEach((n)->{System.out.println(n);});
		

		}

	}

