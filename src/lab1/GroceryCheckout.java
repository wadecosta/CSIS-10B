package lab1;

import java.util.Scanner;
/**
 * class GroceryCheckout models a checkout counter at a store
 * Use PARALLEL ARRAYS to store the data for all the purchases
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GroceryCheckout
{
	public static void welcome()
	{
		System.out.println("Welcome to MPC");
	}
	
	public static double average(double [] priceArray)
	{
		double total = 0;
		for(int i = 0; i < priceArray.length; i++)
		{
			total += priceArray[i];
		}
		
		return total/priceArray.length;
	}
	
    public static void main(String [] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        boolean peasFound = false;
        
        int numItems = 0;
        System.out.println("How many items? ");
        numItems = keyboard.nextInt();
        double priceArray[] = new double[numItems];
        String nameArray[] = new String[numItems];
        
        for(int i = 0; i < numItems; i++)
        {
        	System.out.println("enter next item and price:");
        	nameArray[i] = keyboard.next();
        	priceArray[i] = keyboard.nextDouble();
        	if(nameArray[i].equalsIgnoreCase("peas"))
        		peasFound = true;
        }
        
        welcome();
        
        for(int i = (numItems-1); i >= 0; i--)
        {
        	System.out.printf("%s %.2f\n", nameArray[i], priceArray[i]);
        }
        
        System.out.println();
        if(peasFound)
        	System.out.printf("average price: %.2f", average(priceArray));     
        else
        	System.out.println("no average value");
        
    }
}
