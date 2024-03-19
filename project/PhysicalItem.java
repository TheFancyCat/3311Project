package project;

import java.time.LocalDate;

public class PhysicalItem 
{
	public String name;
	public int itemID;
	public int quantity; //The number of copies in the library, 20.
	public LocalDate rentDate;
	public LocalDate dueDate;
	
	protected PhysicalItem(String name, LocalDate rentDate, LocalDate dueDate)
	{
		this.name = name;
		this.rentDate = rentDate;
		this.dueDate = dueDate;
		this.quantity = 20;
		
		itemID = IDGenerator.getInstance().getNextID();
	}
	
	public void addItem(String name, LocalDate rentDate, LocalDate dueDate)
	{
		new PhysicalItem(name, rentDate, dueDate);
	}
	
	public static void main(String [] args)
	{
		LocalDate rentDate = LocalDate.of(2024, 3, 18);
		LocalDate dueDate = LocalDate.of(2024, 4, 18);
		
		PhysicalItem newBook = new PhysicalItem("Eddie Loves Anime!", rentDate, dueDate);
		
		PhysicalItem newBook2 = new PhysicalItem("Eddie Loves Anime 2!", rentDate, dueDate);
		
		System.out.println(newBook.itemID);
		System.out.println(newBook2.itemID);
	}
}
