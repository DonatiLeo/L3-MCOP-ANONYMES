/**
 * 
 */
package lambda1;

/**
 * @author donati
 *
 */
public class Test {

	public static void main(String[] args) {
		
		Calculateur calc = new Calculateur(
				x -> x*x + 1
			);	
		System.out.println(calc.calcule(8));
		
		calc.c = x->x+1;
		System.out.println(calc.calcule(8));
	}
}
