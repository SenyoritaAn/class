public class Bus
{
    private String numberPlate;
    private String color;
    private String route;
    private String customerName;
    private boolean availableStatus;
    private int rate;

    //constructor.
     public Bus(String numberPlate, String color, String route, String customerName, boolean availableStatus, int rate) {
        this.numberPlate = numberPlate;
        this.color = color;
        this.route = route;
        this.customerName = customerName;
        this.availableStatus = availableStatus;
        this.rate = rate;
    }

    public String getColor() {
        return color;
    }

    public int getRate() {
        return rate;
    }

    public void displayDescription() {
        System.out.println("Bus Number Plate: " + numberPlate);
        System.out.println("Color: " + color);
        System.out.println("Route: " + route);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Available: " + availableStatus);
        System.out.println("Rate: " + rate);
        System.out.println();
    }

}
package Week_12;
import java.util.ArrayList;

public class BusCompany
{
    private ArrayList<Bus> busList = new ArrayList();

    //new bus add.
    public void addBus(Bus b1) {
        busList.add(b1);
        System.out.println("Bus added successfully.");
    }

    //remove bus by index.
     public void removeBus(int index) {
        if (index >= 0 && index < busList.size()) {
            busList.remove(index);
            System.out.println("Bus removed successfully.");
        } else {
            System.out.println("Error: Invalid index!");
        }
    }

    //display all bus.
    public void displayBuses() {
        for (Bus bus : busList) {
            bus.displayDescription();
        }
    }

    //display bus with rate > 500.
     public void displayRateMoreThan500() {
        for (Bus bus : busList) {
            if (bus.getRate() > 500) {
                bus.displayDescription();
            }
        }
    }

    //display bus with red or blue.
     public void displayRedOrBlue() {
        for (Bus bus : busList) {
            if (bus.getColor().equals("red") || bus.getColor().equals("blue")) {
                bus.displayDescription();
            }
        }
    }
}

public class BusCompany
{
    private ArrayList<Bus> busList = new ArrayList();

    //new bus add.
    public void addBus(Bus b1) {
        busList.add(b1);
        System.out.println("Bus added successfully.");
    }

    //remove bus by index.
     public void removeBus(int index) {
        if (index >= 0 && index < busList.size()) {
            busList.remove(index);
            System.out.println("Bus removed successfully.");
        } else {
            System.out.println("Error: Invalid index!");
        }
    }

    //display all bus.
    public void displayBuses() {
        for (Bus bus : busList) {
            bus.displayDescription();
        }
    }

    //display bus with rate > 500.
     public void displayRateMoreThan500() {
        for (Bus bus : busList) {
            if (bus.getRate() > 500) {
                bus.displayDescription();
            }
        }
    }

    //display bus with red or blue.
     public void displayRedOrBlue() {
        for (Bus bus : busList) {
            if (bus.getColor().equals("red") || bus.getColor().equals("blue")) {
                bus.displayDescription();
            }
        }
    }
}


public class Main
{
     public static void main(String[] args) {

        BusCompany company = new BusCompany();

        Bus b1 = new Bus("1234", "Red", "Kathmandu to Pokhara", "Abhas", true, 600);
        Bus b2 = new Bus("5678", "Blue", "Butwal to Chitwan", "Ram", false, 450);
        Bus b3 = new Bus("9876", "Green", "Biratnagar to Itahari", "Diya", true, 700);

        company.addBus(b1);
        company.addBus(b2);
        company.addBus(b3);

        System.out.println("Buses: ");
        company.displayBuses();

        System.out.println("Buses with rate more than 500:");
        company.displayRateMoreThan500();

        System.out.println("Red or Blue buses:");
        company.displayRedOrBlue();

        company.removeBus(1);
        company.removeBus(5);
    }
}

