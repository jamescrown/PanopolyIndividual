public interface Playable extends Identifiable{
    double getNetWorth();
    Site[] getAssets();
    int getKnockoutAmount();
    String[] getRetainableCards();
    int getPosition();
    int getNumberOfStations();
    double getCash();
    int getNumberOfUtilities();
    int getNumberOfProperties();
    void buyProperty(Site boughtSite);
}
