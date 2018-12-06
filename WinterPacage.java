
package touristmanagementandflightbooking;


public class WinterPacage extends TourPackage implements TourLocation {
    String promo;
   // boolean id;
    public WinterPacage(int id, String name, double price,String promo) {
        super(id, name, price);
        this.promo=promo;
    }

    @Override
    public void Tour_Location() {
        System.out.println("Winter package cover all BD.");
    }
    
}
