package Fizz;

public class Fizz {
	
	private int MAGIC_NUM = 3;
	private String MAGIC_WORD = "fizz";
	
	public Object fizzBuzz(int tour) {
		if(tour == MAGIC_NUM) {
			return MAGIC_WORD;
		}
		return Integer.toString(tour);
	}
}
