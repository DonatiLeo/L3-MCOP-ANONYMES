package anonyme1;

/**
 * @author donati
 *
 */
public class Calculateur {
	Calculable c;
	
	public Calculateur(Calculable c) {
		this.c = c;
	}
	double calcule(double x) {
		return c.fonction(x);
	}
}
