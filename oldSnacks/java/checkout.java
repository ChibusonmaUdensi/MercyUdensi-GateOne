import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.time.LocalDateTime;
public class Checkout {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String moreItems;
        	System.out.println("What is the customer's name?: ");
            String customerName = scanner.nextLine();
            String productName;
             double price;
             int quantity;
             double discountAmount;
	     int amountPaid;	
             List<String> allProduct =  new ArrayList<String>();
            List<Double> allPrices = new ArrayList<Double>();
            List<Integer> allQuantity = new ArrayList<Integer>();

        do {
            System.out.println("What did the user buy? ");
             productName = scanner.nextLine();
             allProduct.add(productName);

		System.out.println("How many pieces? ");
             quantity = scanner.nextInt();
             allQuantity.add(quantity);	

            System.out.println("How much per unit? ");
           
            while (!scanner.hasNextDouble()) {                
	 System.out.println("Invalid price. Please enter a number: ");
                scanner.next(); 
            }
            price = scanner.nextDouble();
            allPrices.add(price);

            
           

            System.out.println("Add more items? (yes/no): ");
            moreItems = scanner.next().toLowerCase();
            scanner.nextLine();

        } while (moreItems.equals("yes"));
	System.out.println("What is your name?: ");
            String name = scanner.nextLine();

		System.out.println("How much discount will he get?: ");
             discountAmount = scanner.nextDouble();
		
	

        
        System.out.println("SEMICOLON STORES");
System.out.println("MAIN BRANCH");
System.out.println("LOCATION: 312, HERBERT MACAULAY, SABO YABA, LAGOS.");
System.out.println("TEL: 07048840550");
System.out.println("Date:"+ LocalDateTime.now());
System.out.println("Cashier's Name" + " " + name);
System.out.println("Customer's Name" + " " + customerName);

System.out.println("==========================================================");
System.out.printf("%10s%10s%10s%10s\n", "ITEM", "QUANTITY", "PRICE",   "TOTAL" );
System.out.println("----------------------------------------------------------");

double sum = 0.0;
double discount = 0.0;
double VATamount = 0.0;
double billTotal = 0.0;

for(int index = 0; index <allProduct.size(); index++) {
    System.out.printf("%10s%10d%10.2f%10.2f\n", allProduct.get(index) , allQuantity.get(index), allPrices.get(index),   allPrices.get(index) * allQuantity.get(index));
    
    sum += allPrices.get(index) * allQuantity.get(index);
    discount = sum * discountAmount / 100;
	VATamount = sum * (17.50 / 100 );
    billTotal = sum - discount + VATamount;
}

System.out.println("----------------------------------------------------------");
System.out.printf("%10s%10s%10s\n", " ",  " ",  "SubTotal:" +" " +" " + " " +" " + " " +" " + sum);
System.out.printf("%10s%10s%10s\n", " ",  " ",  "Discount:" +" " +" " + " " +" " + " " +" " + discount);
System.out.printf("%10s%10s%10s\n", " ",  " ",  "VAT @ 17.50%:" +" " +" " + " " +" " + " " +" " + VATamount);

System.out.println("==========================================================");

System.out.printf("%10s%10s%10s\n", " ",  " ",  "Bill Total:" +"         " + billTotal);

System.out.println("==========================================================");

System.out.printf("%s%f%n", "THIS IS NOT A RECEIPT KINDLY PAY" + " ",     billTotal);

System.out.println("==========================================================");

System.out.println("How much did the customer give to you?");
 amountPaid = scanner.nextInt();

double balance = 0.0;

System.out.println("SEMICOLON STORES");
System.out.println("MAIN BRANCH");
System.out.println("LOCATION: 312, HERBERT MACAULAY, SABO YABA, LAGOS.");
System.out.println("TEL: 07048840550");
System.out.println("Date:"+ LocalDateTime.now());
System.out.println("Cashier's Name" + " " + name);
System.out.println("Customer's Name" + " " + customerName);

System.out.println("==========================================================");
System.out.printf("%10s%10s%10s%10s\n", "ITEM", "QUANTITY", "PRICE",   "TOTAL" );
System.out.println("----------------------------------------------------------");

for(int index = 0; index <allProduct.size(); index++) {
    System.out.printf("%10s%10d%10.2f%10.2f\n", allProduct.get(index) , allQuantity.get(index), allPrices.get(index),   allPrices.get(index) * allQuantity.get(index));
    
    sum += allPrices.get(index) * allQuantity.get(index);
    discount = sum * discountAmount / 100;
	VATamount = sum * (17.50 / 100 );
    billTotal = sum - discount + VATamount;
	balance = amountPaid - billTotal;
}

System.out.println("----------------------------------------------------------");
System.out.printf("%10s%10s%10s\n", " ",  " ",  "SubTotal:" +" " +" " + " " +" " + " " +" " + sum);
System.out.printf("%10s%10s%10s\n", " ",  " ",  "Discount:" +" " +" " + " " +" " + " " +" " + discount);
System.out.printf("%10s%10s%10s\n", " ",  " ",  "VAT @ 17.50%:" +" " +" " + " " +" " + " " +" " + VATamount);

System.out.println("==========================================================");

System.out.printf("%10s%10s%10s\n", " ",  " ",  "Bill Total:" +"         " + billTotal);
System.out.printf("%10s%10s%10s\n", " ",  " ",  "Amount Paid:" +"         " + amountPaid);
System.out.printf("%10s%10s%10s\n", " ",  " ",  "Balance:" +"         " + balance);

System.out.println("==========================================================");

System.out.printf("%10s\n",  "       THANK YOU FOR YOUR PATRONAGE" );

System.out.println("==========================================================");


}
}