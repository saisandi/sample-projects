package excpetionhand_ex;

public class solution {

	public static void main(String[] args) {
		
		mycalculator mc=new mycalculator();
		try {
			System.out.println(mc.power(3,2));
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
