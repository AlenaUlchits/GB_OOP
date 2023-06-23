package hw3;

public class Coffee extends HotDrink {
    private double temperature;
    private boolean isWithMilk;

    public Coffee() {
    }

    public Coffee(String name, String brand, double price, double volume, double temperature) {
        super(name, brand, price, volume);
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public boolean isWithMilk() {
        return isWithMilk;
    }

    public void setWithMilk(boolean withMilk) {
        isWithMilk = withMilk;
    }

    @Override
    public String showProdInfo(){
        return String.format("brand: %s, name: %s, there is milk: %s, temperature: %s,  volume: %s, price: %f", getBrand(), getName()
                ,this.isWithMilk?"Yes":"No", this.temperature, getVolume(), getPrice());
    }

    @Override
    public double calculatePrice() {
        return 0;
    }
}
