package Model;

import java.util.Comparator;

public class Year implements Comparator <Netflix> {

	
	public int compare(Netflix o1, Netflix o2) {
		
		return o1.getYear() - o2.getYear();
	}

}
