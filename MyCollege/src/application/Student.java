/*
* File name Diana :
* Author Diana Osauzou :
* Student number C18364651:
* Description of class :holds student data
*/

package application;

import dataStructures.*;


public class Student <E>  {
//students number
	String number;
	//students name
	 String name;
	 //students entryyear
int entryYear;
//students programme code
		String progCode;
		 //constructs a student based on variables given with empty value
		public Student()
		{
			
			this.number="";
			this.name="";
			this.entryYear=0;
			this.progCode="";
		}
		
		//constructer
		public Student(String n, String sn, int y, String progCode)
		{
			
			this.number =n;
			this.name=sn;
			this.entryYear=y;
			//if the entry year is greater than 2019 or less than 2003 the year is automatically set to 0
			   if (entryYear>2019)
				   this.entryYear=0000;
			    else if (entryYear<2003)
			    	this.entryYear=0000;
			    else 
			    	this.entryYear=y;
			   
			   this.progCode=progCode;
			//if the program codes first two letters are not dt the code is set to error
			 if(!(progCode.substring(0,2).equalsIgnoreCase("dt")))
				 this.progCode="error";
			    else  
			    this.progCode=progCode;
		}

//returns the students number
		public  String getNumber() {
			return number;
		}

//sets the students number
		public void setNumber(String number) {
			this.number = number;
		}
//gets the students name

		public String getName() {
			return name;
		}

//sets the students name
		public void setName(String name) {
			this.name = name;
		}

//gets the students entry year
		public int getEntryYear() {
			return entryYear;
		}

//sets the students entry year
		public void setEntryYear(int entryYear) {
			this.entryYear = entryYear;
		}

//gets the studentys program code
		public String getProgCode() {
			return progCode;
		}

//sets the students program code
		public void setProgCode(String progCode) {
			this.progCode = progCode;
		}
//checks whether the otherStudents prog code is equal to a prog code already in the system

	
		//checks whether the otherStudents number is equal to a number code already in the system
	
	
		public boolean equals(Object otherObject, Student<E> otherStudent)
		{
			Student<E> Student = (Student<E>) otherObject;
			this.number = otherStudent.getNumber();
			if (this.number.equals(Student.getNumber()) && this.number.equals(Student.getNumber()))
					return true;
				else
					return false;
			
		}
		
		public boolean equal(Object otherObject, Student<E> otherStudent)
		{
			Student<E> Student = (Student<E>) otherObject;
			if (this.progCode.equals(otherStudent.getProgCode()))
	return true;
				else
					return false;
			
		}
		//displays the list in a user friendly method
		public String toString() 
		{
		
			return "The students number is " + this.number + ", the students name is " + this.name + ", the students year of entry was "+ this.entryYear + ", the students programme code is " + this.progCode ;
		}
		//compares whether one students number is greater than another students number
		public boolean compareGreater(Student Student)
		{
			Student<E> otherStudent = (Student<E>) Student;
			if (this.number.compareTo(otherStudent.getNumber())>0)
				return true;
			else
				return false;
			
		}
		//compares whether one students number is less than another students number
		public boolean compareLower(Student Student)
		{
			Student<E> otherPair = (Student<E>) Student;
			if (this.number.compareTo(otherPair.getNumber())<0)
				return true;
			else
				return false;
			
		}


}


	


