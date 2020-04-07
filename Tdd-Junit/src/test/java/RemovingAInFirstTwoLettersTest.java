import static org.junit.Assert.*;

import org.junit.Test;

import Removingchar.RemovingAInFirstTwoLetters;

public class RemovingAInFirstTwoLettersTest {
	RemovingAInFirstTwoLetters c=new RemovingAInFirstTwoLetters();

	@Test
	public void removeAtest() {
	assertEquals("BCD",c.removeA("ABCD"));	
	}


	@Test
	public void removeAtest1() {
	assertEquals("CD",c.removeA("AACD"));	
	}
    

	@Test
	public void removeAtest2() {
	assertEquals("BCD",c.removeA("BACD"));	
	}
	@Test
	public void removeAtest3() {
	assertEquals("BBAA",c.removeA("BBAA"));	
	}

	@Test
	public void removeAtest4() {
	assertEquals("BAA",c.removeA("AABAA"));	
	}

	@Test
	public void removeAtest5() {
	assertEquals("",c.removeA("A"));	
	}
	
	@Test
	public void removeAtest6() {
	assertEquals("",c.removeA("AA"));	
	}
}
