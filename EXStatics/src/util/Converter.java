package util;

public class Converter {
	
	public static final double IOF = 0.06;
	
	public static double converter(double dollarPrice, double dollars) {
		return dollarPrice * dollars + (dollarPrice * dollars * IOF);
	}

}
