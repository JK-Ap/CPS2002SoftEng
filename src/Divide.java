public class Divide implements Operation
{
	public int perform(int x,y) //performs operation on x,y
	{
		if (y == 0) 
		{
			throw new ArithmeticException("denominator == 0!");
			return -1;
		}
		else
		{
			return x/y;
		}
	}
}