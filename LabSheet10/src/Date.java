public class Date 
{
		private int dYear;
		private int dMonth;
		private int dDay;

		Date()
		{
			dYear = 1900;
			dMonth = 1;
			dDay = 1;
		}
		
		Date(int year, int month, int day)
		{
			dYear = year;
			dMonth = month;
			dDay = day;
		}
		
		public void setDate(int year, int month , int day) 
		{
			dYear = year;
			dMonth = month;
			dDay = day;
		}
		
		public int getYear() 
		{
			return dYear;
		}
		
		public int getMonth() 
		{
			return dMonth;
		}
		
		public int getDay() 
		{
			return dDay;
		}
		
		public String toString() 
		{
			return dMonth+"-"+dDay+"-"+dYear;
		}
}
