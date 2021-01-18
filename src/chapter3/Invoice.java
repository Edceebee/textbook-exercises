


package chapter3;
/* Create a class called Invoice that a hardware store might use to represent an invoice for an item sold at the store.
 An Invoice should include four pieces of information as instance variables—a part number (type String), a part
 description (type String), a quantity of the item being purchased (type int) and a price per item (double). Your
 class should have a constructor that initializes the four instance variables. Provide a set and a get method for each
 instance variable.In addition, provide a method named getInvoiceAmount that calculates the invoice amount
 (i.e.,multiplies the quantity by the price per item), then returns the amount as a double value. If the quantity is not
 positive, it should be set to 0. If the price per item is not positive, it should be set to 0.0. Write a test app named
  InvoiceTest that demonstrates class Invoice’s capabilities. */


	public class Invoice {

		private int number;
		private String description;
		private int quantityPurchased;
		private double pricePerItem;

		public Invoice(int number, String description, int quantityPurchased, double pricePerItem) {
			this.number = number;
			this.description = description;
			this.quantityPurchased = quantityPurchased;
			this.pricePerItem = pricePerItem;
		}

		public int getNumber() {
			return number;
		}

		public void setNumber(int number) {
			this.number = number;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public int getQuantityPurchased() {
			if (quantityPurchased < 0)
				quantityPurchased = 0;
			return quantityPurchased;

		}

		public void setQuantityPurchased(int quantityPurchased) {
			this.quantityPurchased = quantityPurchased;
		}

		public double getPricePerItem() {
			if (pricePerItem < 0)
				pricePerItem = 0;
			return pricePerItem;
		}

		public void setPricePerItem(double pricePerItem) {
			this.pricePerItem = pricePerItem;
		}

		public double getInvoiceAmount () {
			double invoiceAmount;
			invoiceAmount = quantityPurchased * pricePerItem;
			return invoiceAmount;
		}
	}




		