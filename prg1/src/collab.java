public class collab  extends Product{
    String patner="SNU";

    public collab(String name, double cost, double sale, String brand) throws LossProductException, InvalidProductException {
        super(name, cost, sale, brand);
    }

    public void display(){
        System.out.println("collab:"+patner);
    }
}
