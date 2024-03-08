import java.util.ArrayList;
/* This is a stub for the House class */
public class House extends Building {
  private ArrayList<String> residents;
  private boolean hasDiningRoom;
  private boolean hasElevator;

  //When inheriting, you have to enter every attribute and define super later
  public House(String name, String address, int nFloors, boolean hasDiningRoom, boolean hasElevator) {
    super(name, address, nFloors);
    this.residents = new ArrayList<String>();
    this.hasDiningRoom = hasDiningRoom; // Is this right? What you mean by pass as a parameter?
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
    System.out.println("............" + name + " added.............");
  }

  //removes a resident from a house
  //implement the isResident fuction into the program
  public String moveOut(String name){
    if (isResident(name)){
      System.out.println("------------\nRemoving " + name);
      this.residents.remove(name);
      return (name + " removed!");}
    else{
      return (name + " doesn't live in this house");}
    }

  //Checks if a person is a resident of a house
  public boolean isResident(String person){
    return this.residents.contains(person);
  }  

  //prints out the names of the residents in a house
  public String toString(){
    String desc = super.toString();
    if (this.hasDiningRoom = true){
      desc += ". It has a dining room.";
    }
    if (this.hasElevator){
      desc += " It has an elevator.";
    }
    System.out.println(desc);
    System.out.println("The residents of " + this.name + " are: ");
    for (String r:this.residents){
      System.out.println(r);}
    return("done!");

    }
    
  

  public static void main(String[] args) {
    House parsons = new House("Parsons", "19 RoundHill Road", 3, true, false);
    // System.out.println(parsons.hasDiningRoom());
    // System.out.println(parsons.nResidents());
    parsons.moveIn("Olohi");
    parsons.moveIn("Oyale");
    parsons.moveIn("Agaba");
    parsons.moveIn("x");
    parsons.moveOut("x");

    System.out.println(parsons);


    

  }

}