package currencyConverter;

import java.util.*;

public class CurrencyConverter2 {

	public static void main(String[] args) {
		
		CurrencyConverter converter = new CurrencyConverter();
		Scanner scan = new Scanner(System.in);

		while(true)
		{
			System.out.println("\nCurrency Converter");
			System.out.println("Enter Source Currency (Eg:USD) :");
			String fromCurrency = scan.next().toUpperCase();
			
			System.out.println("Enter Target Currency (Eg:INR) :");
			String toCurrency = scan.next().toUpperCase();
			
			System.out.println("Enter The Amount To Convert : ");
			double amount = scan.nextInt();
			
			try {
				double convertedAmount = converter.convert(fromCurrency,toCurrency,amount);
				System.out.printf("Converted Amount :%.2f %s\n",convertedAmount,toCurrency);
			}
			catch(Exception e)
			{
			System.out.println(e.getMessage());	
			}
			System.out.println("Do you want to perfrom another convertion ? (yes/no) ");
			String choice =scan.next();
			
			if(!choice.equalsIgnoreCase("yes"))
			{
				System.out.println("Exit The Program.");
				break;
			}
		}
	}

}
