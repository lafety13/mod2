package dz1;

public class App {
	public static void main(String[] arg) {
		Calculator calc = new Calculator();
		int[] varOfInteger = {-12, -112, 3, -23, -33, 1};
		double[] varOfDouble = {-3.3, 2, 3, -23, -33.2, 5.1};
		
		// Sum
		System.out.println("sum of integer \n" + calc.sum(varOfInteger));
		System.out.println("sum of Double \n" + calc.sum(varOfDouble));
		
		// Minimum
		System.out.println("min of integer \n" + calc.min(varOfInteger));
		System.out.println("min of double \n" + calc.min(varOfDouble));
		
		// Maximum
		System.out.println("max of integer \n" + calc.max(varOfInteger));
		System.out.println("max of double \n" + calc.max(varOfDouble));
		
		// Max positive
		System.out.println("max positive of integer \n" + calc.maxPositive(varOfInteger));
		System.out.println("max positive of double \n" + calc.maxPositive(varOfDouble));
		
		// Modulus
		System.out.println("modulus of integer \n" + calc.modulus(varOfInteger));
		System.out.println("modulus of double \n" + calc.modulus(varOfDouble));
		
		// Multiplication
		System.out.println("multiplication of integer \n" + calc.multiplication(varOfInteger));
		System.out.println("multiplication of double \n" + calc.multiplication(varOfDouble));
		
		// Second largest
		System.out.println("second largest of integer \n" + calc.secondLargest(varOfInteger));
		System.out.println("second largest of double \n" + calc.secondLargest(varOfDouble));
	}
}
