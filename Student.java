
package touristmanagementandflightbooking;

import java.util.*;
public class Student extends Travellers implements BuyTicket {
    String std_id;
    String institution;
    public Student(int id, String name, String address, String contact_no, String email,double price,String std_id,String institution) {
        super(id, name, address, contact_no, email,price);
        this.std_id=std_id;
        this.institution=institution;
    }

    @Override
    public void buy_ticket() {
        double b;
        Scanner sc=new Scanner(System.in);
        System.out.println("How many ticket you want to buy?");
        int a= sc.nextInt();
        double c=getPrice()*a;
        b=(c*.20);
        double d=c-b;
        
        System.out.println(d);
        
    }

    @Override
    public void cancel_ticket() {
        System.out.println("You can cancel your ticket without any charge");   
    }
    
}
