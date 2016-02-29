public class Calculator
{
	public int calc(Operation op, int x, int y) {
		
		int ans = 0;
		
		ans = op(x, y);
		return ans;
	}
	
}