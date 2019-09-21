public class Jellybean extends SweetThing {
    private float jellybean_special;

    public Jellybean () {
        super();
        this.jellybean_special = 0;
    }

    public Jellybean (String name, double weight, double price, float jellybean_special) {
        super(name, weight, price);
        this.jellybean_special = jellybean_special;
    }

    public String toString() {
        return getClass().getName() + "@" + super.toString() + jellybean_special;
    }
}
