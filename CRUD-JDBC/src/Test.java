import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.student.manage.Student;
import com.student.manage.StudentDao;

public class Test {

	public static void main(String[] args) throws IOException {	
    System.out.println("Welcome to Student Management App");
    BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
    while(true)
    {
    	System.out.println("Press 1 to add student");
    	System.out.println("Press 2 to delete student");
    	System.out.println("Press 3 to display student");
    	System.out.println("Press 4 to exit app");
    	int c=Integer.parseInt(br.readLine());
    	if(c==1)
    	{
    		//add student
    		System.out.println("Enter user name :");
    		String name=br.readLine();
    		System.out.println("Enter user phone :");
    		String phone=br.readLine();
    		System.out.println("Enter user city :");
    		String city=br.readLine();
    		
    		Student st=new Student(name,phone,city);
    		boolean answer=StudentDao.insertStudentToDB(st);
    		if(answer) {
    			System.out.println("Student added successfully...");
    	               }
    		else
    		{
    			System.out.println("Something went wrong...try again...");
    		}
    		System.out.println(st);
    	}  
    	else if(c==2)
    	{
    		//delete student
    		System.out.println("Enter student ID to delete: ");
    		int userID=Integer.parseInt(br.readLine());
    		StudentDao.deleteStudent(userID);
    		boolean f=StudentDao.deleteStudent(userID);
    		if(f) {
    			System.out.println("Student deleted successfully...");
    	               }
    		else
    		{
    			System.out.println("Something went wrong...try again...");
    		}
    	}
    	else if(c==3)
    	{
    		//display student
    		StudentDao.showAllStudent();
    	}
    	else if(c==4)
    	{
    		//exit
    		break;
    	}
    	else
    	{
    		
    	}
    	System.out.println("Thank you so much");
    	
    }
    
   
	}

}
