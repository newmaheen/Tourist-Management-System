
package touristmanagementandflightbooking;

public class Local_tourist extends Tourist {
    String Divition;
    public Local_tourist(int id, String name, String address, String contact_no, String email,String Divition) {
        super(id, name, address, contact_no, email);
        this.Divition=Divition;
    }
    public void check_divition()
    {
        if(Divition.equals("Dhaka"))
            System.out.println("You can buy any package.");
    }
    
}
