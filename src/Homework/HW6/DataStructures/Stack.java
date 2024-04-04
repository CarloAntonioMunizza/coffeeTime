package Homework.HW6.DataStructures;

/*
Carlo Munizza Cam7134@psu.edu.
I declare that what has been written in this work has been written by me and that
no part has been copied from scientific publications, the Internet or from other
online sources or was already presented in the academic field by me or by other
students.
*/

/*
	Create a stack of size 5
	create a try-catch block to handle fullStackException
	Push 5 values to the stack
	create a try-catch block to handle emptyStackException
	Pop 5 values from the stack
*/

public class Stack {
	private int[] stack; // stack array
	private int top; // top of the stack
	private int size; // size of the stack

	public Stack(int size) { // constructor
		this.size = size; // set the size of the stack
		stack = new int[size]; // create the stack array
		top = -1; // set the top of the stack to -1
	}

	public void push(int value) throws fullStackException{ // push a value to the stack
		if(top == size - 1) // if the stack is full
			throw new fullStackException(); // throw a fullStackException
		stack[++top] = value; // push the value to the stack
	}

	public int pop() throws emptyStackException{ // pop a value from the stack
		if (top == -1) // if the stack is empty
			throw new emptyStackException(); // throw an emptyStackException
		return stack[top--]; // pop the value from the stack
	}

	public class emptyStackException extends Exception{ // emptyStackException class
		public emptyStackException(){ // constructor
			super("Stack is empty"); // call the super constructor
		}
	}

	public class fullStackException extends Exception{ // fullStackException class
		public fullStackException(){ // constructor
			super("Stack is full"); // call the super constructor
		}
	}
}
