package Labs.Lab9;
import Labs.Lab9.DataStructures.Queue;
/*
Carlo Munizza Cam7134@psu.edu.
I declare that what has been written in this work has been written by me and that
no part has been copied from scientific publications, the Internet or from other
online sources or was already presented in the academic field by me or by other
students.
*/

/*
	Main creates a new queue and adds data to it.
	Main displays the data in the queue.
	Main removes data from the queue and adds to it.
	Main displays the data in the queue.
	Main enqueues more data to the queue.
	Main displays the data in the queue.
 */

public class Main {
	public static void main(String[] args) {
		Queue queue = new Queue(); // Create a new queue
		queue.enqueue("1"); // Add data to the queue
		queue.enqueue("2"); // Add data to the queue
		queue.enqueue("3"); // Add data to the queue
		queue.enqueue("4"); // Add data to the queue
		queue.enqueue("5"); // Add data to the queue
		queue.display(); // Display the data in the queue

		queue.dequeue(); // Remove the first node in the queue
		queue.dequeue(); // Remove the first node in the queue
		queue.display(); // Display the data in the queue

		queue.enqueue("6"); // Add data to the queue
		queue.enqueue("7"); // Add data to the queue
		queue.display(); // Display the data in the queue
	}
}
