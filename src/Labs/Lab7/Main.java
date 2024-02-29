/*
Carlo Munizza Cam7134@psu.edu.
I declare that what has been written in this work has been written by me and that
no part has been copied from scientific publications, the Internet or from other
online sources or was already presented in the academic field by me or by other
students.
*/
package Labs.Lab7;
import java.util.ArrayList;
import java.util.List;

/*
interface allows the same cost method to be used polymorphically
*/


interface Item_Info {
	double cost(); // Method to calculate cost of an item
}

/*
class implements Item_Info interface
sets attributes
when instantiated calls constructor which calls calculateCostPerItem()
calls cost() to calculate specific tax
*/
class Fruit implements Item_Info {
	private String name;
	private String type; // Local, imported, or tropical
	private int numberOfItems;
	private double costPerItem;

	// Constructor to initialize a Fruit object
	public Fruit(String name, String type, int numberOfItems) {
		this.name = name;
		this.type = type;
		this.numberOfItems = numberOfItems;
		calculateCostPerItem(); // Calculate cost per item based on type
	}

	// Calculate cost per item based on type
	private void calculateCostPerItem() {
		switch (type.toLowerCase()) {
			case "local":
				costPerItem = 0.5;
				break;
			case "tropical":
				costPerItem = 3 * 1.02;
				break;
			case "imported":
				costPerItem = 5;
				break;
		}
	}

	// Override cost method to calculate total cost based on quantity and type
	@Override
	public double cost() {
		// If the fruit is imported, apply an additional 1% tax
		return type.equalsIgnoreCase("imported") ? numberOfItems * costPerItem * 1.01 : numberOfItems * costPerItem;
	}
}

/*
vegetable does the same with different attributes
calls the overrode cost function to return the price based of the type
*/
class Vegetable implements Item_Info {
	private String name;
	private double weight;
	private String type; // Leafy green, cruciferous, root
	private double cost;

	// Constructor to initialize a Vegetable object
	public Vegetable(String name, double weight, String type) {
		this.name = name;
		this.weight = weight;
		this.type = type;
		calculateCost(); // Calculate cost based on type and weight
	}
	/// Method to calculate cost based on vegetable type
	private void calculateCost() {
		switch (type.toLowerCase()) {
			case "leafy green":
				cost = weight * 0.3;
				break;
			case "cruciferous":
				cost = weight * 0.1;
				break;
			case "root":
				cost = weight * 0.5;
				break;
		}
	}

	// Override cost method to return the calculated cost
	@Override
	public double cost() {
		return cost;
	}
}

/*
also implements Item_Info
overriden cost multiplies a fixed number by the number of cans unlike the rest
*/
class Canned implements Item_Info {
	private String name;
	private int numberOfCans;

	// Constructor to initialize a Canned object
	public Canned(String name, int numberOfCans) {
		this.name = name;
		this.numberOfCans = numberOfCans;
	}

	// Override cost method to calculate total cost based on a fixed rate per can
	@Override
	public double cost() {
		return numberOfCans * 1.25;
	}
}

/*
cart contains a list that contains items
add method adds items to the list
total cost iterates through the list and calculates the total cost
*/
class Cart {
	private List<Item_Info> items = new ArrayList<>(); // List to hold items of different types

	// Method to add an item to the cart
	public void addItem(Item_Info item) {
		items.add(item);
	}

	// Method to calculate total cost of all items in the cart
	public double totalCost() {
		double total = 0;
		for (Item_Info item : items) {
			total += item.cost();
		}
		return total;
	}
}


public class Main {
	public static void main(String[] args) {
		// Create instances of Fruit, Vegetable, and Canned items
		Fruit apple = new Fruit("Apple", "Local", 10);
		Fruit banana = new Fruit("Banana", "Tropical", 5);
		Vegetable carrot = new Vegetable("Carrot", 2.0, "Root");
		Vegetable lettuce = new Vegetable("Lettuce", 1.5, "Leafy green");
		Canned soup = new Canned("Soup", 3);
		Canned beans = new Canned("Beans", 2);

		// Create a Cart instance and add items to it
		Cart cart = new Cart();
		cart.addItem(apple);
		cart.addItem(banana);
		cart.addItem(carrot);
		cart.addItem(lettuce);
		cart.addItem(soup);
		cart.addItem(beans);

		System.out.println("Total cost of items in the cart: $" + cart.totalCost());
	}
}
