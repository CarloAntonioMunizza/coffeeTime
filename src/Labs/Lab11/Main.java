package Labs.Lab11;

/*
Carlo Munizza Cam7134@psu.edu.
I declare that what has been written in this work has been written by me and that
no part has been copied from scientific publications, the Internet or from other
online sources or was already presented in the academic field by me or by other
students.
*/
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
class Fruit implements Item_Info, Serializable {
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

	@Override
	public String toString() {
		return "Fruit{" +
				"name='" + name + '\'' +
				", type='" + type + '\'' +
				", numberOfItems=" + numberOfItems +
				", costPerItem=" + costPerItem +
				'}';
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

class Vegetable implements Item_Info, Serializable {
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

	@Override
	public String toString() {
		return "Vegetable{" +
				"name='" + name + '\'' +
				", weight=" + weight +
				", type='" + type + '\'' +
				", cost=" + cost +
				'}';
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
class Canned implements Item_Info, Serializable {
	private String name;
	private int numberOfCans;

	// Constructor to initialize a Canned object
	public Canned(String name, int numberOfCans) {
		this.name = name;
		this.numberOfCans = numberOfCans;
	}

	@Override
	public String toString() {
		return "Canned{" +
				"name='" + name + '\'' +
				", numberOfCans=" + numberOfCans +
				'}';
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
class Cart implements Serializable {
	List<Item_Info> items = new ArrayList<>(); // List to hold items of different types

	public void addItem(Item_Info item) {
		items.add(item);
	}

	public void removeItem(Item_Info item) {
		items.remove(item);
	}

	public double totalCost() {
		double total = 0;
		for (Item_Info item : items) {
			total += item.cost();
		}
		return total;
	}

	public void saveCartToFile(String filename) {
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
			out.writeObject(this);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static Cart restoreCartFromFile(String filename) {
		Cart cart = null;
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
			cart = (Cart) in.readObject();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return cart;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < items.size(); i++) {
			sb.append(i + 1).append(". ").append(items.get(i).toString()).append("\n");
		}
		return sb.toString();
	}
}

public class Main {
	private static final String CART_FILE = "cart.dat";

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Cart cart = new Cart();
		int choice;
		boolean quit = false;

		while (!quit) {
			System.out.println("Menu:");
			System.out.println("1. Add item to cart");
			System.out.println("2. Remove item from cart");
			System.out.println("3. Save cart to file");
			System.out.println("4. Restore cart from file");
			System.out.println("5. Display cart total cost");
			System.out.println("0. Quit");
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();

			switch (choice) {
				case 1:
					System.out.println("Select item type:");
					System.out.println("1. Fruit");
					System.out.println("2. Vegetable");
					System.out.println("3. Canned");

					int itemType = scanner.nextInt();
					scanner.nextLine(); // Consume newline

					switch (itemType) {
						case 1:
							System.out.print("Enter fruit name: ");
							String fruitName = scanner.nextLine();
							System.out.print("Enter fruit type (local, tropical, imported): ");
							String fruitType = scanner.nextLine();
							System.out.print("Enter number of items: ");
							int numberOfItems = scanner.nextInt();
							cart.addItem(new Fruit(fruitName, fruitType, numberOfItems));
							break;
						case 2:
							System.out.print("Enter vegetable name: ");
							String vegetableName = scanner.nextLine();
							System.out.print("Enter vegetable weight (kg): ");
							double weight = scanner.nextDouble();
							System.out.print("Enter vegetable type (leafy green, cruciferous, root): ");
							String vegetableType = scanner.next();
							cart.addItem(new Vegetable(vegetableName, weight, vegetableType));
							break;
						case 3:
							System.out.print("Enter canned item name: ");
							String cannedName = scanner.nextLine();
							System.out.print("Enter number of cans: ");
							int numberOfCans = scanner.nextInt();
							cart.addItem(new Canned(cannedName, numberOfCans));
							break;
						default:
							System.out.println("Invalid item type.");
					}
					break;
				case 2:
					System.out.println("Select item to remove:");
					for (int i = 0; i < cart.items.size(); i++) {
						System.out.println((i + 1) + ". " + cart.items.get(i));
					}
					int itemIndex = scanner.nextInt();
					cart.removeItem(cart.items.get(itemIndex - 1));
					break;
				case 3:
					cart.saveCartToFile(CART_FILE);
					System.out.println("Cart saved to file.");
					break;
				case 4:
					cart = Cart.restoreCartFromFile(CART_FILE);
					System.out.println("Cart restored from file.");
					break;
				case 5:
					System.out.println("Total cost of items in the cart: $" + cart.totalCost());
					break;
				case 0:
					quit = true;
					break;
				default:
					System.out.println("Invalid choice.");
			}
		}
		scanner.close();
	}
}

