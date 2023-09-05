import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTest extends Mygit{
	@Test
	public void createActi()
	{
		Reporter.log("Create Acti",true);
	}

	@Test
		public void mopdifyActi()
		{
			Reporter.log("Modify Acti",true);
		}
}
