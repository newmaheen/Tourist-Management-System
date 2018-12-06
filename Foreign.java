
package touristmanagementandflightbooking;

import java.util.*;


public class Foreign extends Travellers implements BuyTicket {
    String country;
    public Foreign(int id, String name, String address, String contact_no, double price,String email,String country) {
        super(id, name, address, contact_no, email,price);
        this.country=country;
    }

    @Override
    public void buy_ticket() {
     double b;
        Scanner sc=new Scanner(System.in);
        System.out.println("How many ticket you want to buy?");
        int a= sc.nextInt();
        double c=getPrice()*a;
        b=(c*.10);
        double d=c+b;
        
        System.out.println(d);   
    }
    public void check_country()
    {
        if(country.equals ("uae"))
        {
            System.out.println("You can get VIP class seat");
        }
    }

    @Override
    public void cancel_ticket() {
        System.out.println("You have charged 20%");    
    }
    
}
