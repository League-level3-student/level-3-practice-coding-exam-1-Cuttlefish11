package practice;

import java.util.ArrayList;
import java.util.Iterator;

public class Finder {

	public Object lastIndexOf(ArrayList<String> al, String apple) {
		// TODO Auto-generated method stub
		String a =apple.toLowerCase();
		int q = -1;
		for (int i = 0; i < al.size(); i++) {
			String b = al.get(i).toLowerCase();
			System.out.println(a+ ", " + b);
			if (a.equals(b)) {
				q=i;
			}
		}
		return q;
	}

}
