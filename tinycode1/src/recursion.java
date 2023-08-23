
public class recursion {
	double calcPi(int n) {
		
		return Math.sqrt(6 * recur(n));
	}
	
	double recur(int n) {
		if (n == 1) return 1;
		double num = (1.0/(n*n)) + recur(n-1);
		return num;
	}
	
	public static void main(String[] args) {
		recursion r = new recursion();
		double result = r.calcPi(5);
	    System.out.println("pi(5) is " + result);
	    result = r.calcPi(10);
	    System.out.println("pi(10) is " + result);
	    result = r.calcPi(100);
	    System.out.println("pi(100) is " + result);
	
	}
	
}
