public class Addition
{
	private int result;
	private int x;
	private int y;
	
	public Addition(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public int twoValues()
	{
		result = x + y;
		return result;
	}
}
