package lambda3;

import java.util.function.Function;

public class Test {

	public static void main(String[] args) {
		Function<Double, Double> f;
		f = Math::sin;
		System.out.println("sinus de pi =" + f.apply(Math.PI));
		f = Math::cos;
		System.out.println("cosinus de pi =" + f.apply(Math.PI));
	}
}
