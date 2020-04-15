package ProgrammingKnowledge;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddTestClass {

	@Test
	public void Addtest5() {
			MyJunitClass junit= new MyJunitClass();
			assertSame(junit.ConCat("Hello"), junit.ConCat("Hello"));
		}
	
	 @Test
	    public void evenNumberTest(){
		 MyJunitClass junit= new MyJunitClass();
	        assertTrue(junit.isEvenNumber(4));
	    }
	
	}


