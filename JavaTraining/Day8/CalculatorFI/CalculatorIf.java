package Java8Ex;

public interface CalculatorIf {
	
	    public double calculate(double num1, double num2);

	    static  double square(double num) {
	            return Math.pow(num,2);
	    }

	    static  double cube(double num) {
	            return Math.pow(num,3);
	    }
}
