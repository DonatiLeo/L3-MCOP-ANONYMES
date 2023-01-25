/**
 * 
 */
package imbriquee1;

/**
 * @author donati
 *
 */
public class Test {

	public static void main(String[] args) {
		
		Externe.Interne objet = new Externe.Interne();	
		System.out.println(objet.calculeTTC(100));
		Externe.taux = 1.5;
		System.out.println(objet.calculeTTC(100));	
	}
}
