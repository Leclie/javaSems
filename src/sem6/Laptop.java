package sem6;

public class Laptop {

    private String model; // Модель
    private String processor; // Процессор
    private int ram; // Оперативная память
    private int storage; // Жесткий диск
    private String graphicsCard; // Видеокарта
    private double displaySize; // Дисплей
    private int batteryLife; // Видеокарта
    private double weight; // Вес
    private double price; // Стоимость

    public Laptop(String model) {
        this.model = model;
    }

    public Laptop(String model, String processor, int ram, int storage, String graphicsCard, double displaySize, int batteryLife, double weight, double price) {
        this.model = model;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.graphicsCard = graphicsCard;
        this.displaySize = displaySize;
        this.batteryLife = batteryLife;
        this.weight = weight;
        this.price = price;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public double getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(double displaySize) {
        this.displaySize = displaySize;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "model='" + model + '\'' +
                ", processor='" + processor + '\'' +
                ", ram=" + ram +
                ", storage=" + storage +
                ", graphicsCard='" + graphicsCard + '\'' +
                ", displaySize=" + displaySize +
                ", batteryLife=" + batteryLife +
                ", weight=" + weight +
                ", price=" + price +
                '}';
    }
}
