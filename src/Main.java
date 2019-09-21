public class Main {

    public static void main(String[] args) {

        SweetThing obj1 = new Biscuit("b1", 2, 4, "lol");
        SweetThing obj2 = new Biscuit("b2", 3, 1, "kek");
        SweetThing obj3 = new Candy("c1", 2.4, 3.3, 14);
        SweetThing obj4 = new Candy("c2", 1.1, 5, 8);
        SweetThing obj5 = new Jellybean("j1", 1, 6.3, 9);
        SweetThing obj6 = new Jellybean("j2", 2.1, 4.1, 11);
        SweetThing obj7 = new Toffee("t1", 3.2, 7, true);
        SweetThing obj8 = new Toffee("t2", 2.2, 5.9, false);

        ConcreteBox box = new ConcreteBox();
        box.add(obj1);
        box.add(obj2);
        box.add(obj3);
        box.add(obj4);
        box.add(obj5);
        box.add(obj6);
        box.add(obj7);
        box.add(obj8);
        box.add(obj4);
        System.out.println("Box weight = " + box.getWeight() + "g.");
        System.out.println("Box price = " + box.getPrice() + "$");
        box.printAll();

        box.deleteByIndex(2);
        box.deleteLast();
        System.out.println("\nAfter delete");
        box.printAll();

        box.reduceWeight(10);
        System.out.println("\nAfter reduceWeight");
        System.out.println("Box weight = " + box.getWeight() + "g.");
        box.printAll();

        box.add(obj1);
        box.add(obj2);
        box.add(obj3);
        box.add(obj4);
        System.out.println("\nAfter add");
        box.printAll();

        box.reducePrice(15);
        System.out.println("\nAfter reducePrice");
        System.out.println("Box price = " + box.getPrice() + "$");
        box.printAll();
    }
}
