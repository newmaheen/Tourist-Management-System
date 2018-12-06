
package touristmanagementandflightbooking;


public class FallPackage extends TourPackage implements TourLocation {
    String destination;
    //boolean id;
    public FallPackage(int id, String name, double price,String destination) {
        super(id, name, price);
        this.destination=destination;
    }
    public void Tour_Location()
    {
        System.out.println("Fall package have only sylhet divition tour.");
    }
    public void check_destination(Diamond d)
    {
      if(d.getID()==150 && destination.equals("Dhaka"))  
      {
          System.out.println("You will awarded by us!!!");
      }
    }
            
    
}
