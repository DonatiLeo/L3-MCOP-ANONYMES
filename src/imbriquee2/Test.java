/**
 * 
 */
package imbriquee2;

/**
 * @author donati
 *
 */
public class Test {

	public static void main(String[] args) {
			
		System.out.println(Externe.calculeTTC(100));
		
		Externe.taux = 1.5;
		
		System.out.println(Externe.calculeTTC(100));	
	}
}
