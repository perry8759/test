package HomeWork.Factorial;

import java.math.BigInteger;

public class Factorial {
	public BigInteger FactorialMethod(int n) {
		BigInteger number = new BigInteger(String.valueOf(n));
		if (n < 1) {
			return BigInteger.ONE;
		} else {
			return number.multiply(FactorialMethod(n-1));
		}
	}
}
