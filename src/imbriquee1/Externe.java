/**
 * 
 */
package imbriquee1;

/**
 * @author donati
 *
 */
public class Externe {
	static double taux = 0.18;
	
	static class Interne {
		public double calculeTTC(double prix) {
			return prix * (1.0+taux);
		}
	}
}
