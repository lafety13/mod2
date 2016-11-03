package dz1;

public class Calculator {
	public int sum(int[] values) {
		int sum = 0;
		int len = values.length;
		
		for (int i=0; i<len; ++i) {
			sum += values[i];
		}
		return sum;
	}
	public double sum(double[] values) {
		double sum = 0;
		double len = values.length;
		
		for (int i=0; i<len; ++i) {
			sum += values[i];
		}
		return sum;
	}
	public int min(int[] values) {
		int min = values[0];
		int len = values.length;
		
		for (int i=0; i<len-1; ++i) {
			if (min > values[i+1]) {
				min = values[i+1];
			}
		}
		return min;
	}
	public double min(double[] values) {
		double min = values[0];
		double len = values.length;
		
		for (int i=0; i<len-1; ++i) {
			if (min > values[i+1]) {
				min = values[i+1];
			}
		}
		return min;
	}
	public int max(int[] values) {
		int max = values[0];
		int len = values.length;
		
		for (int i=0; i<len-1; ++i) {
			if (max < values[i+1]) {
				max = values[i+1];
			}
		}
		return max;
	}
	public double max(double[] values) {
		double max = values[0];
		double len = values.length;
		
		for (int i=0; i<len-1; ++i) {
			if (max < values[i+1]) {
				max = values[i+1];
			}
		}
		return max;
	}
	public int maxPositive(int[] values) {
		int max = 0;
		int len = values.length;
		
		for (int i=0; i<len; ++i) {
			if (values[i] > 0) {
				if (values[i] > max) {
					max = values[i];
				}
			}
		}
		return max;
	}
	public double maxPositive(double[] values) {
		double max = 0;
		double len = values.length;
		
		for (int i=0; i<len; ++i) {
			if (values[i] > 0) {
				if (values[i] > max) {
					max = values[i];
				}
			}
		}
		return max;
	}
	
	public int multiplication(int[] values) {
		int result = 1;
		int len = values.length;
		
		for (int i=0; i<len; ++i) {
			result *= values[i];
		}
		return result;
	}
	public double multiplication(double[] values) {
		double result = 1;
		double len = values.length;
		
		for (int i=0; i<len; ++i) {
			result *= values[i];
		}
		return result;
	}
	public int modulus(int[] values) {
		int result = 0;
		result = values[0] % values[values.length-1];
		return result;
	}
	public double modulus(double[] values) {
		double result = 0;
		result = values[0] % values[values.length-1];
		return result;
	}
	public int secondLargest(int[] values) {
		int firstLargest, secondLargest;
		
		if (values[0] > values[1]) {
			firstLargest = values[0];
			secondLargest = values[1];
		} else {
			firstLargest = values[1];
			secondLargest = values[0];
		}
		
		int len = values.length;
		for (int i=2; i<len; ++i) {
			if (values[i] > firstLargest) {
				secondLargest = firstLargest;
				firstLargest = values[i];
			} else if (values[i] < firstLargest && values[i] > secondLargest) {
				secondLargest = values[i];
			}
		}
		return secondLargest;
	}
	public double secondLargest(double[] values) {
		double firstLargest, secondLargest;
		
		if (values[0] > values[1]) {
			firstLargest = values[0];
			secondLargest = values[1];
		} else {
			firstLargest = values[1];
			secondLargest = values[0];
		}
		
		double len = values.length;
		for (int i=2; i<len; ++i) {
			if (values[i] > firstLargest) {
				secondLargest = firstLargest;
				firstLargest = values[i];
			} else if (values[i] < firstLargest && values[i] > secondLargest) {
				secondLargest = values[i];
			}
		}
		return secondLargest;
	}
}
