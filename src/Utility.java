public class Utility extends Site{ //this class and trainStation would fall under PrivateProperty
    public Utility(String name, double cost, double mortgage){
        Identifier = name;
        price= cost;
        mortgagePrice = mortgage;
    }
    @Override
    public void addOwner(Player player){
        owner = player;
    }
    public double getPrice(){
        return price;
    }
    public int getUtilityAmount(Playable Player){
        return Player.getNumberOfUtilities();
    }
    @Override
    public double getRentalAmount(){
        return getUtilityAmount(getOwner())*Dice.getCurrentRoll();// get the number of utilities the owner owns and multiply it by the roll ( getCurrentRoll)??
    }
    @Override
    public Locatable goForward(){
        return null;
    }
    @Override
    public Locatable goBack(){
        return null;
    }
    @Override
    public Playable getOwner() {
        return owner;
    }
    @Override
    public double getMortgageAmount(){
        return mortgagePrice;
    }
    //Identifiable methods
    @Override
    public String getIdentifier(){
        return Identifier;
    }
}
