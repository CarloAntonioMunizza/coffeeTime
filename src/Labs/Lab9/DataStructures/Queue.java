package Labs.Lab9.DataStructures;
/*
Carlo Munizza Cam7134@psu.edu.
I declare that what has been written in this work has been written by me and that
no part has been copied from scientific publications, the Internet or from other
online sources or was already presented in the academic field by me or by other
students.
*/

/*
	Queue creates a linked list of nodes that can be used to store data in a first in first out manner.
	Queue has a head that is used to point to the first node in the list.
	Queue contains a method to add a node to the end of the list.
	Queue contains a method to remove the first node in the list.
	Queue contains a method to display the data in the list.
	Queue contains a method to check if the list is empty.
*/

public class Queue {
	private Node Head; // The first node in the list

	public Queue() { // Constructor
		Head = null; // Initialize the head to null
	}

	public void enqueue(String data) { // Add a node to the end of the list
		Node newNode = new Node(data); // Create a new node
		if (Head == null) { // If the list is empty
			Head = newNode; // Set the head to the new node
		} else { // If the list is not empty
			Node current = Head; // Start at the head
			while (current.getNext() != null) { // Loop until the end of the list
				current = current.getNext(); // Move to the next node
			}
			current.setNext(newNode); // Add the new node to the end of the list
		}
	}

	public void dequeue() { // Remove the first node in the list
		if (Head != null) { // If the list is not empty
			Head = Head.getNext(); // Move the head to the next node
		}
	}

	public void display() { // Display the data in the list
		Node current = Head; // Start at the head
		while (current != null) { // Loop until the end of the list
			System.out.print(current.getData() + " "); // Print the data
			current = current.getNext(); // Move to the next node
		}
		System.out.println(); // Print a new line
	}

	public boolean isEmpty() { // Check if the list is empty
		return Head == null; // Return true if the head is null
	}

	private class Node { // Node class
		private String Data; // The data in the node
		private Node Next; // The next node in the list

		public Node(String data) { // Constructor
			Data = data; // Set the data
			Next = null; // Initialize the next node to null
		}

		public String getData(){ // Get the data in the node
			return Data; // Return the data
		}

		public Node getNext(){ // Get the next node in the list
			return Next; // Return the next node
		}

		public void setNext(Node next){ // Set the next node in the list
			Next = next; // Set the next node
		}
	}
}
