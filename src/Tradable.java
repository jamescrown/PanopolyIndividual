public interface Tradable extends Ownable{
    public void tradeTo(double player, double offer); //when player class is created insert here
    public void sellToBank();// not sure if this should exist, what if a player leaves early?
    public void mortgageProperty();
    public void unMortgageProperty();
    public boolean getMortgaged();
}
