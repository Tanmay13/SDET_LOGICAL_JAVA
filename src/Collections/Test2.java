package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Sequentil Value getting from List and Array list using iterator
		// Curser
		List l = new ArrayList();
		l.add(5);
		l.add(7);
		l.add(98);
		l.add(57);
		// l.add("String");
		Iterator itr = l.iterator();
		while (itr.hasNext()) {

			int x = (int) itr.next();
			System.out.println(x);
		}
	}

}
