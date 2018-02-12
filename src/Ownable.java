public interface Ownable extends Editable {
    public Playable getOwner();
    public void removeOwner();
    public void addOwner();
    public void changeOwner();

    //cards included
}
