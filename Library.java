import java.util.Hashtable;

import javax.management.RuntimeErrorException;

public class Library extends Building {
    private Hashtable<String, Boolean> collection;

    public Library(String name, String address, int nFloors) {
        super(name, address, nFloors);
        System.out.println("You have built a library: 📖");
        this.collection = new Hashtable<String, Boolean>();
    }

    /**
     * @param name
     * @return the truth value of whether or not the library contains a specific book
     */
    public boolean isAvailable(String name){
      if (containsTitle(name)){
        return this.collection.get(name);
    }
      else{
        return false;
      }}

    /**
     * Adds a book to the libarary's collection
     * @param String title
     */
    public void addTitle(String title){
      if (!(containsTitle(title))){
        System.out.println("-----------Adding " + title + "--------------");
        this.collection.put(title, true);}
      else{System.out.println(title + " is already in " + this.name + ". You can only add one copy of " + this.name + " Use isAvailable() to see if it's checked in");}

    }

    /**
     * Removes book from library's collection
     * @param String title
     * @return String that indicates if the book has been removed or otherwise, if it's not present
     */
    public String removeTitle(String title){
      if (containsTitle(title)){
        System.out.println("------------Removing " + title + "-------------");
        this.collection.remove(title);
        return (title + " removed from library"); 
      }
      else{
        throw new RuntimeException(title + " not in library.");
      }
    }

    /**
     * Updates the value of the book's title if available in hashtable from true to false
     * @param String title
     */
    public void checkOut(String title){
      //System.out.println(this.collection.keySet());
      if (containsTitle(title)){
        if (isAvailable(title)){
          System.out.println("Checking out " + title);
          this.collection.replace(title, true, false);
          System.out.println(title + " checked out of library");
        }
        else{
          System.out.println(title + " checked out previously already. Come back later!");
        }
      }
      else{
        throw new RuntimeException(this.name + " does not have " + title + "  in stock");
      }
    }

    /**
     * Returns a book and updates its associated boolean in the library's hashtable to true
     * @param String title
     */
    public void returnBook(String title){
      if (containsTitle(title)){
        if (!(isAvailable(title))){
        System.out.println("Checking in " + title);
        this.collection.replace(title, false, true);
        System.out.println(title + " checked in to library");}
        else{System.out.println(title + " has been checked in to library already");}
      }
      else{
        System.out.println(title + " not in library.");
      }
    }

    /**
     * Checks if the library contains a specific book
     * @param String title
     * @return
     */
    public boolean containsTitle(String title){
      return (this.collection.containsKey(title));
    }

    /**
     * Prints out the books in the library
     * @return String library
     */
    public void printCollection(){
      System.out.println();
      if (this.collection.isEmpty()){
        System.out.println("There are no books at " + this.name);
      }
      else{
      String library = "The books at " + this.name + " are: ";
      for (String book : this.collection.keySet()){
        library += "\n" + book;
      }
      System.out.println(library);}
    }

  
    public static void main(String[] args) {
        Library Neilson = new Library("Neilson", "Massachusetts", 5);
        System.out.println(Neilson.isAvailable("Golden Gulag by Rotkins"));
        Neilson.addTitle("Golden Gulag by Rotkins");//Can't add two books
        Neilson.addTitle("Golden Gulag by Rotkins");//Can't add two books
        System.out.println(Neilson.isAvailable("Golden Gulag by Rotkins"));
        Neilson.checkOut("Golden Gulag by Rotkins");
        Neilson.checkOut("Golden Gulag by Rotkins");
        System.out.println(Neilson.removeTitle("Golden Gulag by Rotkins"));
        System.out.println(Neilson.isAvailable("Golden Gulag by Rotkins"));
        Neilson.printCollection();

    //     Neilson.addTitle("Empower by Daniels");
    //     //Neilson.checkOut("Golden Gulag by Rotkins");
    //     Neilson.removeTitle("Golden Gulag by Rotkins"); // Need to "Sout" to see side effect
    //     Neilson.containsTitle("Empower by Daniels");
    //     Neilson.checkOut("Empower by Daniels");
    //     Neilson.returnBook("Golden Gulag by Rotkins");
    //     System.out.println(Neilson);

    // }
    }
  }