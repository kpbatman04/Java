package abstractt;

public class eagle extends bird implements flyable {
    public eagle() {
        super("eagle");
    }

    @Override
    public void fly() {
        System.out.println("eagle is the fastest bird.");
    }

    public static void main(String[] args) {
        eagle eag = new eagle();
        eag.fly();
    }
}
