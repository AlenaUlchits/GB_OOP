package hw1;

public class HotDrink{
    private String name;
    private String brand;
    private double price;

    private double volume;

    public HotDrink(){

    }
    public HotDrink(String name, String brand, double price, double volume) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String showProdInfo(){
        return String.format("Brand: %s, name: %s, volume: %s, price: %f", brand, name, volume, price);
    }
}