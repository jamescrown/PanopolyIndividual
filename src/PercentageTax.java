public class PercentageTax extends TaxTile {
    private double weight;
    public PercentageTax(double incomePercentage){
        weight=incomePercentage;
    }
    public double getTax(){
        return weight;
    }
    public String getTaxType(){
        return "Percentage";
    }
}
