package hw3;

public class Tea extends HotDrink {
    private String type;
    private double temperature;

    public Tea() {
    }

    public Tea(String name, String brand, double price, double volume, String type, double temperature) {
        super(name, brand, price, volume);
        this.type = type;
        this.temperature = temperature;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public String showProdInfo(){
        return String.format("brand: %s, name: %s, tea type: %s, temperature: %s,  volume: %s, price: %f", getBrand(), getName()
                ,this.type, this.temperature, getVolume(), getPrice());
    }

    @Override
    public double calculatePrice() {
        return 0;
    }
}
