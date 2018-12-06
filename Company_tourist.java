
package touristmanagementandflightbooking;


public class Company_tourist extends Tourist {
    String position;
    public Company_tourist(int id, String name, String address, String contact_no, String email,String position) {
        super(id, name, address, contact_no, email);
        this.position=position;
        
    }
    public void company_offer()
    {
        if(position.equals("Manager"))
        {
            System.out.println("you get 50% discount.");
        }
         if(position.equals("Admin"))
        {
            System.out.println("you get 100% discount.");
        }
          if(position.equals("Stuff"))
        {
            System.out.println("you get 20% discount.");
        }
        
    }
    
}
