/*
 * CSE 360: Assignment01 - Miguel Angel Garcia-Peguero - ClassID: 194
 * 
 * This class is responsible for running the tests for each method in the class 
 */
package assign1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
/**
 * This class is responsible for testing all the methods in the simple list class
 * 
 * @author Miguel
 */
class SimpleListTest {
	
	/**
	 * This method is responsible for testing the the creation of the simple list object is
	 * successful and not null
	 */
	@Test
	public void testSimpleList() {
		SimpleList list;
		list = new SimpleList();
		
		assertNotNull(list);
	}
	@Test
	public void testSimpleList2() {
		SimpleList list;
		list = new SimpleList();
		
		assertEquals(0,list.count());
	}
	@Test
	public void testSimpleList3() {
		SimpleList list;
		list = new SimpleList();
		
		assertEquals("",list.toString());
	}
	/**
	 * This method test the add method by adding 11 integers to the simple list and accounting
	 * for fall off
	 */
	@Test
	public void testAdd() {
		SimpleList list = new SimpleList();
		list.add(1);
		list.add(2);
		list.add(10);
		list.add(40);
		list.add(7000);
		list.add(2);
		list.add(1);
		list.add(4);
		list.add(123);
		list.add(16);
		list.add(1);
		assertEquals("1, 16, 123, 4, 1, 2, 7000, 40, 10, 2", list.toString());
	}
	/**
	 * This method test the remove by adding to the list and removing from the beginning middle 
	 * and end the comparing the to  string to the expected 
	 */
	@Test
	public void testRemove() {
		SimpleList list = new SimpleList();
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(1);
		list.remove(1);
		list.remove(3);
		list.remove(5);
		assertEquals("2, 4", list.toString());
	}
	@Test
	public void testRemove2() {
		SimpleList list = new SimpleList();
		list.add(3);
		list.add(5);
		list.add(3);
		list.add(1);
		list.add(1);
		list.remove(1);
		list.remove(3);
		assertEquals("1, 5, 3", list.toString());
	}
	/**
	 * thsi method tests the count by adding 11 integers to produce a count of 10,
	 * removing one to produce a cound of 9 and adding one to produce a count of 10
	 */
	@Test
	public void testCount() {
		
		SimpleList list = new SimpleList();
		assertEquals(0, list.count());
		
		list.add(10);
		list.add(9);
		list.add(8);
		
		assertEquals(3, list.count());
					
	}
	@Test
	public void testCount2() {
		
		SimpleList list = new SimpleList();
		assertEquals(0, list.count());
		
		list.add(10);
		list.add(9);
		list.add(8);
		list.add(7);
		list.add(6);
		list.remove(8);
		
		assertEquals(4, list.count());
					
	}
	@Test
	public void testCount3() {
		
		SimpleList list = new SimpleList();
		assertEquals(0, list.count());
		
		list.add(10);
		list.add(9);
		list.add(8);
		list.add(7);
		list.add(6);
		list.add(10);
		list.add(9);
		list.add(8);
		list.add(7);
		list.add(6);
		list.add(10);
		list.add(9);
		list.add(8);
		list.add(7);
		list.add(6);
		
		assertEquals(10, list.count());
					
	}
	/**
	 * This add 10 elements to the array and compares them to the expected output of the to 
	 * string method in order to test it
	 */
	@Test
	public void testToString() {
		SimpleList list = new SimpleList();
		list.add(13);
		list.add(10);
		list.add(9);
		
		assertEquals("9, 10, 13",list.toString());
		
	}
	@Test
	public void testToString2() {
		SimpleList list = new SimpleList();
		list.add(13);
		list.add(10);
		list.add(9);
		list.remove(10);
		
		assertEquals("9, 13",list.toString());
		
	}
	@Test
	public void testToString3() {
		SimpleList list = new SimpleList();
		list.add(11);
		list.add(10);
		list.add(9);
		list.add(8);
		list.add(7);
		list.add(6);
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(1);
		list.add(0);
		
		assertEquals("0, 1, 2, 3, 4, 5, 6, 7, 8, 9",list.toString());
		
	}
	
	/**
	 * this method test the search method by adding 5 element and searching for an exsisting
	 * and none existing one
	 */
	@Test
	public void testSearch() {
		SimpleList list = new SimpleList();
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(3);
		list.add(3);
		
		
		assertEquals(0, list.search(3));
		
	}
	@Test
	public void testSearch2() {
		SimpleList list = new SimpleList();
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(3);
		list.add(3);
		
		
		assertEquals(2, list.search(2));
		
	}
	@Test
	public void testSearch3() {
		SimpleList list = new SimpleList();
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(3);
		list.add(3);
		
		assertEquals(-1, list.search(7));
		
		
	}
}
