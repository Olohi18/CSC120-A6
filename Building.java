public class Building {

    protected String name = "<Name Unknown>";
    protected String address = "<Address Unknown>";
    protected int nFloors = 1;

    /**
     * Constructor, initializes the name, address, and number of floors contained in the building
     * @param name
     * @param address
     * @param nFloors
     */
    public Building(String name, String address, int nFloors) {
        if (name != null) { this.name = name; }
        if (address != null) { this.address = address; } 
        if (nFloors < 1) {
            throw new RuntimeException("Cannot construct a building with fewer than 1 floor.");
        }
        this.nFloors = nFloors;
    }
    /**
     * Getter for name of house
     * @return
     */
    public String getName() {
        return this.name;
    }
    /**
     * Getter for address of house
     * @return
     */
    public String getAddress() {
        return this.address;
    }
    /**
     * Getter for number of floors 
     * @return
     */
    public int getFloors() {
        return this.nFloors;
    }
    /**
     * Prints name of building together with its attributes
     */
    public String toString() {
        return this.name + " is a " + this.nFloors + "-story building located at " + this.address;
    }
    
    //Main function for testing the program's functionality
    public static void main(String[] args) {
        Building fordHall = new Building("Ford Hall", "100 Green Street Northampton, MA 01063", 4);
        System.out.println(fordHall);
    }

}
