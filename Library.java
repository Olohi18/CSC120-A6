import java.util.Hashtable;

public class Library extends Building {
    private Hashtable<String, Boolean> collection;

    public Library(String name, String address, int nFloors) {
        super(name, address, nFloors);
        System.out.println("You have built a library: 📖");
        this.collection = new Hashtable<String, Boolean>();
    }

    //Adds book to Library //check if it exists first also
    public void addTitle(String title){
        System.out.println("------------\nAdding " + title);
        this.collection.put(title, true);
    }

    //Removes book from library
    public String removeTitle(String title){
      if (this.collection.get(title) == true){
        System.out.println("------------\nRemoving " + title);
        this.collection.remove(title);
        return ("------------\n" + title + " removed from library"); 
      }
      else{
        return("------------\n" + title + " not in library.");
      }
    }

    //updates the value of the title if available from true to false during check out
    public void checkOut(String title){
      //System.out.println(this.collection.keySet());
      if (this.collection.containsKey(title)){
        if (this.collection.get(title) == true){
          System.out.println("------------\nChecking out " + title);
          this.collection.replace(title, true, false);
        
          System.out.println("------------\n" + title + " checked out of library");
        }
        else{
          System.out.println(title + " not available now");
        }
      }
      else{
        System.out.println(this.name + " does not have " + title);
      }
    }

    //Returns a book and updates its availability to true
    public void returnBook(String title){
      if (this.collection.containsKey(title)){
        System.out.println("------------\nChecking in " + title);
        this.collection.replace(title, false, true);
        System.out.println("------------\n" + title + " returned to library");
      }
      else{
        System.out.println(title + " not in library.");
      }
    }

    public boolean containsTitle(String title){
      if (this.collection.containsKey(title)){
        System.out.println("-----------\n" + title + " is available at " + this.name);
        return true;
      }
      else{
        System.out.println(title + " is not available at " + this.name);
        return false;
      }
    }


    public String toString(){
      this.collection.keys();
      System.out.println("--------------------------------");
      String library = "The books at " + this.name + " are: ";
      for (String book : this.collection.keySet()){
        library += "\n" + book;
      }
      return library;
    }

  
    public static void main(String[] args) {
        Library Neilson = new Library("Neilson", "Massachusetts", 5);
        Neilson.addTitle("Golden Gulag by Rotkins");
        Neilson.addTitle("Empower by Daniels");
        Neilson.addTitle("Labouring Women by Smallwood Stephanie");
        Neilson.checkOut("Golden Gulag by Rotkins");
        System.out.println(Neilson.removeTitle("Golden Gulag by Rotkins"));
        Neilson.containsTitle("Empower by Daniels");
        Neilson.checkOut("Empower by Daniels");
        Neilson.returnBook("Golden Gulag by Rotkins");
        System.out.println(Neilson);;

    }
  
  }