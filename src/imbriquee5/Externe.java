/**
 * 
 */
package imbriquee5;

/**
 * @author donati
 *
 */
public class Externe {
	double taux = 1.8;
	
	double calculeTTC(double prix) {
		class Interne {
			public double calculeTTC(double prix) {
				return prix * taux;
			}
		}
		Interne objet = new Interne();
		return objet.calculeTTC(prix);
	}
}
