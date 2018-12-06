
package touristmanagementandflightbooking;


public class Diamond extends Custommer {
    String partner;
    public Diamond(int id, String name, String address, String contact_no, String email,String partner) {
        super(id, name, address, contact_no, email);
        this.partner=partner;
    }

    @Override
    public void statement() {
        System.out.println("You always get 30% discount");    
    }
    public void Check_partner()
    {
        if(partner.equals("wife"))
        {
            System.out.println("You can get vip room");
        }
    }
}
