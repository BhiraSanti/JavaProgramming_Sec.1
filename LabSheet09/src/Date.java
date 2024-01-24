public class Date 
{
	private int year;
	private int month;
	private int day;

	Date(int year, int month, int day)
	{
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public int getYear() 
	{
		return this.year;
	}
	
	public int getMonth() 
	{
		return this.month;
	}
	
	public int getDay() 
	{
		return this.day;
	}
	
	public int setYear(int year) 
	{
		return this.year = year;
	}
	
	public int setMonth(int month) 
	{
		return this.month = month;
	}
	
	public int setDay(int day) 
	{
		return this.day = day;
	}
	
	//return a string in the from "MM/DD/YYYY" with leading zero
	public String toString() 
	{
		//use built-in function String.format() to from a formatted String
		//Specifier to print leading zero => 01/02/2024
		return String.format("%02d/%02d/%4d",month,day,year );
	}
	
	public void setDate(int year, int month , int day) 
	{
		this.year = year;
		this.month = month;
		this.day = day;
	}
}