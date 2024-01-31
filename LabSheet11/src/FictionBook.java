import java.time.Year;
 
	public class FictionBook implements Author,Book 
	{
		private String author_name;
		private String email;
		private String title;
		private int publicYear;
		private int space;
		private String lastName;
		private String firstName;
 
		public String getTitle() 
		{
			return title;
		}
		
		public FictionBook(String title,int publicYear) 
		{
			this.title = title;
			this.publicYear = publicYear;
		}
		
		public void setAuthorName(String name) 
		{
			author_name = name;
		}
		
		public String getLastName() 
		{
			space = author_name.indexOf(" ");
			lastName = author_name.substring(space+1);
			return lastName.toUpperCase();
		}
		
		public String getFirstName() 
		{
			space = author_name.indexOf(" ");
			firstName = author_name.substring(0,space);
			return firstName.toUpperCase();
		}
		
		public int totalPublicYear() {
			return Year.now().getValue()-publicYear;
		}
 
		public void setEmail(String email)
		{
			this.email = email;
		}
		
		public boolean checkFormatName() 
		{
			if(author_name.indexOf(" ") != -1){
				return true;
			}
			else return false;
		}
		
		public boolean checkEmail() 
		{
			if(email.endsWith("@hotmail.com")||email.endsWith("@windowslive.com")){
				return true;
			}
			else return false;
		}
		
		public String toString() 
		{
			return getTitle()+" write by "+getLastName().substring(0,1)+"."
					+getFirstName()+"("+email+")"+"\nPublished for "
					+totalPublicYear()+" years.";
		}
 
 
}