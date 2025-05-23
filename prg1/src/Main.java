
public class Main {
    public static void main(String[] args) {
        try {
            collab obj = new collab("Cloud software", 37000, 35000, "VVDN");
            System.out.println(obj.getDetails());
            System.out.println("Profit: " + obj.calculateProfit());
            obj.display();
        } catch (LossProductException | InvalidProductException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Program execution completed.");
        }
    }
}
