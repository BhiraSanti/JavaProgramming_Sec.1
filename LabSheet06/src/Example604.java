import java.util.*;
public class Example604 
{
	static Scanner scan = new Scanner(System.in);
	static String studentId,strSubjectId;
	static int subjectId;

	public static void main(String[] args) 	
	{
		inputStudent();
	}
	
	public static void inputStudent() 
	{
		do 
		{
			System.out.print("Enter Student ID : ");
			studentId = scan.next();
			System.out.print("Enter Subject ID : ");
			subjectId = scan.nextInt();
			
			strSubjectId = subjectId+"";	
		}
		while(!(isLength(studentId,strSubjectId))) ;
		{
			System.out.println();
			displayData(isITStudent(studentId),isITSubject(strSubjectId));
		}
	}
	
	public static boolean isLength(String id,String sub_id) 
	{
		if(id.length()==10 && sub_id.length()==7) 
		{
			return true;
		}
		return false;
	}
	
	public static boolean isITStudent(String id) 
	{
		if(id.substring(0,3).equals("211") && id.substring(3,6).equals("311")) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public static boolean isITSubject(String sub_id) 
	{
		if(sub_id.substring(0,2).equals("21") && sub_id.substring(4,5).equals("1")) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public static void displayData(boolean sid,boolean subid) 
	{
		if(sid) 
		{
			System.out.println("Student ID : "+studentId +" 1st Year student in IT");
		}
		else 
		{
			System.out.println("Student ID : "+studentId +" is not 1st Year student in IT");
		}
		if(subid) 
		{
			System.out.println("Enroll in courses for Year 1");
		}
		else 
		{
			System.out.println("Not Enroll in courses for Year 1");
		}
	}
}
