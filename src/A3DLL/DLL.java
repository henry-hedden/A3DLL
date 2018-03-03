// Program: A3DLL
// Written by: Henry Hedden
// Program Description: The program will implement a Node
// based Doubly Linked List using Generics.
// File name: A3DLL.java
// File description: Implements a Doubly Linked List, as
// defined in the DLLADT interface, using the DLLNode class.
// Other files in this project: 
// * DLLADT.java
// * DLLNode.java
// * DLLTesterInteger.java
// 
// Challenges: 
// Time Spent: 
// Specified Output:
// --------------------         
// 
// The DLL looks like this:  [null] [null] 
// Inserted Last: 11. The DLL looks like this:  [null] [11] [null] 
// Inserted Last: 33. The DLL looks like this:  [null] [11] [33] [null] 
// Inserted Last: 55. The DLL looks like this:  [null] [11] [33] [55] [null] 
// There are  3 items in the list. First:    11. Last:    55. 
// Removed First: 11. The DLL looks like this:  [null] [33] [55] [null] 
// Removed Last: 55. The DLL looks like this:  [null] [33] [null] 
// There are  1 items in the list. 
// Is the list empty?  false
// Inserted First: 22. The DLL looks like this:  [null] [22] [33] [null] 
// Inserted Last: 44. The DLL looks like this:  [null] [22] [33] [44] [null] 
// Inserted First: 66. The DLL looks like this:  [null] [66] [22] [33] [44] [null] 
// There are  4 items in the list. First:    66. Last:    44. 
// 
// Removed First Item: 66. The DLL looks like this:  [null] [22] [33] [44] [null] 
// Removed Last Item: 44. The DLL looks like this:  [null] [22] [33] [null] 
// There are  2 items in the list. 
// Removed First Item: 22. The DLL looks like this:  [null] [33] [null] 
// Removed Last Item: 33. The DLL looks like this:  [null] [null] 
// Is the list empty?  true
// BUILD SUCCESSFUL (total time: 0 seconds)
// 
// Actual Output:
// --------------------  
// 
//                   Revision History
// 
// Date:                   By:                  Action:
// ----------------------------------------------------
// 2018-03-03              HH              Created file
// 2018-03-03              HH     Completed code header
// 2018-03-03              HH    Added abstract methods
// 2018-03-03              HH   Documented method stubs
// 2018-03-03              HH      Changed return types
//                              from Object to generics
// 2018-03-03              HH            Added instance
//                            variables and constructor
// 2018-03-03              HH       Documented instance
//                            variables and constructor
package A3DLL;

import java.util.NoSuchElementException;

/**
 * Implements a Doubly Linked List, as defined in the
 * {@link DLLADT} interface, using the {@link DLLNode} class.
 * @author Henry Hedden
 */
class DLL<T> implements DLLADT<T> {

	/** Reference to first element. */
	private DLLNode<T> head;

	/** Reference to last element. */
	private DLLNode<T> tail;

	/** Number of elements in list. */
	private int size;

	/**
	 * Constructor for Doubly Linked List.
	 */
	public DLL() {
		head = new DLLNode<>();
		tail = new DLLNode<>();
		head.setNextNode(tail);
		tail.setPrevNode(head);
		size = 0;
	}

	/**
	 * Provide the number of items in the list.
	 * @return size of list (int)
	 */
	@Override
	public int size() {
		//To change body of generated methods, choose Tools | Templates.
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Is the list empty?
	 * @return <code>true</code> if empty, otherwise <code>false</code>
	 */
	@Override
	public boolean isEmpty() {
		//To change body of generated methods, choose Tools | Templates.
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Return the first item without removing it.
	 * @return first element in list
	 * @throws NoSuchElementException 
	 */
	@Override
	public T getFirstItem() throws NoSuchElementException {
		//To change body of generated methods, choose Tools | Templates.
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Return the last item without removing it.
	 * @return last element in list
	 * @throws NoSuchElementException 
	 */
	@Override
	public T getLastItem() throws NoSuchElementException {
		//To change body of generated methods, choose Tools | Templates.
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Add an item to the front of the list.
	 * @param element element to add
	 */
	@Override
	public void insertFirstItem(Object element) {
		//To change body of generated methods, choose Tools | Templates.
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Add an item to the end of the list.
	 * @param element element to add
	 */
	@Override
	public void insertLastItem(Object element) {
		//To change body of generated methods, choose Tools | Templates.
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Remove an item from the front of the list.
	 * @return first item in list
	 * @throws NoSuchElementException 
	 */
	@Override
	public T removeFirstItem() throws NoSuchElementException {
		//To change body of generated methods, choose Tools | Templates.
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Remove an item from the end of the list.
	 * @return last item in list
	 * @throws NoSuchElementException 
	 */
	@Override
	public T removeLastItem() throws NoSuchElementException {
		//To change body of generated methods, choose Tools | Templates.
		throw new UnsupportedOperationException("Not supported yet.");
	}
	
}
