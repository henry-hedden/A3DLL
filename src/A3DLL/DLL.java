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
// DLLTesterInteger Output:

// The DLL looks like this:  EMPTY
// Inserted Last: 11. The DLL looks like this:  [11] 
// Inserted Last: 33. The DLL looks like this:  [11] [33] 
// Inserted Last: 55. The DLL looks like this:  [11] [33] [55] 
// There are  3 items in the list. First:    11. Last:    55. 
// Removed First: 11. The DLL looks like this:  [33] [55] 
// Removed Last: 55. The DLL looks like this:  [33] 
// There are  1 items in the list. 
// Is the list empty?  false
// Inserted First: 22. The DLL looks like this:  [22] [33] 
// Inserted Last: 44. The DLL looks like this:  [22] [33] [44] 
// Inserted First: 66. The DLL looks like this:  [66] [22] [33] [44] 
// There are  4 items in the list. First:    66. Last:    44. 
// 
// Removed First Item: 66. The DLL looks like this:  [22] [33] [44] 
// Removed Last Item: 44. The DLL looks like this:  [22] [33] 
// There are  2 items in the list. 
// Removed First Item: 22. The DLL looks like this:  [33] 
// Removed Last Item: 33. The DLL looks like this:  EMPTY
// Is the list empty?  true
// BUILD SUCCESSFUL (total time: 0 seconds)
// 
// Actual Output:
// --------------------  
// 
// DLLTesterInteger Output:
// 
// EMPTY
// Inserted Last: 11. [11] 
// Inserted Last: 33. [11] [33] 
// Inserted Last: 55. [11] [33] [55] 
// There are  3 items in the list. First:    11. Last:    55. 
// Removed First: 11. [33] [55] 
// Removed Last: 55. [33] 
// There are  1 items in the list. 
// Is the list empty?  false
// Inserted First: 22. [22] [33] 
// Inserted Last: 44. [22] [33] [44] 
// Inserted First: 66. [66] [22] [33] [44] 
// There are  4 items in the list. First:    66. Last:    44. 
// 
// Removed First Item: 66. [22] [33] [44] 
// Removed Last Item: 44. [22] [33] 
// There are  2 items in the list. 
// Removed First Item: 22. [33] 
// Removed Last Item: 33. EMPTY
// Is the list empty?  true
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
// 2018-03-03              HH    Implemented size() and
//                                    isEmpty() methods
// 2018-03-03              HH       Updated code header
//                              with sample output from
//                    A3DLLTesterIntegerOutput2018.docx
// 2018-03-03              HH       Implemented methods
//                     getFirstItem() and getLastItem()
// 2018-03-05              HH   Changed parameters from
//                                   Object to generics
// 2018-03-05              HH   Implemented insertFirst
//                               and insertLast methods
// 2018-03-05              HH       Implemented methods
//                   removeFirstItem and removeLastItem
// 2018-03-07              HH    Removed sentinel nodes
// 2018-03-07              HH   Increment and decrement
//                    size in insert and remove methods
// 2018-03-07              HH    Added special case for
//                         removing from list of size 1
// 2018-03-07              HH    Added output to header
// 2018-03-07              HH     Fixed toString method

package A3DLL;

import java.util.NoSuchElementException;

/**
 * Implements a Doubly Linked List, as defined in the
 * {@link DLLADT} interface, using the {@link DLLNode} class.
 * @author Henry Hedden
 */
class DLL<T> implements DLLADT<T> {

	/** Head node. */
	private DLLNode<T> head;

	/** Tail node. */
	private DLLNode<T> tail;

	/** Number of elements in list. */
	private int size;

	/**
	 * Constructor for Doubly Linked List.
	 */
	public DLL() {
		head = null;
		tail = null;
		size = 0;
	}

	/**
	 * Provide the number of items in the list.
	 * @return size of list (int)
	 */
	@Override
	public int size() {
		return size;
	}

	/**
	 * Is the list empty?
	 * @return <code>true</code> if empty, otherwise <code>false</code>
	 */
	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	/**
	 * Return the first item without removing it.
	 * @return first element in list
	 * @throws NoSuchElementException 
	 */
	@Override
	public T getFirstItem() throws NoSuchElementException {
		if (isEmpty())
			throw new NoSuchElementException("List is empty!");
		return head.getElement();
	}

	/**
	 * Return the last item without removing it.
	 * @return last element in list
	 * @throws NoSuchElementException 
	 */
	@Override
	public T getLastItem() throws NoSuchElementException {
		if (isEmpty())
			throw new NoSuchElementException("List is empty!");
		return tail.getElement();
	}

	/**
	 * Add an item to the front of the list.
	 * @param element element to add
	 */
	@Override
	public void insertFirstItem(T element) {
		if (isEmpty())
			head = tail = new DLLNode<>(element, null, null);
		else {
			DLLNode<T> n = new DLLNode<>(element, null, head);
			head.setPrevNode(n);
			head = n;
		}
		size++;
	}

	/**
	 * Add an item to the end of the list.
	 * @param element element to add
	 */
	@Override
	public void insertLastItem(T element) {
		if (isEmpty())
			head = tail = new DLLNode<>(element, null, null);
		else {
			DLLNode<T> n = new DLLNode<>(element, tail, null);
			tail.setNextNode(n);
			tail = n;
		}
		size++;
	}

	/**
	 * Remove an item from the front of the list.
	 * @return first item in list
	 * @throws NoSuchElementException 
	 */
	@Override
	public T removeFirstItem() throws NoSuchElementException {
		if (isEmpty())
			throw new NoSuchElementException("List is empty!");
		T element = head.getElement();
		if (size == 1) {
			head = null;
			tail = null;
		} else {
			head = head.getNextNode();
			head.setPrevNode(null);
		}
		size--;
		return element;
	}

	/**
	 * Remove an item from the end of the list.
	 * @return last item in list
	 * @throws NoSuchElementException 
	 */
	@Override
	public T removeLastItem() throws NoSuchElementException {
		if (isEmpty())
			throw new NoSuchElementException("List is empty!");
		T element = tail.getElement();
		if (size == 1) {
			head = null;
			tail = null;
		} else {
			tail = tail.getPrevNode();
			tail.setNextNode(null);
		}
		size--;
		return element;
		
	}
	
	/**
	 * Creates a String representing the contents of the array.
	 * Format: [N1] [N2] [N3] ...
	 * @return String containing every element in order
	 */
	public String toString() {
		String s = "The DLL looks like this:  ";
		if (isEmpty())
			return s + "EMPTY";
		DLLNode<T> n = head;
		do {
			s += String.format("[%s] ", n.getElement());
			n = n.getNextNode();
		} while (n != null);
		return s;
	}
	
}
