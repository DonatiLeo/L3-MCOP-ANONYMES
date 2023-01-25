/**
 * 
 */
package imbriquee2;

/**
 * @author donati
 *
 */
public class Externe {
	static double taux = 1.8;
	
	private static class Interne {
		double calculeTTC(double prix) {
			return prix * taux;
		}
	}
	
	static double calculeTTC(double prix) {
		Interne objet = new Interne();
		return objet.calculeTTC(prix);
	}
}
