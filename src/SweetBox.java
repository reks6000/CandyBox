public interface SweetBox {
    void add (SweetThing sweet);
    void deleteByIndex (int i);
    void deleteLast ();
    double getWeight ();
    double getPrice ();
    void printAll ();
    public void reduceWeight (double max_weight);
    public void reducePrice (double max_price);
}
