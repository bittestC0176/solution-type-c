package problem04;

public class RandomGG {
	private int num1;
	private int num2;
	private int result;
	public RandomGG(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
		this.result = num1*num2;
	}
	
	public int getResult() {
		return result;
	}
	
	@Override
	public String toString() {
		return num1+"x"+num2;
	}
}
