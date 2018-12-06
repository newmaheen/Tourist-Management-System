
package touristmanagementandflightbooking;

import java.util.*;


public class Local extends Travellers implements BuyTicket {
    
    public Local(int id, String name, String address, String contact_no, String email,double price) {
        super(id, name, address, contact_no, email,price);
    }

    @Override
    public void buy_ticket() {
      
        Scanner sc=new Scanner(System.in);
        System.out.println("How many ticket you want to buy?");
        int a= sc.nextInt();
        double c=getPrice()*a;
        System.out.println(c);  
    }

    @Override
    public void cancel_ticket() {
        System.out.println("you have charged 10%");
    }
    
}
