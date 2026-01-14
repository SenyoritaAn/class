public class Order
{
    private int orderId;
    private String customerName;
    private double amount;
    //Constructor.
    public Order(int orderId , String customerName , double amount){
        this.orderId = orderId;
        this.customerName = customerName;
        this.amount = amount;
    }
    //Getter / Setter.
    public int getorderId(){
        return orderId;
    }
    public void setorderId(int getorderId){
        this.orderId = orderId;
    }

    public String getcustomerName(){
        return customerName;
    }
    public void setcustomerName(String customerName){
        this.customerName = customerName;
    }

    public double getamount(){
        return amount;
    }
    public void setamount(double getamount){
        this.amount = amount;
    }

    public double calculateFinalAmount(){
        return amount;
    }

    public String toString(){
        return "Order ID : " + orderId + "Customer Name : " + customerName + "Amount :" +amount;
    }
}
package Week_10;

public class NormalOrder extends Order
{
    public NormalOrder(int orderId , String customerName , double amount){
        super(orderId , customerName , amount);
    }

    @Override
    public double calculateFinalAmount(){
        return super.calculateFinalAmount();
    }

    //Overload.
    public double calculateFinalAmount(double discountAmount){
        return calculateFinalAmount() - discountAmount;
    }
}
package Week_10;

public class PremiumOrder extends Order
{
    public PremiumOrder(int orderId , String customerName , double amount){
        super(orderId , customerName , amount);
    }

    @Override
    public double calculateFinalAmount(){
        double premium = getamount() * 0.10;
        return super.calculateFinalAmount() + premium;
    }

    //Overload.
    public double calculateFinalAmount(double discountAmount){
        return calculateFinalAmount() - discountAmount;
    }
}
package Week_10;

public class OrderApp
{
    public static void main(String [] args){
        NormalOrder n1 = new NormalOrder(101 , "Abdica" , 10000);
        PremiumOrder p1 = new PremiumOrder(39332 , "Abhas" , 25000);

        //Normal Order.
        System.out.println("---Invoice for Normal Order---");
        System.out.println("Order Id: " +n1.getorderId());
        System.out.println("Customer Name: " +n1.getcustomerName());
        System.out.println("Amount : " +n1.getamount());
        System.out.println("Final Amount (with delivery): " +n1.calculateFinalAmount());
        System.out.println("Final Amount (with deliver and discount): " +n1.calculateFinalAmount(500));

        System.out.println();

        //Premium Order.
        System.out.println("---Invoice for Premium Order---");
        System.out.println("Order Id: " +p1.getorderId());
        System.out.println("Customer Name: " +p1.getcustomerName());
        System.out.println("Amount : " +p1.getamount());
        System.out.println("Final Amount : " +p1.calculateFinalAmount());
        System.out.println("Final Amount (with discount): " +p1.calculateFinalAmount(1000));
    }
}
