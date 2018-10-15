public class Inventory {

	public Inventory() {
		// constructor
	}

	public String product; // e.g. apple, milk, shoes
	public double price; // e.g. 12.50 or 1.00
	public boolean single; // False if only available with > 1 product (e.g. bottles - only 6)
	public boolean available; // If > 0 products are in the inventory
	public int amount; // amount of products available
	
}
