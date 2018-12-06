
package touristmanagementandflightbooking;

import java.util.Scanner;

public abstract class Travellers {
 int id;
 String name;
 String address;
 String contact_no;
 String email;
 private double price;
 public Travellers(int id,String name,String address,String contact_no,String email,double price)
 {
     this.id=id;
     this.name=name;
     this.address=address;
     this.contact_no=contact_no;
     this.email=email;
     this.price=price;
 }
 public double getPrice()
 {
     return price;
 }
  public abstract void cancel_ticket();
  public void check_price(String type)
  {
      if(type.equals("student"))
      {
          System.out.println("You get 20% discount");
      }
       if(type.equals("local"))
      {
          System.out.println("You get 0% discount");
      }
        if(type.equals("foreigner"))
      {
          System.out.println("You have bear 20% extra charge");
      }
  }
  public void check_fare()
  {
      String from;
      String to;
      System.out.println("From: ");
      Scanner sc= new Scanner(System.in);
      from=sc.nextLine();
      System.out.println("To: ");
      to=sc.nextLine();
      if(from.equals("Dhaka")&& to.equals("Sylhet"))
      {
          System.out.println("Economic fare 2000, Business 4000");
      }
       if(from.equals("USA")&& to.equals("Dhaka"))
      {
          System.out.println("Economic fare $800, Business $1200");
      }
      
  }
}
