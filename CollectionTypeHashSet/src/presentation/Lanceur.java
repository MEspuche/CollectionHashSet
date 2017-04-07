package presentation;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set hs = new HashSet();
	
		hs.add(12);
		System.out.println(hs.toString());
		
		hs.add("fgregher");
		System.out.println("------------------------");
		System.out.println(hs.toString());
		
		hs.add(12f);
		System.out.println("------------------------");
		System.out.println(hs.toString());
		
		hs.add('d');
		System.out.println("------------------------");
		System.out.println(hs.toString());
		
		hs.add('d');
		System.out.println("------------------------");
		System.out.println(hs.toString());
		
		hs.add(true);
		System.out.println("------------------------");
		System.out.println(hs.toString());
		
		System.out.println(" ");
		
		//parcourir
		Iterator it = hs.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
