
package touristmanagementandflightbooking;

import java.util.Scanner;

public class Tourist {
 int id;
 String name;
 String address;
 String contact_no;
 String email;
 
 public Tourist(int id,String name,String address,String contact_no,String email)
 {
     this.id=id;
     this.name=name;
     this.address=address;
     this.contact_no=contact_no;
     this.email=email;
     
 }
 public void sesonal_discount(WinterPacage wp)
 {
    if(wp.name.equals("Sylhet"))
    {
        System.out.println("Every tourist get 5% discount");
    }
 }
  public void sesonal_discount(SummerPackage sp)
 {
    if(sp.name.equals("Coxbazar"))
    {
        System.out.println("Every tourist get 7% discount");
    }
 }
   public void sesonal_discount(SpecialPackage ssp)
 {
    if(ssp.name.equals("Sylhet"))
    {
        System.out.println("Every tourist get 3% discount");
    }
 }
   public void check_identity(String a)
   {
       System.out.println("Do you have NID?");
       Scanner sc=new Scanner(System.in);
       a=sc.nextLine();
       if(a.equals("no"))
       {
           System.out.println("You cant buy any package.");
       }
       else
       {
           System.out.println("You can buy any package.");
       }
       
   }

 
}
