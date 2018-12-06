
package touristmanagementandflightbooking;

public class SummerPackage extends TourPackage implements TourLocation {
    String vehicles;
    //boolean id;
    public SummerPackage(int id, String name, double price,String vehicles) {
        super(id, name, price);
        this.vehicles=vehicles;
    }

    @Override
    public void Tour_Location() {
        System.out.println("Summer package have only Chattagram divition tour.");
    }
    
}
