public class Person 
{
	//declare 2 private attribute
	
	private String firstName;
	private String lastName;
	
	//Default Constructor
	//Initialize firstName and lastName to an empty String
	
	Person()
	{
		//firstName = "";
		//lastName = "";
		firstName = lastName = "";
	}
	
	//Constructor with parameters
	Person(String first, String last)
	{
		//firstName = first;
		//lastName = last;
		setName(first ,last);
	}
	
	//Method to set firstName and lastName according to parameters
	public void setName(String first, String last)
	{
		firstName = first;
		lastName = last;
	}
	
	//Method to return firstName
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public String toString()
	{
		return firstName+" "+lastName;
	}
}
