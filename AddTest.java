package ProgrammingKnowledge;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddTest {
	@Test
	public void Addtest() {
		MyJunitClass junit= new MyJunitClass();
		int result = junit.add(100, 200);
		assertEquals(300, result);
	}

	@Test
	public void Addtes1t() {
		MyJunitClass junit= new MyJunitClass();
		int result = junit.add(100, 200);
		assertFalse(result !=300);
	}
	
	@Test
	public void Addtest2() {
		MyJunitClass junit= new MyJunitClass();
		assertNotNull(junit.add(50, 50));
	}
	@Test
	public void Addtest3() {
		MyJunitClass junit= new MyJunitClass();
		assertNotSame(junit.add(30, 30), junit.add(20, 20));
	}
	@Test
	public void Addtest4() {
		MyJunitClass junit= new MyJunitClass();
		assertNull(junit.ConCat(null));
	}
}
