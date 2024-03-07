import java.util.ArrayList;
/* This is a stub for the House class */
public class House {
  private ArrayList<String> residents;
  private boolean hasDiningRoom;

  public House(boolean dining) {
    this.residents = new ArrayList<String>();
    this.hasDiningRoom = dining; // Is this right? What you mean by pass as a parameter?
    System.out.println("You have built a house: 🏠");
  }

  //accessor for DiningRoom
  public boolean hasDiningRoom(){
    return this.hasDiningRoom;
  }

  //accessor for number of residents
  public int nResidents(){
    return this.residents.size();
  }

  //adds a resident to a house
  public void moveIn(String name){
    System.out.println("------------\nAdding " + name);
    this.residents.add(name);
    System.out.println("............" + name + "added.............");
  }

  //removes a resident from a house
  //implement the isResident fuction into the program
  public String moveOut(String name){
    System.out.println("------------\nRemoving" + name);
    this.residents.add(name);
    return (name + " removed!");
  }

  //Checks if a person is a resident of a house
  public boolean isResident(String person){
    return this.residents.contains(person);
  }  
  

  public static void main(String[] args) {
    House parsons = new House(true);
    System.out.println(parsons.hasDiningRoom());
    System.out.println(parsons.nResidents());

  }

}