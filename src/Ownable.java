public interface Ownable {
    Playable getOwner();
    double getPrice();
    double getMortgageAmount();
    void addOwner(Player player);
}
