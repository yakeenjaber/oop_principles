package abstraction.abstract_classes;

public class IPhone extends Phone{

    public IPhone() {
    }

    public IPhone(String brand, String color, int storage, double price) {
        super(brand, color, storage, price);
    }

    @Override
    public void call() {
        System.out.println("IPhone calls");
    }

    @Override
    public void ring() {
        System.out.println("IPhone rings");
    }

    @Override
    public void text(){
        System.out.println("IPhone texts");
    }
}
