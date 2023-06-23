package hw3;

public abstract class HotDrink implements Comparable<HotDrink>{
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

    public abstract double calculatePrice();
    @Override
    public int compareTo(HotDrink o) {
        int res = name.compareTo(o.name);
        if (res == 0){
            return Double.compare(calculatePrice(), o.calculatePrice());
        }
        return res;
    }
}