package excpetionhand_ex;

public class mycalculator {
	
	double power(int a,int b) throws Exception {
		if(a==0||b==0) {
			throw new Exception("a and b should not be zero.");
		}
		if(a<0||b<0) {
			throw new Exception("a and b should not be negative.");
		}
		
		double k=Math.pow(a, b);
		return k;
		
	}

}
