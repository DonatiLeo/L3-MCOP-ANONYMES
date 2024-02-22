/**
 * 
 */
package anonyme1;

/**
 * @author donati
 *
 */
public class Test {

	public static void main(String[] args) {
		
		Calculateur calc = 
			new Calculateur(
				new Calculable() {
					public double fonction(double x) {
						return x*x+1;
					}
				}
			);	
		System.out.println(calc.calcule(8));
		
		calc.c = new Calculable() {
			public double fonction(double x) {
				return x*x*x;
			}
		};
		System.out.println(calc.calcule(8));
		
		//Grâce aux méthodes lambda
		calc.c = x->x+1;
		System.out.println(calc.calcule(8));
	}
}
