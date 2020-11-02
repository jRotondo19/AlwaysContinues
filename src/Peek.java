
public class Peek {

	private int[] items;
	private int top = 0;
	
	public int peek() {
		if (top == 0) { //modified because I do not have all the variables
			return 0;
		}
		
		else {
			return items[top - 1];
		}
	}
	
}
