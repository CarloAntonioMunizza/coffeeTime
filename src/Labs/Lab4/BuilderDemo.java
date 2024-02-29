package Labs.Lab4;

/*
Carlo Munizza Cam7134@psu.edu.
I declare that what has been written in this work has been written by me and that
no part has been copied from scientific publications, the Internet or from other
online sources or was already presented in the academic field by me or by other
students.
*/

/*
	creates a new StringBuilder object
	appends "Hello" and " World" to the object
	inserts "Java " at index 6
	reverses the string
	deletes "Java " from the string
	prints the string
*/

public class BuilderDemo {
	public static void main(String[] args) {
		// Create a new StringBuilder object
		StringBuilder builderString = new StringBuilder();

		builderString.append("Hello");
		builderString.append(" World");
		System.out.println("After append: " + builderString.toString());

		builderString.insert(6, "Java ");
		System.out.println("After insert: " + builderString.toString());

		builderString.reverse();
		System.out.println("After reverse: " + builderString.toString());

		builderString.reverse(); // Re-reverse to get back the original string after insertion

		builderString.delete(6, 11); // Removing "Java " which was inserted earlier
		System.out.println("After delete: " + builderString.toString());
	}
}
