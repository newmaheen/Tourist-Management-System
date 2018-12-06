
package touristmanagementandflightbooking;


public class Golden extends Custommer {
    int number;
    public Golden(int id, String name, String address, String contact_no, String email,int number) {
        super(id, name, address, contact_no, email);
        this.number=number;
    }

    @Override
    public void statement() {
        System.out.println("You always get 20% discount");    
    }
    public void check_number()
    {
        if(number>5)
        {
            System.out.println("You get extra facilities");
        }
    }
    
}
