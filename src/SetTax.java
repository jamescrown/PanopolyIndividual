public class SetTax extends TaxTile {
    private double taxAmount;
    public SetTax(double tax){
        taxAmount = tax;
    }
    public double getTax(){
        return taxAmount;
    }
    public String getTaxType(){
        return "Set";
    }
}
