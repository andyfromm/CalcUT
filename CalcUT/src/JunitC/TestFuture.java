package JunitC;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import CalcEngine.Calculator;

public class TestFuture {
	
	public static void setUpBeforeClass() throws Exception {
	}

	public static void tearDownAfterClass() throws Exception {
	}

	public void setUp() throws Exception {
	}


	public void tearDown() throws Exception {
	}
	
	public final void CalcTest1(){
		
		assertEquals(Calculator.Calculator(5, 5, 5), 6.38);
		
		
	}
	private void assertEquals(double calculator, double d) {
		// TODO Auto-generated method stub
		
	}

	public final void CalcTest2(){
		
		
		assertEquals(Calculator.Calculator(100, 50, .05), 102.53);

		
	}

}
