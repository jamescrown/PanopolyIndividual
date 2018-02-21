public interface Actionable extends Identifiable {
    void performActionOn(Playable player);
    String explainAction();
}
