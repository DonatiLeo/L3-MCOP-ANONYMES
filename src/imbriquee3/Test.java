/**
 * 
 */
package imbriquee3;

/**
 * @author donati
 *
 */
public class Test {

	public static void main(String[] args) {
		
		Externe e = new Externe();
		Externe.Interne objet  = e.new Interne();	
		System.out.println(objet.calculeTTC(100));
		e.taux = 1.5;
		System.out.println(objet.calculeTTC(100));	
	}
}
