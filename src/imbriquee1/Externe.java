/**
 * 
 */
package imbriquee1;

/**
 * @author donati
 *
 */
public class Externe {
	static double taux = 1.8;
	
	static class Interne {
		public double calculeTTC(double prix) {
			return prix * taux;
		}
	}
}
