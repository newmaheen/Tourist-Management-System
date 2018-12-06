
package touristmanagementandflightbooking;


public class Silver extends Custommer {
    
    public Silver(int id, String name, String address, String contact_no, String email) {
        super(id, name, address, contact_no, email);
    }

    @Override
    public void statement() {
        System.out.println("You always get 15% discount");    
    }
    
}
