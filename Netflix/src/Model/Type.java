package Model;

import java.util.Comparator;

public class Type implements Comparator <Netflix> {

	@Override
	public int compare(Netflix o1, Netflix o2) {
		return o1.getType().compareTo(o2.getType());
	}

}
