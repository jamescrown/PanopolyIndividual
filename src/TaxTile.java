public abstract class TaxTile extends NamedLocation implements Taxable {
    public abstract double getTax();
    public abstract String getTaxType();
}
