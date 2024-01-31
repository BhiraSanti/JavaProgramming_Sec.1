public class Rectangle2 implements Shape2 
{
	private double width;
	private double length;
	
	Rectangle2(double widle, double length)
	{
		this.width = width;
		this.length = length;
	}
	
	public double getArea() 
	{
		return this.width * this.length;
	}	
	
	public double getWidth()
	{
		return width;
	}
	
	public double getLength()
	{
		return length;
	}
	
	public String toString() 
	{
		return "Rectangle [ width = "+ this.width + ", length = "+ this.length+"]";
	}
}
