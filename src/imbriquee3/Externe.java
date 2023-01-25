/**
 * 
 */
package imbriquee3;

/**
 * @author donati
 *
 */
public class Externe {
	double taux = 1.8;
	
	class Interne {
		public double calculeTTC(double prix) {
			return prix * taux;
		}
	}
}
