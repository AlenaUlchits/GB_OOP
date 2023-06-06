package hw1;

public class HotChocolate extends HotDrink{
    private double temperature;

    public HotChocolate() {
    }

    public HotChocolate(String name, String brand, double price, double volume, double temperature) {
        super(name, brand, price, volume);
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public String showProdInfo(){
        return String.format("brand: %s, name: %s, temperature: %s, volume: %s, price: %f", getBrand(), getName()
                , this.temperature, getVolume(), getPrice());
    }
}
