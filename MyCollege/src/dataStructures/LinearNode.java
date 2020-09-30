    //************************************************************
/*
* File name Diana :
* Author Diana Osauzou :
* Student number C18364651:
* Description of class 
*/

    //  LinearNode.java      
    //
    //  Represents a node in a linked list.
    //************************************************************
    
    package dataStructures;   


    public class LinearNode<T>
    {
       private LinearNode<T> next;
       private T element;
       private T current;
       private T previous;
    
       //---------------------------------------------------------
       //  Creates an empty node.
       //---------------------------------------------------------
       public LinearNode()
       {
          next = null;
          element = null;
          current = null;
          previous = null;
       }
    
       //---------------------------------------------------------
       //  Creates a node storing the specified element.
       //---------------------------------------------------------
       public LinearNode (T elem)
       {
          next = null;
          element = elem;
          current = null;
          previous = null;
       }
    
       //---------------------------------------------------------
       //  Returns the node that follows this one.
       //---------------------------------------------------------
       public LinearNode<T> getNext()
       {
          return this.next;
       }
    
       //---------------------------------------------------------
       //  Sets the node that follows this one.
       //---------------------------------------------------------
       public void setNext (LinearNode<T> node)
       {
          this.next = node;
       }
    
    
       //---------------------------------------------------------
       //  Returns the element stored in this node.
       //---------------------------------------------------------
       public T getElement()
       {
          return element;
       }
    
       //---------------------------------------------------------
       //  Sets the element stored in this node.
       //---------------------------------------------------------
       public void setElement (T elem)
       {
          element = elem;
       }

	public T getPrevious() {
		// TODO Auto-generated method stub
		return previous;
		
	}

	public void setPrevious(T elem) {
		// TODO Auto-generated method stub
		previous = null;
	}
	public T getCurrent() {
		// TODO Auto-generated method stub
		return current;
		
	}

	public void setCurrent(T elem) {
		// TODO Auto-generated method stub
		current = null;
	}

}

