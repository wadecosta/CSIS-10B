package lab1;

import java.util.Scanner;
/**
 * Write a description of class GroceryCheckoutWithItemClass here.
 * Use a single ARRAY OF ITEM Objects to store the data for the purchases
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GroceryCheckoutWithItemClass
{
    public static void main(String [] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        int numItems, i = 0;

        System.out.print("How many items? ");
        numItems = keyboard.nextInt();
        
        Item[] itemArray = new Item[numItems];
        
        do {
        	String name = keyboard.next();
        	double price = keyboard.nextDouble();
        	itemArray[i] = new Item(name, price);
        	i++;
        }while(i < numItems);
        
        for(i = 0; i < itemArray.length; i++)
        {
        	System.out.println(itemArray[i]);
        }
        
        
        
        
    }
}
