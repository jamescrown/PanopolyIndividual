public class Main {
    public static void main(String[] args){
        System.out.println("Hello Panopoly");
        Dice myDice = new Dice();
        System.out.println(myDice.rollDice(2,6));
        EquallyLikelyDice mySecondDice = new EquallyLikelyDice();
        System.out.println(mySecondDice.rollDice(2, 6));
    }
}
