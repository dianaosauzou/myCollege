/*
* File name Diana :
* Author Diana Osauzou :
* Student number C18364651:
* Description of class drives entire program
*/

package application;
//This is the name off my class
import java.util.ArrayList;
//Here I imported the scanner to allow for user defined objects and datatStructures package
import java.util.Scanner;
import dataStructures.*;

public class StudentsLinked {
	//creates linked list myStudent
LinkedList<Student> myStudent = new LinkedList<Student>();
public StudentsLinked(Student Student)
{
	
Scanner myMax = new Scanner(System.in); 
//Int b is the max of objects allowed in the list
int b;
//Keeps the user in a loop until they enter an allowable amount
	do
	{
	System.out.println("How many students would you like to add (no greater than 10)?");
	b = myMax.nextInt();
	}while (b>10);
	//Adds the amount of objects input by the user
	for(int i = 1; i <= b; i++)
    {
		add(i);
    }
	displayAllValues();
	removebyNumber(Student);
	removebyCode(Student);
	
	
}
	public void removebyNumber(Student Student)
	{
		//students number
	String number;
	//Input by the user
	Scanner myOb0 = new Scanner(System.in); 
	System.out.println("What is the number of the student you would like to remove?");
	number=myOb0.nextLine();
	//creates a new student with the variables defined by the user
	Student otherStudent= new Student(number, null, 0, "dt   ");
	//refers back to the equals method
	if  (otherStudent.equals(Student))
	{
	myStudent.remove(Student);
    System.out.println("The student was located");
 	displayAllValues();
	}
	else
	
	System.out.println("The student was not located");
	 displayAllValues();
}
	public void removebyCode (Student Student)
	{
		//students code
	String progCode;
	//input by the user
	Scanner myObj = new Scanner(System.in); 
	System.out.println("What is the programme of students you would like to remove?");
	progCode=myObj.nextLine();
	//creates a new student with the variable defined by the user
	Student otherStudent= new Student(null, null, 0, progCode);
	//refers back to the equals method
	if  (otherStudent.equal(Student, otherStudent))
	{
		
	myStudent.remove(Student);
	System.out.println("Succesfully removed");
	displayAllValues();
	}
	else
	{
		
		System.out.println("The student was not located");
	}	
 }
	
public void add(int i)
{
	//students number
	String number;
	//students name
	String name;
	//students entryyear
	int entryYear;
	//students progcode
	String progCode;
	//All input by the user through the scanner
	Scanner myObj = new Scanner(System.in); 
	System.out.println("What is the student number?");
	number=myObj.nextLine();
	System.out.println("What is the student name?");
	name=myObj.nextLine();
	System.out.println("What is the student entry year?");
	entryYear=myObj.nextInt();
	System.out.println("What is the student programme code?");
	progCode=myObj.nextLine();
	progCode=myObj.nextLine();
	//creates student with the user defined variables
	Student Student = new Student(number, name, entryYear, progCode);
	//adds the student to the list myStudent
	myStudent.add(Student);
}
public void displayAllValues()
{//if the list is not empty the list is displayed or a message is displayed
	if (!myStudent.isEmpty())
	{
		
		System.out.println(myStudent.toString());	
	}
	else
		System.out.println("The list is empty");
}

    public static void main(String[] args)
    {
    	StudentsLinked driver = new StudentsLinked(null);
    	driver.add(0);
    	driver.displayAllValues();
    	driver.removebyCode(null);
    	driver.removebyNumber(null);
    	  	
    }

}

