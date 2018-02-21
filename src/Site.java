public abstract class Site extends NamedLocation implements Mortgageable, Rentable{ //parent class of all ownable properties
    public double mortgagePrice; //retrieve info from input file or something similar
    public Playable owner;
    public double price;
    public abstract Playable getOwner();
    public abstract double getMortgageAmount();
    public abstract double getRentalAmount();
    public abstract double getPrice();
    public abstract void addOwner(Player player);
}
