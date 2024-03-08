import java.util.Hashtable;

public class Library extends Building {
    private Hashtable<String, Boolean> collection;

    public Library(String name, String address, int nFloors) {
        super(name, address, nFloors);
        System.out.println("You have built a library: 📖");
        this.collection = new Hashtable<String, Boolean>();
    }

    //Reedit
    public void addTitle(String title, Boolean available){
        System.out.println("------------\nAdding " + title);
        this.collection.put(title, available);
    }

    //Removes book from library
    public String removeTitle(String title, Boolean available){
      if (available.equals(true)){
        System.out.println("------------\nRemoving " + title);
        this.collection.remove(title, available);
        return (title + "removed from library");
      }
      else{
        return(title + "not in library.");
      }
    }

    //updates availability to false during check out
    public void checkOut(String title, Boolean available){
      if (available.equals(true)){
        System.out.println("------------\nChecking out " + title);
        this.collection.replace(title, available, false);
        System.out.println(title + " checked out from library");
      }
      else{
        System.out.println(title + " not in library.");
      }
    }

    //Returns a book and updates its availability to true
    public void returnBook(String title, Boolean available){
      if (available.equals(false)){
        System.out.println("------------\nChecking in " + title);
        this.collection.replace(title, available, true);
        System.out.println(title + " returned to library");
      }
      else{
        System.out.println(title + " not in library.");
      }
    }

    // public String toString(){
    //   for (String book:this.collection(key)){

    //   }
    // }









  
    public static void main(String[] args) {
        Library Neilson = new Library("Neilson", "Massachusetts", 5);
        Neilson.addTitle("Golden Gulag by Rotkins", true);
        Neilson.addTitle("Empower by Daniels", true);
        Neilson.addTitle("Labouring Women by Smallwood Stephanie", true);
        Neilson.removeTitle("Golden Gulag by Rotkins", true);
        Neilson.checkOut("Golden Gulag by Rotkins", true);
        Neilson.returnBook("Golden Gulag by Rotkins", false);


    }
  
  }