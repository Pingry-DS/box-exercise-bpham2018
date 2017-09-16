public class Box <T> 
{

  private T contents;
  private boolean isFull;

  // Make a new empty box
  public Box()
  {
	  super();
	  this.isFull = false;
  }

  // Make a new box pre-filled with contents
  public Box(T c)
  {
	  super();
	  this.contents = c;
	  this.isFull = true;
  }

  /**
   * Check the contents of the box
   * @return T contents of the box
   */
  public T getContents()
  {
	  return contents;
  }

  /**
   * Tell whether the box is full or not
   * @return boolean whether or not the box is full
   */
  public boolean isFull()
  {
	  return isFull;
  }

  /**
   * Empty out the box, and give back hatever was in it
   * @return T whatever was in the box
   */
  public T empty()
  {
	  T holder = contents;
	  contents = null;
	  isFull = false;
	  return holder;
  }
  
  /**
  * Returns string representation of what is in box
  * @return the contents of the box if there are any or "nothing" if contents is null
  */
  public String toString()
  {
	  if(isFull)
	  {
		  return contents.toString();
	  }
	  else
	  {
		  return "nothing";
	  }
  }
  
  public boolean add(T c)
  {
	  if(isFull)
	  {
		  return false;
	  }
	  else
	  {
		  this.contents = c;
		  this.isFull = true;
		  return true;
	  }
  }
	  

  public static void main(String[] args)
  {

    // Make two boxes
    Box<String> stringBox = new Box<String>();
    Box<Integer> intBox   = new Box<Integer>(49);

    // View contents (via toString method)
    System.out.println("The boxes contain: " + stringBox + ", " + intBox);

	stringBox.add("Tootsie Roll");

    // View contents (via toString method)
    System.out.println("The boxes contain: " + stringBox + ", " + intBox);

    //TODO Test your peek method

    // View contents (via toString method)
    System.out.println("The boxes contain: " + stringBox + ", " + intBox);

	stringBox.empty();

    // View contents (via toString method)
    System.out.println("The boxes contain: " + stringBox + ", " + intBox);
  }
}