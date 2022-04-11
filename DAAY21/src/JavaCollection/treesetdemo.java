package JavaCollection;

import java.util.Set;
import java.util.TreeSet;
public class treesetdemo 
{
		
		public static void main(String[] args)
		{
			Set<Integer> hs=new TreeSet<Integer>();
			hs.add(11);
			hs.add(22);
			hs.add(33);
			hs.add(44);
			hs.add(4);
			System.out.println(hs);
			hs.add(11);
			System.out.println(hs);
		}

}
