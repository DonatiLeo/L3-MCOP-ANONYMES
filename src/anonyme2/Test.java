/**
 * 
 */
package anonyme2;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author donati
 *
 */
public class Test {

	//Utilise un comparateur pour ordonner un tableau d'entiers 
	//selon leur sinus croissant
	//ou cosinus
	
	public static void main(String[] args) {
		ArrayList<Integer> tab = new ArrayList<>();
		for (int i=0; i<10; i++)
			tab.add(i);
		
		tab.sort( new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				if  (Math.sin(o2) > Math.sin(o1))
					return 1;
				else
					return -1;
			}
		});
		
		System.out.print(tab);

	}

}
