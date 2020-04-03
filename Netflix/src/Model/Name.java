package Model;

import java.util.Comparator;

public class Name implements Comparator <Netflix>{

	
	public int compare(Netflix o1, Netflix o2) {
		return o2.getName().compareTo(o1.getName());
	}

}
