public abstract class Product {
    private String name;
    private String brand;
    private double cost;
    private double sale;

    public abstract void display();

    public Product(String name, double cost, double sale, String brand)
            throws LossProductException, InvalidProductException {
        if (sale < cost) throw new LossProductException("Cost of manufacturing too high");
        if (!"VVDN".equals(brand)) throw new InvalidProductException("Not a VVDN Product");
        this.name = name;
        this.cost = cost;
        this.sale = sale;
        this.brand = brand;
    }

    public double calculateProfit() {
        return sale - cost;
    }

    public String getDetails() {
        return "Name: " + name + ", Brand: " + brand + ", Cost: " + cost + ", Sale: " + sale;
    }
}
