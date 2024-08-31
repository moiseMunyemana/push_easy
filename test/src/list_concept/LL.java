package list_concept;

import java.util.LinkedList;
import java.util.List;

public class LL {

	public static void main(String[] args) {
		List<String> names= new LinkedList<>();
		names.add("Henry");
		names.add("Peter");
		names.add("Leo");
		
		System.out.println(names.size());
		
		names.add("Mark");
		names.add("Alice");
		names.add("MOSES");
		names.add("Leo"); //duplicates are allowed
		
		System.out.println(names.size());
		
	
		
		for(int i=0;i<names.size();i++) {
			System.out.println(names.get(i));
			
		}
		
		names.add(3, "Dean");
		names.add(4, "munye");
		
		System.out.println(names.get(4));
	System.out.println(	names.contains("Steve"));
	


	}

}
