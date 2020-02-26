

/*
 * CSE 360: Assignment01 - Miguel Angel Garcia-Peguero - ClassID: 194
 * 
 * This file contains a class that creates a SimpleList() object which is an 
 * array of size 10. Additionally there is a methods to create, remove, add, search, get
 * the count and convert to string
 */
package cse360assign2;
/**
 * This class creates a new SimpleList object which is made up of a 10 element array and 
 * an integer that holds the count of the integers in the array. This also houses other 
 * helper methods to manipulate display and search the object .
 *  
 * @author Miguel
 */

public class SimpleList {

	private int[] list;
	private int count;
	/**
	 * This method creates a new SimpleList object using n0 parameters by setting list 
	 * equal to a 10 element integer array and setting the count equal to zero
	 	*/
	SimpleList() {

		list = new int[10];
		count = 0;

	}
	
	/**
	 * This method adds an array to the index 0 and shift all other element right. If the
	 * count is not equal to the size of the array (10) then it will increment the count.
	 * Otherwise the element at index 9 will be overwritten when shifting and "fall off"
	 * 
	 * @param num is the integer to be added to the array 
	 */
	public void add(int num) {

		for (int index = count; 0 < index; index--) {

			if (index != 10) {

				list[index] = list[index - 1];

			}

		}
		list[0] = num;

		if (count < 10) {

			count++;

		}

	}
	
	/**
	 * This method removes an element, num, from the array called list if it exists otherwise 
	 * it does nothing. If element is found and remove it shifts the elements as necessary
	 *  
	 * @param num the number to be removed
	 */
	public void remove(int num) {

		int index = search(num);

		if (index != -1) {
			while(index < count-1) {
				list[index] = list[index +1];
				index++;
			}
			count--;
		}

	}

	/**
	 * This method returns the integer that is the current count of integers in the simple
	 * list.
	 * 
	 * @return count is the current amount of integers in the simple list array
	 */
	public int count() {
		return count;
	}
	
	/**
	 * This method converts the array into a string and returns that string
	 * 
	 * @return arr is the new string of the array
	 */
	public String toString() {
		String arr = "";
		
		if(count != 0) {
			
			for (int index = 0; index < count - 1; index++) {
				arr = arr + list[index] + ", ";
			}
			arr = arr + list[count - 1];
			
		}

		return arr;

	}

	/**
	 * This method searches for a given integer in the simple list array and returns its 
	 * index. If it doesn't exist it return -1
	 * 
	 * @param num is the number you wish to locate
	 * @return index is the index to be returned
	 */
	public int search(int num) {

		int index = 0;
		while (num != list[index] && (index <= count)) {
			index++;
		}
		if (index > count) {
			index = -1;
		}

		return index;
	}
}
