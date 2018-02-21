public class Main {
    public static void main(String[] args){
        Dice myDice = new Dice();
        myDice.rollDice(2,6);

        Player myFirstPlayer = new Player("James", 1000);
        System.out.println(myFirstPlayer.getIdentifier() + "\t Cash: "+myFirstPlayer.getCash()+"\t Properties Owned: "+myFirstPlayer.getNumberOfProperties());

        Building myFirstSite = new Building("Leinster House", 300, "Orange", 2000, 400);
        System.out.println(myFirstSite.getIdentifier()+"\t"+myFirstSite.getRentalAmount()+"\tcolour: " +myFirstSite.getColour()+"\tCost:  " +myFirstSite.getPrice()+"\t mortgage: "+myFirstSite.getMortgageAmount());

        TrainStation myStation = new TrainStation("Heuston Station", 300, 4000, 1000);
        System.out.println(myStation.getIdentifier() + "\trent: " +myStation.getRentalAmount()+"\t cost: "+myStation.getPrice()+"\tMortgage: "+myStation.getMortgageAmount());

        Utility myUtility = new Utility("ESB", 5000, 2500);
        myFirstPlayer.buyProperty(myUtility);
        System.out.println(myUtility.getIdentifier()+"\t cost: "+myUtility.getPrice() +"\t Mortgage: "+myUtility.getMortgageAmount()+"\tOwner: "+(myUtility.getOwner()).getIdentifier());
        System.out.println(myFirstPlayer.getIdentifier()+":\t number of properties: "+myFirstPlayer.getNumberOfProperties());

    }
}
