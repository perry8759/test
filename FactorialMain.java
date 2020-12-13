package HomeWork.Factorial;

import java.math.BigInteger;

public class FactorialMain {

	public static void main(String[] args) {		
		Factorial ft = new Factorial();
		BigInteger ansStr = ft.FactorialMethod(10000);
		System.out.println(ansStr);
		
	}
}
