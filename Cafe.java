/* This is a stub for the Cafe class */

public class Cafe extends Building{
    private int nCoffeeOunces;
    private int nSugarPackets;
    private int nCreams;
    private int nCups;

    public Cafe(String name,String address, int nFloors, int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        super(name, address, nFloors);
        //System.out.println("You have built a cafe: ☕");
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
    }

    public void sellCoffee(int size, int nSugarPackets, int nCreams){
        int value = 2;
        if (this.nCoffeeOunces < 1 | this.nSugarPackets < 1 | this.nCreams < 1 | this.nCups < 1){
            System.out.println("-----------\nYou need to restock. One of your items is out of stock");


            this.restock((value * size), (value * nSugarPackets), (value * nCreams), (value * nCreams));
        }
        

        else if (this.nCoffeeOunces < size | this.nSugarPackets < nSugarPackets | this.nCreams < nCreams | this.nCups < 1){
            System.out.println("-----------\nYou need to restock. One of your items isn't enough to make the requested amount of coffee");
            this.restock((value * size), (value * nSugarPackets), (value * nCreams), (value * nCreams));
        }

        System.out.println("----------------Selling Coffee!-------------");
        this.nCoffeeOunces -= size;
        this.nSugarPackets -= nSugarPackets;
        this.nCreams -= nCreams;
        this.nCups -= 1;
        System.out.println("Coffee sold!\n------------");
        }
      

    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        System.out.println("----------------Restocking Cafe!-------------");
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
        System.out.println("Cafe restocked! Proceeding to delivering requested amount of coffee\n------------");
    }

    public String toString(){
        return (this.name + " has " + this.nCoffeeOunces + " ounces of coffee, " + this.nSugarPackets + " packs of sugar, " + this.nCreams + " splashes of cream, and " + this.nCups + " cups.");
    }
    
    public static void main(String[] args) {
        Cafe cc = new Cafe("Campus Cafe", "Neilson Drive", 3, 5, 3, 3, 7);
        System.out.println(cc);
        cc.sellCoffee(6, 3, 2);
        System.out.println(cc);
        cc.sellCoffee(6, 3, 2);
        System.out.println(cc);
  

    }
    
}
