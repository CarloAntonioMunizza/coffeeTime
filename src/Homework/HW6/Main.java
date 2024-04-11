package Homework.HW6;

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

import Homework.HW6.DataStructures.Stack;

public class Main {
	public static void main(String[] args) throws Stack.emptyStackException { // main throws emptyStackException

		Stack stack = new Stack(5); // Create a stack of size 5

		try { // Push 5 values to the stack
			stack.push(1);
			System.out.println("Pushed 1");
			stack.push(2);
			System.out.println("Pushed 2");
			stack.push(3);
			System.out.println("Pushed 3");
			stack.push(4);
			System.out.println("Pushed 4");
			stack.push(5);
			System.out.println("Pushed 5");
			stack.push(6);
			System.out.println("Pushed 6");
		} catch (Stack.fullStackException e) { // catch fullStackException
			System.out.println(e.getMessage()); // print the message
		}

		try { // Pop 5 values from the stack
			System.out.println(stack.pop());
			System.out.println(stack.pop());
			System.out.println(stack.pop());
			System.out.println(stack.pop());
		} catch (Stack.emptyStackException e) { // catch emptyStackException
			System.out.println(e.getMessage()); // print the message
		}
	}
}
