public interface Actionable extends Identifiable {
    public void performActionOn(Playable player);
    public String explainAction();
}
