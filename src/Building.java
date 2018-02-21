public class Building extends Site implements Improvable, Colourable{  // this is basically the improvable class talked about in lectures
    private boolean boolHotels = false;
    private int numHouses = 0;
    private double baseRentPrice;
    private String colour;
    private double costOfHouse = 100.0;//colour.getCostOfHouse();
    public Building(String name,double rent, String group, double cost, double mortgageAmount){//, Playable buyer
        baseRentPrice = rent;
        Identifier = name;
        colour = group;
        price = cost;
        mortgagePrice = mortgageAmount;
       // owner.addProperty(this.Site);
    }
    @Override
    public void addOwner(Player player){
        owner = player;
    }
    @Override
    public String getColour(){
        return colour;
    }
    @Override
    public double getCostOfHouse(){
        return costOfHouse; //need to create colour class or interface , probably dont need an interface
    }
    @Override
    public double getPrice(){
        return price;
    }
    //improvable methods
    @Override
    public int getNumHouses() {
        return numHouses;
    }
    @Override
    public boolean getHotelBoolean(){
        return boolHotels;
    }
    @Override
    public void buildHouses(int numberOfHouses){
            if((numHouses + numberOfHouses)<5){
                numHouses += numberOfHouses;
            }//include payment method call
    }
    @Override
    public void buildHotel(){
        if(boolHotels == false) {
            boolHotels = true;
        }
    }
    @Override
    public void sellHotel(){
        if(boolHotels==true){
            boolHotels=false;
        }
    }
    @Override
    public void sellHouses(int numberOfHouses){
        if((numHouses-numberOfHouses)>=0){
            numHouses -= numberOfHouses;
        }
    }

// Mortgage Methods
    @Override
    public double getMortgageAmount() {
        return mortgagePrice;
    }
//Locatable Methods
    @Override
    public Locatable goBack() {
        return null;
    }
    @Override
    public Locatable goForward() {
        return null;
    }
    @Override
    public Playable getOwner() {
        return owner;
    }

    //Rentable Methods
    @Override
    public double getRentalAmount(){
        return baseRentPrice*(numHouses+1);
    }

}
