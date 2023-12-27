
public class Example701 
{
	public static void main(String[] args) 
	{
		int[] nums = { 12,50,93,45,75,52,80 };
		for (int i=0 ; i < nums.length ; i++ ) 
		{
			System.out.println("Nums["+i+"]= "+nums[i]);
		}
		
		System.out.println("Using foreach to display value from array nums ");
		
		int j=0;
		for (int _number:nums) 
		{
			System.out.println("Nums["+j+"]= "+_number);
			j=j+1;
		}
		printArray(nums);		
	}
	
	
	public static void printArray(int[] _num) 
	{
		System.out.println("Using method to display values from array _num");
		for(int i=0 ; i < _num.length ; i++) 
		{
			System.out.println("Nums["+i+"]= "+_num[i]);
		}
	}
}
