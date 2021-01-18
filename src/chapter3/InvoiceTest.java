package chapter3;


import java.util.Scanner;

		public class InvoiceTest {			//class test declaration

	public static void main(String[] args)	{		// main method to begin execution



		Invoice newInvoice = new Invoice(1, "biscuit", 5, 200.00 );

 
 System.out.printf("Invoice number is: %d%n Invoice description is: %s%n Invoice quantityPurchased is: %d%n Invoice pricePerItem is: %.2f%n", newInvoice.getNumber(), newInvoice.getDescription(), newInvoice.getQuantityPurchased(), newInvoice.getPricePerItem() );


		Scanner input = new Scanner(System.in);


 		 System.out.println("Enter Invoice number"); 				  // prompt
		 newInvoice.setNumber(input.nextInt());

		 System.out.println("Enter Invoice description");
		newInvoice.setDescription(input.nextLine());

		System.out.println("Enter Invoice quantityPurchased");
		newInvoice.setQuantityPurchased(input.nextInt());

		System.out.println("Enter Invoice pricePerItem");
		newInvoice.setPricePerItem(input.nextDouble());


		System.out.printf("Invoice Amount is %.2f\n" ,newInvoice.getInvoiceAmount());

		}
			}


		






		

		

		

		
		
	
	






		
		