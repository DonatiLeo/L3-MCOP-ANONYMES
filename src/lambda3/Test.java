package lambda3;

import java.util.function.Function;

public class Test {

	public static void main(String[] args) {
		Function<Double, Double> f;
		f = Math::sin;
		System.out.println(f.apply(Math.PI));
	}
}
