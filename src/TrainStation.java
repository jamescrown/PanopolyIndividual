public class TrainStation extends Site {
    //variable in player to state how many stations he/she owns??
    private double baseRentPrice;
   // private double price;
    public TrainStation(String name, double rent, double cost, double mortgage){
        Identifier = name;
        baseRentPrice = rent;
        price = cost;
        mortgagePrice = mortgage;
    }
    @Override
    public void addOwner(Player player){
        owner= player;
    }
    public double getPrice(){
        return price;
    }
    public int getStationAmount(Playable player) {
        return player.getNumberOfStations();
    }
    //rent methods
    @Override
    public double getRentalAmount() {
        if (getOwner() == null) {
            return baseRentPrice;
        } else {
            return getStationAmount(getOwner()) * baseRentPrice; // get the number of stations the owner owns and multiply it by the rent of one
        }
    }
    @Override
    public Locatable goForward() {
        return null;
    }
    @Override
    public Locatable goBack() {
        return null;
    }
    @Override
    public Playable getOwner() {
        return owner;
    }
    @Override
    public double getMortgageAmount() {
        return mortgagePrice;
    }
//Locatable Methods
    @Override
    public String getIdentifier() {
        return Identifier;
    }
}
