package Fizz;

public class Fizz {
	
	private int[] MAGIC_NUM = {3,5};
	private String[] MAGIC_WORD = {"fizz", "buzz"};
	
	public Object fizzBuzz(int tour) {
		for(int i = 0; i < 2; i++) {
			if(tour % MAGIC_NUM[i] == 0) {
				return MAGIC_WORD[i];
			}
		}
		
		return Integer.toString(tour);
	}
}
