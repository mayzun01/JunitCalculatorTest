import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

public class AdditionTest {
	private int x = 10;
	private int y = 5;
	
	Addition addition = new Addition(x,y);

	@Test
	public void testAddition()
	{
		System.out.println("*** Test use of Addition ***");
		int z = addition.twoValues();
		System.out.println(" Result: addition of " +x+ " and " +y+ " is " + z );
		assertEquals(20,z);
	}
}
