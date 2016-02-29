public class Divide implements Operation
{
	public int perform(int x,y) //performs operation on x,y
	{
		int err = 0;
		
		if(y == 0) {
			
			System.out.println("Error occured !");
			err = -999;
			
			return err;
		}
		
		return x/y;
	}
}