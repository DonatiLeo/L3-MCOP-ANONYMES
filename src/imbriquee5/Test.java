/**
 * 
 */
package imbriquee5;

/**
 * @author donati
 *
 */
public class Test {

	public static void main(String[] args) {
			
		Externe e = new Externe();
		System.out.println(e.calculeTTC(100));
		e.taux = 1.5;
		System.out.println(e.calculeTTC(100));	
	}
}
