package chapter3;


			public class Account   {

			

				private String name;
				private double balance;

				public Account(String name, double balance) {

				this.name = name;
				this.balance = balance;
				}

					
				
				
				public String getName(){					
				return name;}

				public void setName(String name) {
				
				this.name = name;
				}


				
				public double getBalance(){
				return balance;}




				public void deposit (double depositAmount) {
				balance = depositAmount + balance; }
				

				public void withdraw (double withdrawAmount){ 
				 
				

				if(withdrawAmount > balance) {
				System.out.print("insufficient balance"); 
                                 } 
				else {
				balance = balance - withdrawAmount; 
				}
	

				}
				}

					

				

				



			

			