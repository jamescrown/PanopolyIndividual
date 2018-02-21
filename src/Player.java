public class Player implements Playable {
    private String Identifier;
    private double cash;
    private double netWorth = 0;
    private int numberOfProperties =0;
    private Site ownedProperties[];
    private int propertyArrayPointer=0;

    public Player(String name, double startingCash){
        Identifier = name;
        cash = startingCash;
    }
    //MONEY
    public double getNetWorth(){
        return netWorth;
    }
    public double getCash(){
        return cash;
    }
    //PROPERTIES
    public Site[] getAssets(){
        return ownedProperties;
    }
    public int getNumberOfProperties(){
        return numberOfProperties;
    }
    public void buyProperty(Site boughtSite){

        //ownedProperties[propertyArrayPointer] = boughtSite;   //add to the list of owned properties
        propertyArrayPointer++;
        numberOfProperties++;
        boughtSite.addOwner(Player.this);
    }
    public int getNumberOfStations(){
        return 1;
    }
    public int getNumberOfUtilities(){
        return 1;
    }
    //CARDS
    public String[] getRetainableCards(){
        return null;
    }
    public String getIdentifier(){
        return Identifier;
    }

    //MISC
    public int getPosition(){
        return 1;
    }
    public int getKnockoutAmount(){
        return 0;
    }

}
