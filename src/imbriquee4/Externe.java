/**
 * 
 */
package imbriquee4;

/**
 * @author donati
 *
 */
public class Externe {
	double taux = 1.8;
	private Interne objet = new Interne();
	
	private class Interne {
		public double calculeTTC(double prix) {
			return prix * taux;
		}
	}
	
	double calculeTTC(double prix) {
		return objet.calculeTTC(prix);
	}
}
