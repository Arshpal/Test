package Miit_Arshpals_Calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class Testing {

	Calculator c=new Calculator();
	@Test
	public void addTest1() {
		double addResult=c.add(10,20);
		assertEquals(30,addResult,0);
		}
	@Test
	public void addTest2() {
		double addResult=c.add(20.4,30.5);
		assertNotEquals(20.9,addResult,2);
		}

	
	@Test
	public void subTest1() {
		double subResult=c.subtract(10,20);
		assertEquals(-10,subResult,0);
		}
	@Test
	public void subTest2() {
		double subResult=c.subtract(50.6,30.5);
		assertEquals(20.1,subResult,2);
		}
	
	@Test
	public void mulTest1() {
		double mulResult=c.multiply(10,20);
		assertEquals(200,mulResult,0);
		}
	@Test
	public void mulTest2() {
		double mulResult=c.multiply(2.5,0);
		assertEquals(0,mulResult,2);
		}
	
	@Test
	public void divTest1() {
		double divResult=c.divide(10,20);
		assertEquals(0.5,divResult,0);
		}
	@Test
	public void divTest2() {
		double divResult=c.divide(2,0);
		assertEquals(0,divResult,2);
		}
}
