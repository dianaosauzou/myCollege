/*
* File name Diana :
* Author Diana Osauzou :
* Student number C18364651:
* Description of class 
*/
package dataStructures;

import application.Student;

//This class implements the ADT definition of a linked list using the same signatures. Note that we can add extra methods
//here once all of the methods listed in the ADT interface are included.

public class LinkedList<T> implements LinkedListADT<T> {
	 private static final int NOT_FOUND = 0;
	 private int count;  // the current number of elements in the list
	 private LinearNode<T> list; //pointer to the first element 
	 private LinearNode<T> last; //pointer to the last element 
	
	 
	 //-----------------------------------------------------------------
	 //  Creates an empty list.
	 //-----------------------------------------------------------------
	    public LinkedList()
	    {
	       this.count = 0;
	       this.last = null;
	       this.list = null;
	    }
	  //6. Return first element
		public LinearNode<T> getList() {
			return list;
		}

//5. Return last element
		public LinearNode<T> getLast() {
			return last;
		}
	 // 1.  Adds one element to the end of this list
	   public void add (T element)
	   {      
		   LinearNode<T> node = new LinearNode<T> (element); 
       
		   if (size() == 0) {  
			   	this.last = node; // This is the last and the 
			 	this.list = node; // first node
			 	this.count++;
		   }//end if
		   else
		     { 
				  last.setNext(node); // add node to the end of the list
				  last = node; // now make this the new last node.
				  this.count++;   
		      } //end else
	   }
	   

	   //  Removes and returns the first element from this list
	
	public T remove()
	   {
		
		   T result = null;
			if (isEmpty()) {
				System.out.println("There are no nodes in the list");
			}//end if
			else {
				result = this.list.getElement();
				this.list = this.list.getNext();
				count--;
			}//end else
			return result;

	   }


	  
	   
	   //  8.Returns true if this list contains no elements
	   public boolean isEmpty()
	   {
		   if (this.list == null)
			   return true;
		   else
			   return false;
	   }


	   //  Returns the number of elements in this list
	   public int size()
	   {
		   return this.count;
	   }

	   // 4. Returns a string representation of this list
	  


	public String toString()
	   {
		   LinearNode<T> current = this.list;
		   String fullList = "";
		   
		   for (current = this.list; current != null; current = current.getNext())
		   {
			   fullList = fullList + "\n" + current.getElement().toString();
		   }//end for
		   
		   return fullList + "\n";
	   }
	//3.Removes specified element
	
	public T remove(T element)
	{
		T  result = null;
		
		boolean found = false;
		LinearNode <T> previous = null;
		LinearNode <T> current = null;
		if (isEmpty())
			System.out.println("There are no nodes in this list");
		
			if (list.getElement().equals(element))
			{
				result = list.getElement();
				current = list.getNext();
				remove();
			}
				
		else {
				previous = list;
				current = list.getNext();
				for (int look=1; look <count && !found; look++)
					if (current.getElement().equals(element))
						found=true;
					else 
					{
						previous=current;
						current = current.getNext();
						
					}
				if (!found)
					System.out.println("No such element");
				result=list.getElement();

			}
		count--;
		return result;

	
					
	}
	//7.Returns next element
	public T returnNext(T element)
	{
		
		LinearNode<T> bubbles;
		LinearNode<T> current=this.list;
		
		bubbles = current.getNext();
		
		return bubbles.getElement();
	}

}
