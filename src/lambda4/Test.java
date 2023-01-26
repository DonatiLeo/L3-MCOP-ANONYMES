/**
 * 
 */
package lambda4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Consumer;

/**
 * @author donati
 *
 */
public class Test {

	//Utilisation de foreach
	
	public static void main(String[] args) {
		ArrayList<Integer> tab = new ArrayList<>();
		
		Consumer<Integer> operation = t -> { 
			System.out.println("pour  "+t+" on a "+Math.sin(t));
		};
		
		for (int i=0; i<10; i++)
			tab.add(i);
		
		tab.sort( (o1, o2) -> {
			if  (Math.sin(o2) < Math.sin(o1))
				return 1;
			else
				return -1;
		});
		
		/*//AVEC CLASSE ANONYE
		tab.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println("pour  "+t+" on a "+Math.sin(t));
			}
		});
		
		//AVEC EXPRESSION LAMBDA
		tab.forEach(
			t -> { 
				System.out.println("pour  "+t+" on a "+Math.sin(t));
			}
		);*/
		
		tab.forEach(operation);
		
		operation = t -> System.out.println("opération différente "+t);
		tab.forEach(operation);

	}
}
