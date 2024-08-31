package list_concept;

import java.util.LinkedList;
import java.util.List;

public class List_Heterogenus {

	public static void main(String[] args) {
		List<Object> studRec= new LinkedList<>();
		studRec.add(70);
		studRec.add("Steve");
		studRec.add(5.3);
		System.out.println(studRec.get(0));
		for (int i =0 ; i <studRec.size(); i++) {
			System.out.println(studRec.get(i));
		}

	}

}